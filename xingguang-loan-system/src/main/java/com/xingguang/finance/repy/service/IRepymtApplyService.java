package com.xingguang.finance.repy.service;

import com.xingguang.finance.repy.domain.RepyDomain;

import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:01
 * @Version v1.0.0
 */
public interface IRepymtApplyService {

    public Map<String, Object> findNormalRepymtList(RepyDomain repyDemain) throws Exception;

    public void repaymentNormal(RepyDomain repyDemain) throws Exception;

}
