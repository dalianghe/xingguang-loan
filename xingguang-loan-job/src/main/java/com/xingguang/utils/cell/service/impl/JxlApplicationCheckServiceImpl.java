package com.xingguang.utils.cell.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.cell.entity.*;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckCellPhoneMapper;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckIdCardMapper;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckMapper;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckUsernameMapper;
import com.xingguang.utils.cell.service.IJxlApplicationCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  16:26
 * @Version v1.0.0
 */
@Service
public class JxlApplicationCheckServiceImpl implements IJxlApplicationCheckService{

    @Autowired
    private JxlApplicationCheckMapper jxlApplicationCheckMapper;
    @Autowired
    private JxlApplicationCheckUsernameMapper jxlApplicationCheckUsernameMapper;
    @Autowired
    private JxlApplicationCheckIdCardMapper jxlApplicationCheckIdCardMapper;
    @Autowired
    private JxlApplicationCheckCellPhoneMapper jxlApplicationCheckCellPhoneMapper;
    @Override
    @Transactional
    public void deleteApplicationCheckByRptId(Long rptId) throws Exception {
        jxlApplicationCheckMapper.deleteApplicationCheck(rptId);
    }

    @Override
    @Transactional
    public void insertApplicationCheck(List<JxlApplicatinoCheckEntity> list) throws Exception {
        jxlApplicationCheckMapper.insertApplicationCheck(list);
    }

    @Override
    @Transactional
    public List<JxlApplicatinoCheckEntity> addApplicationCheck(Long oldRptId, Long newRptId, JSONArray json) throws Exception {
        // 删除
        this.deleteApplicationCheckByRptId(oldRptId);
        // 插入
        List<JxlApplicatinoCheckEntity> list = new ArrayList<>();
        for(int i=0;i<json.size();i++){
            Object obj = json.get(i);
            JSONObject jsonObject = JSON.parseObject(obj.toString());
            String appPoint = jsonObject.getString("app_point");
            JxlApplicatinoCheckEntity checkEntity = new JxlApplicatinoCheckEntity();
            checkEntity.setRptId(newRptId);
            checkEntity.setAppPoint(appPoint);
            list.add(checkEntity);
            JSONObject checkPoints = JSON.parseObject(jsonObject.getString("check_points"));
            if("user_name".equals(appPoint)){
                JxlApplicationCheckUsernameEntity usernameEntity = new JxlApplicationCheckUsernameEntity();
                usernameEntity.setRptId(newRptId);
                usernameEntity.setKeyValue(checkPoints.getString("key_value"));
                jxlApplicationCheckUsernameMapper.deleteCheckUsernameByRptId(oldRptId);
                jxlApplicationCheckUsernameMapper.insertCheckUsername(usernameEntity);
            }else if("id_card".equals(appPoint)){
                JxlApplicationCheckIdCardEntity idCardEntity = new JxlApplicationCheckIdCardEntity();
                idCardEntity.setRptId(newRptId);
                idCardEntity.setKeyValue(checkPoints.getString("key_value"));
                idCardEntity.setGender(checkPoints.getString("gender"));
                idCardEntity.setAge(checkPoints.getString("age"));
                idCardEntity.setProvince(checkPoints.getString("province"));
                idCardEntity.setCity(checkPoints.getString("city"));
                idCardEntity.setRegion(checkPoints.getString("region"));
                jxlApplicationCheckIdCardMapper.deleteCheckIdCardByRptId(oldRptId);
                jxlApplicationCheckIdCardMapper.insertCheckIdCard(idCardEntity);
            }else if("cell_phone".equals(appPoint)){
                JxlApplicationCheckCellPhoneEntity checkCellPhoneEntity = new JxlApplicationCheckCellPhoneEntity();
                checkCellPhoneEntity.setRptId(newRptId);
                checkCellPhoneEntity.setKeyValue(checkPoints.getString("key_value"));
                checkCellPhoneEntity.setWebsite(checkPoints.getString("website"));
                checkCellPhoneEntity.setReliability(checkPoints.getString("reliability"));
                checkCellPhoneEntity.setRegTime(checkPoints.getString("reg_time"));
                checkCellPhoneEntity.setCheckName(checkPoints.getString("check_name"));
                checkCellPhoneEntity.setCheckIdcard(checkPoints.getString("check_idcard"));
                checkCellPhoneEntity.setCheckEbusiness(checkPoints.getString("check_ebusiness"));
                jxlApplicationCheckCellPhoneMapper.deleteCheckCellPhoneByRptId(oldRptId);
                jxlApplicationCheckCellPhoneMapper.insertCheckCellPhone(checkCellPhoneEntity);
            }
        }
        this.insertApplicationCheck(list);

        return list;
    }
}
