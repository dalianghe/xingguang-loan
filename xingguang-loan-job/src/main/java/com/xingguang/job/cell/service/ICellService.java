package com.xingguang.job.cell.service;

import com.xingguang.job.cell.entity.SysInterfaceLog;
import com.xingguang.job.cell.entity.SysInterfaceLogWithBLOBs;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  11:06
 * @Version v1.0.0
 */
public interface ICellService {

    public List<SysInterfaceLog> findTodoReportList() throws Exception;

    public void updateSysInterfaceLog(SysInterfaceLogWithBLOBs sysInterfaceLog) throws Exception;

    public void pullReport(String accessToken) throws Exception;

}
