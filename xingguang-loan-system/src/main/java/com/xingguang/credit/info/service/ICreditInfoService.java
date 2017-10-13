package com.xingguang.credit.info.service;

import com.xingguang.credit.info.entity.CreditInfoEntity;
import com.xingguang.credit.info.entity.custom.CreditInfoEntityCustom;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  16:28
 * @Version v1.0.0
 */
public interface ICreditInfoService {

    public CreditInfoEntityCustom findCreditInfoByCusId(Long cusUserId) throws Exception;

    public void insertCreditInfo(CreditInfoEntity creditInfoEntity) throws Exception;

    public void updateCusCreditInfo(CreditInfoEntity creditInfoEntity) throws Exception;

}
