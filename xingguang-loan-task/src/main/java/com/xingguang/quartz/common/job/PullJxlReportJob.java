package com.xingguang.quartz.common.job;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  16:47
 * @Version v1.0.0
 */
public class PullJxlReportJob implements Job {

    Logger logger = LogManager.getLogger(getClass());

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("拉取聚信立报告===>JobName: {}", context.getJobDetail().getKey().getName());
        String url = "http://localhost:8081/cell/job";
    }
}
