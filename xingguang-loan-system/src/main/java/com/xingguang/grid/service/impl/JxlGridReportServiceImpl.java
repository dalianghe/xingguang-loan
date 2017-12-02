package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.grid.entity.*;
import com.xingguang.grid.mapper.JxlGridReportMapper;
import com.xingguang.grid.service.*;
import com.xingguang.utils.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  11:19
 * @Version v1.0.0
 */
@Service
public class JxlGridReportServiceImpl implements IJxlGridReportService {

    protected static final Logger logger = LogManager.getLogger(JxlGridReportServiceImpl.class);

    @Autowired
    private JxlGridReportMapper gridReportMapper;
    @Autowired
    private IJxlGridUserBasicService gridUserBasicService;
    @Autowired
    private IJxlGridUserGrayService gridUserGrayService;
    @Autowired
    private IJxlGridUserRegisterOrgsService gridUserRegisterOrgsService;
    @Autowired
    private IJxlGridUserBlackListService gridUserBlackListService;
    @Autowired
    private IJxlGridPhoneAppliedInOrgsService gridPhoneAppliedInOrgsService;
    @Autowired
    private IJxlGridPhoneWithOtherIdcardsService gridPhoneWithOtherIdcardsService;
    @Autowired
    private IJxlGridPhoneWithOtherNamesService gridPhoneWithOtherNamesService;
    @Autowired
    private IJxlGridIdcardAppliedInOrgsService gridIdcardAppliedInOrgsService;
    @Autowired
    private IJxlGridIdcardWithOtherNamesService gridIdcardWithOtherNamesService;
    @Autowired
    private IJxlGridIdcardWithOtherPhonesService gridIdcardWithOtherPhonesService;
    @Autowired
    private IJxlGridConsumerLabelService gridConsumerLabelService;

    @Override
    @Transactional
    public boolean resolveGridReport(Long bizId,String json) throws Exception {
        logger.info("进入聚信立蜜罐报告解析方法，解析json="+json);
        boolean result = false;
        JSONObject object = JSON.parseObject(json);
        String reportCode = object.getString("code");
        if("MIGUAN_SEARCH_SUCCESS".equals(reportCode)){
            JSONObject data = JSON.parseObject(object.getString("data"));
            JxlGridReportEntity gridReportEntity = JSON.parseObject(object.getString("data") , JxlGridReportEntity.class);
            gridReportEntity.setBizId(bizId);
            gridReportEntity.setUpdateTime(DateUtils.convertTimeStr(gridReportEntity.getUpdateTime()));
            gridReportEntity.setCreateTime(new Date());
            this.addGridReport(bizId , gridReportEntity);
            // 用户基本信息
            JxlGridUserBasicEntity gridUserBasicEntity = JSON.parseObject(data.getString("user_basic") , JxlGridUserBasicEntity.class);
            gridUserBasicEntity.setBizId(bizId);
            gridUserBasicEntity.setGridId(gridReportEntity.getId());
            gridUserBasicService.addUserBasic(bizId , gridUserBasicEntity);
            // 用户灰度分数信息
            String userGrayJson = data.getString("user_gray");
            gridUserGrayService.addGridUserGray(bizId , gridReportEntity.getId() , userGrayJson);
            // 用户注册信息情况
            String userRegisterOrgs = data.getString("user_register_orgs");
            gridUserRegisterOrgsService.addGridUserRegisterOrgs(bizId , gridReportEntity.getId() , userRegisterOrgs);
            // 黑名单信息
            String userBlacklist = data.getString("user_blacklist");
            gridUserBlackListService.addGridUserBlackList(bizId , gridReportEntity.getId() , userBlacklist);
            // 手机号码存疑
            JSONObject userPhoneSuspicion = JSON.parseObject(data.getString("user_phone_suspicion"));
            String phoneAppliedInOrgs = userPhoneSuspicion.getString("phone_applied_in_orgs");
            gridPhoneAppliedInOrgsService.addPhoneAppliedInOrgs(bizId , gridReportEntity.getId() , phoneAppliedInOrgs);
            String phoneWithOtherIdcards = userPhoneSuspicion.getString("phone_with_other_idcards");
            gridPhoneWithOtherIdcardsService.addPhoneWithOtherIdcards(bizId, gridReportEntity.getId() , phoneWithOtherIdcards);
            String phoneWithOtherNames = userPhoneSuspicion.getString("phone_with_other_names");
            gridPhoneWithOtherNamesService.addPhoneWithOtherNames(bizId, gridReportEntity.getId(), phoneWithOtherNames);
            // 身份证号码存疑
            JSONObject userIdcardSuspicion = JSON.parseObject(data.getString("user_idcard_suspicion"));
            String idcardAppliedInOrgs = userIdcardSuspicion.getString("idcard_applied_in_orgs");
            gridIdcardAppliedInOrgsService.addIdcardAppliedInOrgs(bizId, gridReportEntity.getId(),idcardAppliedInOrgs);
            String idcardWithOtherNames = userIdcardSuspicion.getString("idcard_with_other_names");
            gridIdcardWithOtherNamesService.addIdcardWithOtherNames(bizId, gridReportEntity.getId(),idcardWithOtherNames);
            String idcardWithOtherPhones = userIdcardSuspicion.getString("idcard_with_other_phones");
            gridIdcardWithOtherPhonesService.addIdcardWithOtherPhones(bizId, gridReportEntity.getId() , idcardWithOtherPhones);

            // 消费标签信息
            JxlGridConsumerLabelEntity gridConsumerLabelEntity = JSON.parseObject(data.getString("consumer_label") , JxlGridConsumerLabelEntity.class);
            gridConsumerLabelEntity.setBizId(bizId);
            gridConsumerLabelEntity.setGridId(gridReportEntity.getId());
            gridConsumerLabelService.addConsumerLabel(bizId , gridConsumerLabelEntity);
            result = true;
        }
        logger.info("聚信立蜜罐报告解析方法结束!");
        return result;
    }

    @Override
    public JxlGridReportEntity selectGridReportByBizId(Long bizId) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public void deleteGridReportByBizId(Long bizId) throws Exception {
        gridReportMapper.deleteGridReportByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertGridReport(JxlGridReportEntity entity) throws Exception {
        gridReportMapper.insertGridReport(entity);
    }

    @Override
    @Transactional
    public JxlGridReportEntity addGridReport(Long oldBizId, JxlGridReportEntity entity) throws Exception {
        this.deleteGridReportByBizId(oldBizId);
        this.insertGridReport(entity);
        return entity;
    }
}
