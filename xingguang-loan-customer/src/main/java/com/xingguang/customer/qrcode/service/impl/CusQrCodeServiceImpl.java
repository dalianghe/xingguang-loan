package com.xingguang.customer.qrcode.service.impl;

import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import com.xingguang.customer.link.mapper.CusUserLinkMapper;
import com.xingguang.customer.qrcode.entity.WorkQrCode;
import com.xingguang.customer.qrcode.entity.WorkQrCodeExample;
import com.xingguang.customer.qrcode.mapper.WorkQrCodeMapper;
import com.xingguang.customer.qrcode.service.ICusQrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CusQrCodeServiceImpl implements ICusQrCodeService {

    @Autowired
    private WorkQrCodeMapper workQrCodeMapper;

    @Override
    @Transactional(readOnly = true)
    public WorkQrCode findByWorkUserId(Long workUserId) {
        WorkQrCodeExample example = new WorkQrCodeExample();
        example.createCriteria().andWorkUserIdEqualTo(workUserId);
        example.setLimit(1);
        List<WorkQrCode> list = this.workQrCodeMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }

    @Override
    public void update(WorkQrCode workQrCode) {
        this.workQrCodeMapper.updateByPrimaryKeySelective(workQrCode);
    }
}
