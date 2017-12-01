package com.xingguang.customer.credit.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.credit.service.ICreditInfoService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.qrcode.entity.WorkQrCode;
import com.xingguang.customer.qrcode.service.ICusQrCodeService;
import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
import com.xingguang.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class CreditController {

    @Autowired
    private ICreditApplyService creditApplyService;
    @Autowired
    private ICreditInfoService creditInfoService;
    @Autowired
    private ICusUserInfoService cusUserInfoService;
    @Autowired
    private ICusQrCodeService cusQrCodeService;

    @RequestMapping(value = "/credit/apply",method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@RequestBody CreditApplyParam creditApplyParam,
                                           @JWTParam(key = "userId", required = true) Long userId){
        CreditApply creditApply = new CreditApply();
        creditApply.setCusUserId(userId);
        creditApply.setCreateTime(new Date());
        creditApply.setCusLat(creditApplyParam.getCusLat());
        creditApply.setCusLng(creditApplyParam.getCusLng());
        CusUserInfo cusUserInfo = this.cusUserInfoService.findById(userId);
        WorkQrCode workQrCode = this.cusQrCodeService.findByWorkUserId(cusUserInfo.getWorkUserId());
        creditApply.setWorkLat(workQrCode.getLat());
        creditApply.setWorkLng(workQrCode.getLng());
        Double distance = MapUtils.GetDistance(creditApplyParam.getCusLat(), creditApplyParam.getCusLng(), workQrCode.getLat(), workQrCode.getLng());
        creditApply.setCusWorkDistance(distance.toString());
        this.creditApplyService.create(creditApply, creditApplyParam);
        return new ResultBean();
    }

    @RequestMapping(value = "/credit/info",method = RequestMethod.GET)
    public ResultBean<?> findCredit(@JWTParam(key = "userId", required = true) Long cusUserId){
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(cusUserId);
        Map map = new HashMap();
        if(creditInfo == null){
            CreditApply creditApply = this.creditApplyService.getByUserId(cusUserId);
            if(creditApply != null){
                map.put("creditApply", creditApply);
            }
        }else{
            map.put("creditInfo", creditInfo);
        }
        return new ResultBean(map);
    }

}
