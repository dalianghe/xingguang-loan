package com.xingguang.system.region.service.impl;

import com.xingguang.system.region.entity.CodeRegionEntity;
import com.xingguang.system.region.mapper.CodeRegionMapper;
import com.xingguang.system.region.service.ICodeRegionService;
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
