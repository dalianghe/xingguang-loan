package com.xingguang.work.cus.service;

import com.xingguang.work.cus.entity.CusUserInfoEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
public interface ICusUserInfoService {

    public List<CusUserInfoEntity> findCusListByWorkUserId(int workUserId) throws Exception;

}
