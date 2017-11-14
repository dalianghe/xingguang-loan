package com.xingguang.job;

import com.xingguang.job.cell.service.ICellService;
import com.xingguang.job.overdue.service.IOverdueService;
import com.xingguang.utils.cell.CellInitRunner;
import com.xingguang.utils.cell.CellUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  18:18
 * @Version v1.0.0
 */
@Component
public class ScheduledTask {

    Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private CellUtils cellUtils;
    @Autowired
    private ICellService cellService;
    @Autowired
    private IOverdueService overdueService;

    @Scheduled(cron = "0 0/5 * * * ?")
    public void pullJxlReportJob() throws Exception {
        logger.info("拉取聚信立报告，===>"+String.format("开始时间：%s", new Date()));
        String token = CellInitRunner.map.get("token");
        if(token==null){
            token = cellUtils.getAccessToken();
            logger.info("获取聚信立访问token，===>"+String.format("token：%s", token));
            CellInitRunner.map.put("token",token);
        }else{
            token = CellInitRunner.map.get("token");
            logger.info("从存储中获取token，===>"+String.format("token：%s", token));
        }
        if(null != token){
            logger.info("拉取报告开始，===>"+String.format("start：%s", new Date()));
            cellService.pullReport(token);
            logger.info("拉取报告结束，===>"+String.format("end：%s", new Date()));
        }else{
            logger.info("连接聚信立失败，5分钟后尝试重新连接。。。");
        }
        logger.info("拉取聚信立报告，===>"+String.format("结束时间：%s", new Date()));
    }

    @Scheduled(cron = "0 0 0 * * ? *")
    public void overdueJob() throws Exception {
        logger.info("逾期跑批任务，===>"+String.format("开始时间：%s", new Date()));
        overdueService.updateOverdueInfo();
        logger.info("逾期跑批任务，===>"+String.format("结束时间：%s", new Date()));
    }

}
