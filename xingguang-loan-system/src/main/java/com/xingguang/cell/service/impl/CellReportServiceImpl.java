package com.xingguang.cell.service.impl;

import com.xingguang.cell.entity.*;
import com.xingguang.cell.mapper.*;
import com.xingguang.cell.service.ICellReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  14:05
 * @Version v1.0.0
 */
@Service
public class CellReportServiceImpl implements ICellReportService {

    @Autowired
    private JxlCellBehaviorMapper cellBehaviorMapper;
    @Autowired
    private JxlContactRegionMapper contactRegionMapper;
    @Autowired
    private JxlContactListMapper contactListMapper;
    @Autowired
    private JxlApplicationCheckUsernameMapper checkUsernameMapper;
    @Autowired
    private JxlApplicationCheckCellPhoneMapper checkCellPhoneMapper;
    @Autowired
    private JxlApplicationCheckIdCardMapper checkIdCardMapper;
    @Autowired
    private JxlBehaviorCheckMapper behaviorCheckMapper;

    @Override
    public List<JxlCellBehaviorEntity> getCellBehaviorByBizId(Long bizId) throws Exception {
        return cellBehaviorMapper.getCellBehaviorByBizId(bizId);
    }

    @Override
    public List<JxlContactRegionEntity> getContactRegionByBizId(Long bizId) throws Exception {
        return contactRegionMapper.getContactRegionByBizId(bizId);
    }

    @Override
    public List<JxlContactListEntity> getContactListByBizId(Long bizId) throws Exception {
        return contactListMapper.getContactListByBizId(bizId);
    }

    @Override
    public JxlApplicationCheckUsernameEntity getApplicationCheckUserNameByBizId(Long bizId) throws Exception {
        return checkUsernameMapper.findCheckUsernameByBizId(bizId);
    }

    @Override
    public JxlApplicationCheckCellPhoneEntity getApplicationCheckCellPhoneByBizId(Long bizId) throws Exception {
        return checkCellPhoneMapper.findCheckCellPhoneByBizId(bizId);
    }

    @Override
    public JxlApplicationCheckIdCardEntity getApplicationCheckIdCardByBizId(Long bizId) throws Exception {
        return checkIdCardMapper.findCheckIdCardByBizId(bizId);
    }

    @Override
    public List<JxlBehaviorCheckEntity> getBehaviorCheckByBizId(Long bizId) throws Exception {
        return behaviorCheckMapper.getBehaviorCheckByBizId(bizId);
    }
}
