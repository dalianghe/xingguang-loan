package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.entity.CreditApplyExample;
import com.xingguang.customer.credit.mapper.CreditApplyMapper;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.link.service.ICusUserLinkService;
import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.interfacelog.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.utils.interfacelog.service.ISysInterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
    public void create(CreditApply creditApply, CreditApplyParam creditApplyParam) {
        WorkUserInfo workUserInfo = this.workUserInfoService.getWorkUserByCusUserId(creditApply.getCusUserId());
        String nowDate = LocalDate.now().format(this.formatter);
        creditApply.setApplyNo(nowDate + workUserInfo.getCityId());
        creditApply.setWorkUserId(workUserInfo.getId());
        creditApply.setWorkUserName(workUserInfo.getName());
        this.creditApplyMapper.insertSelectiveApplyNo(creditApply);
        SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
        sysInterfaceLogWithBLOBs.setId(creditApplyParam.getAppId());
        sysInterfaceLogWithBLOBs.setBizId(creditApply.getId());
        this.sysInterfaceLogService.update(sysInterfaceLogWithBLOBs);
        CusUserInfo cusUserInfo = new CusUserInfo();
        cusUserInfo.setId(creditApply.getCusUserId());
        cusUserInfo.setStatus(20);
        if (creditApplyParam.getWorkUserId() != null) {
            workUserInfo = this.workUserInfoService.getWorkUserInfoById(creditApplyParam.getWorkUserId());
            if (workUserInfo == null) {
                throw new CustomException("业务员不存在");
            }
            cusUserInfo.setWorkUserId(creditApplyParam.getWorkUserId());
            cusUserInfo.setWorkUserName(workUserInfo.getName());
        }
        cusUserInfoService.update(cusUserInfo);
    }

    @Override
    @Transactional(readOnly = true)
    public CreditApply getByUserId(Long userId) {
        CreditApplyExample example = new CreditApplyExample();
        example.createCriteria().andCusUserIdEqualTo(userId);
        example.setLimit(1);
        example.setOrderByClause("create_time desc");
        List<CreditApply> list = this.creditApplyMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }
}
