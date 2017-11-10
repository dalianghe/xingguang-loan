package com.xingguang.utils.cell.service;

import com.xingguang.utils.cell.entity.JxlContactListEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  13:42
 * @Version v1.0.0
 */
public interface IJxlContactListService {

    public void deleteContactListByRptId(Long rptId) throws Exception;

    public void insertContactList(List<JxlContactListEntity> list) throws Exception;

    public List<JxlContactListEntity> addContactList(Long oldRptId , Long newRptId, String json) throws Exception;


}
