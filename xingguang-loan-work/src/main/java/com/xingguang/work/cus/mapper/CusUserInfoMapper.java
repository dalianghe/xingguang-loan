package com.xingguang.work.cus.mapper;

import com.xingguang.work.cus.entity.CusUserInfoEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
public interface CusUserInfoMapper {

    List<CusUserInfoEntity> findCusListByWorkUserId(int workUserId) throws Exception;

}
