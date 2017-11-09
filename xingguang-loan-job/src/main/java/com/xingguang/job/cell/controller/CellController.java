package com.xingguang.job.cell.controller;

import com.xingguang.job.cell.service.ICellService;
import com.xingguang.utils.cell.CellInitRunner;
import com.xingguang.utils.cell.CellUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  11:06
 * @Version v1.0.0
 */
@RestController
public class CellController {

    @Autowired
    private CellUtils cellUtils;

    @Autowired
    private ICellService cellService;

    @RequestMapping(value = "/cell/job" , method = RequestMethod.GET)
    public void cellJob() throws Exception{
        String token = null==CellInitRunner.map.get("token") ? cellUtils.getAccessToken() : CellInitRunner.map.get("token");
        if(null != token){
            cellService.pullReport(token);
        }
    }

}
