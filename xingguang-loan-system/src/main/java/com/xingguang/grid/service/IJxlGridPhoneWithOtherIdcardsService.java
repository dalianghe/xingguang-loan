package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridPhoneWithOtherIdcardsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridPhoneWithOtherIdcardsService {

    public void deletePhoneWithOtherIdcardsBybizId(Long bizId) throws Exception;

    public void insertPhoneWithOtherIdcards(List<JxlGridPhoneWithOtherIdcardsEntity> list) throws Exception;

    public List<JxlGridPhoneWithOtherIdcardsEntity> addPhoneWithOtherIdcards(Long bizId, Long gridId, String json) throws Exception;

}
