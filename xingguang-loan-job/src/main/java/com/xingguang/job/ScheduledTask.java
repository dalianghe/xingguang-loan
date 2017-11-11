package com.xingguang.job;

import com.xingguang.job.cell.service.ICellService;
import com.xingguang.utils.cell.CellInitRunner;
import com.xingguang.utils.cell.CellUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  18:18
 * @Version v1.0.0
 */
@Component
public class ScheduledTask {

    private Integer count2 = 1;

    @Autowired
    private CellUtils cellUtils;
    @Autowired
    private ICellService cellService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void reportCurrentTimeCron() throws Exception {
        System.out.println(String.format("+++第%s次执行", count2++));
        String token = null== CellInitRunner.map.get("token") ? cellUtils.getAccessToken() : CellInitRunner.map.get("token");
        if(null != token){
            cellService.pullReport(token);
        }
    }

}
