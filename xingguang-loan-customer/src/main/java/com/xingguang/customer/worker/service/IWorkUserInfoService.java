package com.xingguang.customer.worker.service;

import com.xingguang.customer.worker.entity.WorkUserInfo;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IWorkUserInfoService {

    WorkUserInfo getWorkUserInfoById(Long workUserId);

}
