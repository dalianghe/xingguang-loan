package com.xingguang.job;

import com.xingguang.job.cell.service.ICellService;
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

    @Scheduled(cron = "0 0/5 * * * ?")
    public void reportCurrentTimeCron() throws Exception {
        logger.info("拉取聚信立报告，===>"+String.format("开始时间：%s", new Date()));
        String token = null== CellInitRunner.map.get("token") ? cellUtils.getAccessToken() : CellInitRunner.map.get("token");
        if(null != token){
            cellService.pullReport(token);
        }
        logger.info("拉取聚信立报告，===>"+String.format("结束时间：%s", new Date()));
    }

}
