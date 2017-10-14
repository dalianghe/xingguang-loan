package com.xingguang.cus.baseinfo.service;

import com.xingguang.cus.baseinfo.domain.CusUserDomain;
import com.xingguang.cus.baseinfo.entity.custom.CusUserInfoEntityCustom;

import java.util.Map;

/**
 * Created by admin on 2017/10/11.
 */
public interface ICusUserInfoService {

    public Map<String , Object> findCusUserAll(CusUserDomain domain) throws Exception;

    public Map<String , Object> findCreditTodoCusUser(CusUserDomain domain) throws Exception;

    public Map<String , Object> findMyCreditDoneCusUser(CusUserDomain domain) throws Exception;

    public CusUserInfoEntityCustom findCusUserById(Long userId) throws Exception;

}
