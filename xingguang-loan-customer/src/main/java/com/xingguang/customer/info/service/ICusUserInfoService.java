package com.xingguang.customer.info.service;

import com.xingguang.customer.info.entity.CusUserInfoEntity;
import com.xingguang.customer.info.params.InfoBean;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserInfoService {

    public CusUserInfoEntity addCusUserInfo(InfoBean infoBean) throws Exception;

}
