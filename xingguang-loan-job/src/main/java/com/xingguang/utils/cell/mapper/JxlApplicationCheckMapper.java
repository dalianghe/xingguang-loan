package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlApplicatinoCheckEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  16:18
 * @Version v1.0.0
 */
public interface JxlApplicationCheckMapper {

    void deleteApplicationCheck(Long rptId) throws Exception;

    void insertApplicationCheck(List<JxlApplicatinoCheckEntity> list) throws Exception;

}
