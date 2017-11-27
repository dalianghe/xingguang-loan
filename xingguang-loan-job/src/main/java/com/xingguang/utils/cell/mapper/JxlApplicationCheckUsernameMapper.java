package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlApplicationCheckUsernameEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  19:02
 * @Version v1.0.0
 */
public interface JxlApplicationCheckUsernameMapper {

    void deleteCheckUsernameByRptId(Long rptId) throws Exception;

    void insertCheckUsername(JxlApplicationCheckUsernameEntity entity) throws Exception;

}
