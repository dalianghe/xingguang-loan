package com.xingguang.utils.cell.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.utils.cell.entity.JxlContactListEntity;
import com.xingguang.utils.cell.mapper.JxlContactListMapper;
import com.xingguang.utils.cell.service.IJxlContactListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  13:43
 * @Version v1.0.0
 */
@Service
public class JxlContactListServiceImpl implements IJxlContactListService{

    @Autowired
    private JxlContactListMapper contactListMapper;

    @Override
    @Transactional
    public void deleteContactListByRptId(Long rptId) throws Exception {
        contactListMapper.deleteContactListByRptId(rptId);
    }

    @Override
    @Transactional
    public void insertContactList(List<JxlContactListEntity> list) throws Exception {
        contactListMapper.insertContactList(list);
    }

    @Override
    @Transactional
    public List<JxlContactListEntity> addContactList(Long oldRptId, Long newRptId, String json) throws Exception {

        List<JxlContactListEntity> list = JSON.parseArray(json , JxlContactListEntity.class);
        if(list != null){
            this.deleteContactListByRptId(oldRptId);
            for(JxlContactListEntity entity : list){
                entity.setRptId(newRptId);
            }
            this.insertContactList(list);
        }
        return null;
    }
}
