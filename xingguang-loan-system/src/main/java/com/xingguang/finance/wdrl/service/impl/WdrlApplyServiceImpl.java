package com.xingguang.finance.wdrl.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCuston;
import com.xingguang.finance.wdrl.mapper.WdrlApplyMapper;
import com.xingguang.finance.wdrl.service.IWdrlApplyService;
import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;
import com.xingguang.product.info.mapper.ProductInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
@Service
public class WdrlApplyServiceImpl implements IWdrlApplyService {

    @Autowired
    private WdrlApplyMapper wdrlApplyMapper;
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public Map<String, Object> findWdrlApplyList(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        entity.setCusUserName(domain.getCusUserName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WdrlApplyEntityCuston> applies = wdrlApplyMapper.findWdrlApplyList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , applies);
        map.put("total" , ((Page) applies).getTotal());
        return map;
    }

    @Override
    public WdrlApplyEntityCuston findWdrlApplyById(Long id) throws Exception {
        return wdrlApplyMapper.findWdrlApplyById(id);
    }

    @Override
    @Transactional
    public void paypal(WdrlDomain domain) throws Exception {

        for(Long id : domain.getIds()){
            domain.setId(id);
            WdrlApplyEntityCuston applyEntity = this.findWdrlApplyById(domain.getId());
            if(null == applyEntity){
                throw new Exception("无付款记录！");
            }
            // step 1: 计算服务费和账户管理费
            ProductInfoEntityCustom product = productInfoMapper.findProductInfoById(applyEntity.getProductId());
            // 计算服务费
            BigDecimal serviceCharge = applyEntity.getAmount().multiply(product.getServiceRate());
            // 计算账户管理费
            BigDecimal accMgmtCharge = applyEntity.getAmount().multiply(product.getAccMgmtRate());
            // step 2: 生成还款计划

            // step 3: 更新提现记录表
            WdrlApplyEntity entity = new WdrlApplyEntity();
            BeanUtils.copyProperties(domain,entity);
            entity.setServiceCharge(serviceCharge.setScale(2 , BigDecimal.ROUND_HALF_UP));
            entity.setAccMgmtCharge(accMgmtCharge.setScale(2 , BigDecimal.ROUND_HALF_UP));
            wdrlApplyMapper.updateWdrlApply(entity);
        }

    }

    @Override
    public void stopPaypal(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        BeanUtils.copyProperties(domain,entity);
        wdrlApplyMapper.updateWdrlApply(entity);
    }

}
