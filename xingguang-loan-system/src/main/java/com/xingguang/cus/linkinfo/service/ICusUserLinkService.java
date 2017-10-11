package com.xingguang.cus.linkinfo.service;

import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;

/**
 * Created by admin on 2017/10/12.
 */
public interface ICusUserLinkService {

    public CusUserLinkEntity findCusUserLinkByUserId(Long cusUserId) throws Exception;

}
