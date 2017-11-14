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
        logger.info("pull jxl report job,===>"+String.format("start time:%s", new Date()));
        String token = CellInitRunner.map.get("token");
        if(token==null){
            token = cellUtils.getAccessToken();
            logger.info("get jxl access token,===>"+String.format("token:%s", token));
            CellInitRunner.map.put("token",token);
        }else{
            token = CellInitRunner.map.get("token");
            logger.info("get access token from memory,===>"+String.format("token:%s", token));
        }
        if(null != token){
            logger.info("pull report start,===>"+String.format("start time:%s", new Date()));
            cellService.pullReport(token);
            logger.info("pull report end,===>"+String.format("end:%s", new Date()));
        }else{
            logger.info("connect jxl fail，try again 5 minutes later... ...");
        }
        logger.info("pull jxl report job,===>"+String.format("end time:%s", new Date()));
    }

    @Scheduled(cron = "0 0 0 1/1 * ? ")
    public void overdueJob() throws Exception {
        logger.info("orverdue job,===>"+String.format("start time:%s", new Date()));
        overdueService.updateOverdueInfo();
        logger.info("orverdue job，===>"+String.format("end time:%s", new Date()));
    }

}
