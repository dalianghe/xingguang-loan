package com.xingguang.quartz.common.job;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Description 逾期还款定时任务
 * @Author hedaliang
 * @Date 2017/11/1  16:13
 * @Version v1.0.0
 */
public class OverdueRepymntJob implements Job {
    Logger logger = LogManager.getLogger(getClass());

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("逾期还款定时任务===>JobName: {}", context.getJobDetail().getKey().getName());
    }
}
