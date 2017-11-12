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
        String token = null== CellInitRunner.map.get("token") ? cellUtils.getAccessToken() : CellInitRunner.map.get("token");
        if(null != token){
            cellService.pullReport(token);
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
