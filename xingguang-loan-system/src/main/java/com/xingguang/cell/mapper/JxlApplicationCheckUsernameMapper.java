package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlApplicationCheckUsernameEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  21:01
 * @Version v1.0.0
 */
public interface JxlApplicationCheckUsernameMapper {

    public JxlApplicationCheckUsernameEntity findCheckUsernameByBizId(Long bizId) throws Exception;

}
