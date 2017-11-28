package com.xingguang.job.cell.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.job.cell.entity.SysInterfaceLog;
import com.xingguang.job.cell.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.job.cell.mapper.SysInterfaceLogMapper;
import com.xingguang.job.cell.service.ICellService;
import com.xingguang.utils.cell.CellUtils;
import com.xingguang.utils.cell.entity.JxlReportEntity;
import com.xingguang.utils.cell.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  11:26
 * @Version v1.0.0
 */
@Service
public class CellServiceImpl implements ICellService {

    @Autowired
    private SysInterfaceLogMapper sysInterfaceLogMapper;
    @Autowired
    private CellUtils cellUtils;
    @Autowired
    private IJxlReportService jxlReportService;
    @Autowired
    private IJxlCellBehaviorService cellBehaviorService;
    @Autowired
    private IJxlContactRegionService contactRegionService;
    @Autowired
    private IJxlContactListService contactListService;
    @Autowired
    private IJxlApplicationCheckService applicationCheckService;
    @Autowired
    private IJxlBehaviorCheckService behaviorCheckService;

    @Override
    public List<SysInterfaceLog> findTodoReportList() throws Exception {
        return sysInterfaceLogMapper.findTodoReportList();
    }

    @Override
    @Transactional
    public void updateSysInterfaceLog(SysInterfaceLogWithBLOBs sysInterfaceLog) throws Exception {
        sysInterfaceLogMapper.updateSysInterfaceLog(sysInterfaceLog);
    }

    @Override
    @Transactional
    public void pullReport(String accessToken) throws Exception {
        // 获取未处理列表
        List<SysInterfaceLog> todoList = this.findTodoReportList();
        for(SysInterfaceLog log : todoList){
            String data = cellUtils.getReportData(accessToken,log.getName(),log.getIdNo(),log.getPhone());
            if(data == null){
                continue;
            }
            // 解析报告入库
            JSONObject jxlReport = JSON.parseObject(data);
            JSONObject reportData = JSON.parseObject(jxlReport.getString("report_data"));
            JxlReportEntity oldEntity = jxlReportService.selectJxlReportByBizId(log.getBizId());
            Long oldId = oldEntity==null ? null : oldEntity.getId();
            JxlReportEntity reportEntity = jxlReportService.addJxlReport(log.getBizId() , JSON.parseObject(reportData.getString("report")));
            cellBehaviorService.addCellBehavior(oldId , reportEntity.getId() , reportData.getJSONArray("cell_behavior"));
            contactRegionService.addContactRegion(oldId , reportEntity.getId() , reportData.getString("contact_region"));
            contactListService.addContactList(oldId , reportEntity.getId() , reportData.getString("contact_list"));
            applicationCheckService.addApplicationCheck(oldId , reportEntity.getId() , reportData.getJSONArray("application_check"));
            behaviorCheckService.addBehaviorCheck(oldId , reportEntity.getId() , reportData.getString("behavior_check"));
            // 更新状态
            SysInterfaceLogWithBLOBs bean = new SysInterfaceLogWithBLOBs();
            bean.setId(log.getId());
            bean.setStatus(2);
            bean.setReceiveData(data);
            bean.setUpdateTime(new Date());
            this.updateSysInterfaceLog(bean);
        }
    }

}
