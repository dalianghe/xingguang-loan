package com.xingguang.credit.mng.mapper;

import com.xingguang.credit.mng.entity.CreditEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/17.
 */
public interface CreditMapper {

    List<CreditEntity> findCreditList (CreditEntity creditEntity) throws Exception;

    void lockCreditByCusId(Long cusUserId) throws Exception;

    void unLockCreditByCusId(Long cusUserId) throws Exception;

}
