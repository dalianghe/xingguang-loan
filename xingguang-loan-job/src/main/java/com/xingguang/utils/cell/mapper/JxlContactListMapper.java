package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlContactListEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  13:30
 * @Version v1.0.0
 */
public interface JxlContactListMapper {

    void deleteContactListByRptId(Long rptId) throws Exception;

    void insertContactList(List<JxlContactListEntity> list) throws Exception;

}
