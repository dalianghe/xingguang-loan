package com.xingguang.cus.linkinfo.mapper;

import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;

/**
 * Created by admin on 2017/10/12.
 */
public interface CusUserLinkMapper {

    CusUserLinkEntity findCusUserLinkByUserId(Long userId) throws Exception;

}
