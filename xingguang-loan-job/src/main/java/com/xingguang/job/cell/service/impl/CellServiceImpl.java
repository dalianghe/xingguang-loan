package com.xingguang.job.cell.service.impl;

import com.xingguang.job.cell.entity.SysInterfaceLog;
import com.xingguang.job.cell.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.job.cell.mapper.SysInterfaceLogMapper;
import com.xingguang.job.cell.service.ICellService;
import com.xingguang.utils.cell.CellUtils;
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

        List<SysInterfaceLog> todoList = this.findTodoReportList();
        for(SysInterfaceLog log : todoList){
            String data = cellUtils.getReportData(accessToken,log.getName(),log.getIdNo(),log.getPhone());
            if(data == null){
                continue;
            }
            SysInterfaceLogWithBLOBs bean = new SysInterfaceLogWithBLOBs();
            bean.setId(log.getId());
            bean.setStatus(2);
            bean.setReceiveData(data);
            bean.setUpdateTime(new Date());
            this.updateSysInterfaceLog(bean);
        }

    }

}
