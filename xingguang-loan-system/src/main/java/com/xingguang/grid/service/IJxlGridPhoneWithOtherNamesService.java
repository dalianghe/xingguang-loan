package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridPhoneWithOtherIdcardsEntity;
import com.xingguang.grid.entity.JxlGridPhoneWithOtherNamesEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridPhoneWithOtherNamesService {

    public void deletePhoneWithOtherNamesBybizId(Long bizId) throws Exception;

    public void insertPhoneWithOtherNames(List<JxlGridPhoneWithOtherNamesEntity> list) throws Exception;

    public List<JxlGridPhoneWithOtherNamesEntity> addPhoneWithOtherNames(Long bizId, Long gridId, String json) throws Exception;

}
