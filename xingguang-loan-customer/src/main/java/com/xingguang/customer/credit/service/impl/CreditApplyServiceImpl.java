package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.mapper.CreditApplyMapper;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.link.service.ICusUserLinkService;
import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
import com.xingguang.utils.interfacelog.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.utils.interfacelog.service.ISysInterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CreditApplyServiceImpl implements ICreditApplyService {

    @Autowired
    private CreditApplyMapper creditApplyMapper;
    @Autowired
    private ICusUserInfoService cusUserInfoService;
    @Autowired
    private ICusUserLinkService cusUserLinkService;
    @Autowired
    private IWorkUserInfoService workUserInfoService;
    @Autowired
    private ISysInterfaceLogService sysInterfaceLogService;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdd");

    @Override
    public void create(CreditApply creditApply, Long appId) {
        WorkUserInfo workUserInfo = this.workUserInfoService.getWorkUserByCusUserId(creditApply.getCusUserId());
        String nowDate = LocalDate.now().format(this.formatter);
        creditApply.setApplyNo(nowDate + workUserInfo.getCityId());
        creditApply.setWorkUserId(workUserInfo.getId());
        creditApply.setWorkUserName(workUserInfo.getName());
        this.creditApplyMapper.insertSelectiveApplyNo(creditApply);
        SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
        sysInterfaceLogWithBLOBs.setId(appId);
        sysInterfaceLogWithBLOBs.setBizId(creditApply.getId());
        this.sysInterfaceLogService.update(sysInterfaceLogWithBLOBs);
    }

}
