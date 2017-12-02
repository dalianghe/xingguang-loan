package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridIdcardAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridIdcardWithOtherNamesEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridIdcardWithOtherNamesService {

    public void deleteIdcardWithOtherNamesBybizId(Long bizId) throws Exception;

    public void insertIdcardWithOtherNames(List<JxlGridIdcardWithOtherNamesEntity> list) throws Exception;

    public List<JxlGridIdcardWithOtherNamesEntity> addIdcardWithOtherNames(Long bizId, Long gridId, String json) throws Exception;

}
