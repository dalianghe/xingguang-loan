package com.xingguang.cell.service;

import com.xingguang.cell.entity.JxlCellBehaviorEntity;
import com.xingguang.cell.entity.JxlContactListEntity;
import com.xingguang.cell.entity.JxlContactRegionEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/11  14:04
 * @Version v1.0.0
 */
public interface ICellReportService {

    public List<JxlCellBehaviorEntity> getCellBehaviorByBizId(Long bizId) throws Exception;

    public List<JxlContactRegionEntity> getContactRegionByBizId(Long bizId) throws Exception;

    public List<JxlContactListEntity> getContactListByBizId(Long bizId) throws Exception;

}
