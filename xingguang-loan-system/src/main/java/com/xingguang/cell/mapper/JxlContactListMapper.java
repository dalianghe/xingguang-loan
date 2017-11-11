package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlContactListEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  13:30
 * @Version v1.0.0
 */
public interface JxlContactListMapper {

    List<JxlContactListEntity> getContactListByBizId(Long bizId) throws Exception;

}
