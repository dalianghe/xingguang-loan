package com.xingguang.customer.link.service;

import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICusUserLinkService {

    void create(CusUserLink cusUserLinks);

    void delete(CusUserLinkExample example);

    CusUserLink findByCusUserId(Long cusUserId);
}
