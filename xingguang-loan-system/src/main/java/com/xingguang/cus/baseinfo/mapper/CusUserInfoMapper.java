package com.xingguang.cus.baseinfo.mapper;

import com.xingguang.cus.baseinfo.entity.CusUserInfoEntity;
import com.xingguang.cus.baseinfo.entity.custom.CusUserInfoEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/11.
 */
public interface CusUserInfoMapper {

    CusUserInfoEntityCustom findCusUserById(Long userId) throws Exception;

    List<CusUserInfoEntityCustom> findCusUserList(CusUserInfoEntity cusUserInfoEntity) throws Exception;

    List<CusUserInfoEntityCustom> findCreditTodoCusUserList(CusUserInfoEntity cusUserInfoEntity) throws Exception;

}
