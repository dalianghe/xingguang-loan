package com.xingguang.work.region.service.impl;

import com.xingguang.work.region.entity.CodeRegionEntity;
import com.xingguang.work.region.mapper.CodeRegionMapper;
import com.xingguang.work.region.service.ICodeRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
@Service
public class CodeRegionServiceImpl implements ICodeRegionService {

    @Autowired
    private CodeRegionMapper codeRegionMapper;

    @Override
    public List<CodeRegionEntity> findRegionList(Long pId) throws Exception {
        return codeRegionMapper.findRegionList(pId);
    }
}
