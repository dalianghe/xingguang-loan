package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridIdcardWithOtherPhonesEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridIdcardWithOtherPhonesService {

    public void deleteIdcardWithOtherPhonesBybizId(Long bizId) throws Exception;

    public void insertIdcardWithOtherPhones(List<JxlGridIdcardWithOtherPhonesEntity> list) throws Exception;

    public List<JxlGridIdcardWithOtherPhonesEntity> addIdcardWithOtherPhones(Long bizId, Long gridId, String json) throws Exception;

}
