package com.xingguang.cell.controller;

import com.xingguang.cell.entity.JxlCellBehaviorEntity;
import com.xingguang.cell.entity.JxlContactListEntity;
import com.xingguang.cell.entity.JxlContactRegionEntity;
import com.xingguang.cell.service.ICellReportService;
import com.xingguang.common.beans.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  14:06
 * @Version v1.0.0
 */
@RestController
public class CellReportController {

    @Autowired
    private ICellReportService cellReportService;

    @RequestMapping(value = "/cell/report/behavior/{bizId}" , method = RequestMethod.GET)
    public ResultBean<?> getBehaviores(@PathVariable Long bizId)throws Exception{
        ResultBean<?> resultBean = null;
        List<JxlCellBehaviorEntity> list = cellReportService.getCellBehaviorByBizId(bizId);
        resultBean = new ResultBean<>(list);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

    @RequestMapping(value = "/cell/report/region/{bizId}" , method = RequestMethod.GET)
    public ResultBean<?> getContactRegion(@PathVariable Long bizId)throws Exception{
        ResultBean<?> resultBean = null;
        List<JxlContactRegionEntity> list = cellReportService.getContactRegionByBizId(bizId);
        resultBean = new ResultBean<>(list);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

    @RequestMapping(value = "/cell/report/list/{bizId}" , method = RequestMethod.GET)
    public ResultBean<?> getContactList(@PathVariable Long bizId)throws Exception{
        ResultBean<?> resultBean = null;
        List<JxlContactListEntity> list = cellReportService.getContactListByBizId(bizId);
        resultBean = new ResultBean<>(list);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }
}
