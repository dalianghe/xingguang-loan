package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridUserBlackListEntity;
import com.xingguang.grid.entity.JxlGridUserRegisterOrgsEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:41
 * @Version v1.0.0
 */
public interface IJxlGridUserBlackListService {

    public void deleteGridUserBlackListByBizId(Long bizId) throws Exception;

    public void insertGridUserBlackList(JxlGridUserBlackListEntity entity) throws Exception;

    public JxlGridUserBlackListEntity addGridUserBlackList(Long bizId, Long gridId, String json) throws Exception;

}
