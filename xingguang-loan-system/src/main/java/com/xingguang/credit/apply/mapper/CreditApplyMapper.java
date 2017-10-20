package com.xingguang.credit.apply.mapper;

import com.xingguang.credit.apply.entity.CreditApplyEntity;
import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/12  14:19
 * @Version v1.0.0
 */
public interface CreditApplyMapper {

    CreditApplyEntityCustom findCreditApplyById(Long id) throws Exception;

    List<CreditApplyEntityCustom> findCreditApplyByCusId(Long cusId) throws Exception;

    void updateCreditApply(CreditApplyEntity creditApplyEntity) throws Exception;
}
