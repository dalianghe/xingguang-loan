package com.xingguang.customer.info.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;
import com.xingguang.customer.code.service.ICodeService;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.entity.CusUserInfoAll;
import com.xingguang.customer.info.params.UserInfoParam;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkAll;
import com.xingguang.customer.link.service.ICusUserLinkService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class InfoController {

    @Autowired
    private ICusUserInfoService cusUserInfoService;
    @Autowired
    private ICusUserLinkService cusUserLinkService;
    @Autowired
    private ICodeService codeService;

    @RequestMapping(value = "/cus/user/info", method = RequestMethod.GET)
    public ResultBean<?> info(@JWTParam(key = "userId", required = true) Long userId) {
        CusUserInfo cusUserInfo = this.cusUserInfoService.findById(userId);
        CusUserLink cusUserLink = this.cusUserLinkService.findByCusUserId(userId);
        cusUserLink = cusUserLink == null ? new CusUserLink() : cusUserLink;
        List codeList = new ArrayList();
        if(cusUserInfo.getSex() != null){
            codeList.add(cusUserInfo.getSex());
        }
        if(cusUserInfo.getEducation() != null){
            codeList.add(cusUserInfo.getEducation());
        }
        if(cusUserInfo.getOccupation() != null) {
            codeList.add(cusUserInfo.getOccupation());
        }
        if(cusUserInfo.getIncome() != null){
            codeList.add(cusUserInfo.getIncome());
        }
        if(cusUserLink.getRelationId() != null){
            codeList.add(cusUserLink.getRelationId());
        }
        Map<Integer, CodeInfo> codeMap = new HashMap();
        if(!CollectionUtils.isEmpty(codeList)){
            CodeInfoExample example = new CodeInfoExample();
            example.createCriteria().andCodeIn(codeList);
            codeMap = this.codeService.getCodeMap(example);
        }
        CusUserInfoAll cusUserInfoAll = this.buildCusUserInfoAll(cusUserInfo, cusUserLink, codeMap);
        return new ResultBean(cusUserInfoAll);
    }

    private CusUserInfoAll buildCusUserInfoAll(CusUserInfo cusUserInfo, CusUserLink cusUserLink, Map<Integer, CodeInfo> codeMap) {

        String sexName = codeMap.get(cusUserInfo.getSex()) == null ? "" : codeMap.get(cusUserInfo.getSex()).getName();
        String incomeName = codeMap.get(cusUserInfo.getIncome()) == null ? "" : codeMap.get(cusUserInfo.getIncome()).getName();
        String educationName = codeMap.get(cusUserInfo.getEducation()) == null ? "" : codeMap.get(cusUserInfo.getEducation()).getName();
        String occupationName = codeMap.get(cusUserInfo.getOccupation()) == null ? "" : codeMap.get(cusUserInfo.getOccupation()).getName();
        String relationName = codeMap.get(cusUserLink.getRelationId()) == null ? "" : codeMap.get(cusUserLink.getRelationId()).getName();

        CusUserInfoAll cusUserInfoAll = new CusUserInfoAll() {{
            setId(cusUserInfo.getId());
            setPhone(cusUserInfo.getPhone());
            setName(cusUserInfo.getName());
            setIdNo(cusUserInfo.getIdNo());
            setRealStatus(cusUserInfo.getRealStatus());
            setStatus(cusUserInfo.getStatus());
            setSex(cusUserInfo.getSex());
            setIncome(cusUserInfo.getIncome());
            setEducation(cusUserInfo.getEducation());
            setOccupation(cusUserInfo.getOccupation());
            setCreateTime(cusUserInfo.getCreateTime());
            setWorkUserId(cusUserInfo.getWorkUserId());
            setWorkUserName(cusUserInfo.getWorkUserName());
            setHomeAddr(cusUserInfo.getHomeAddr());
            setCompanyName(cusUserInfo.getCompanyName());
            setCompanyAddr(cusUserInfo.getCompanyAddr());


            setSexName(sexName);
            setIncomeName(incomeName);
            setEducationName(educationName);
            setOccupationName(occupationName);

            setCusUserLinkAll(new CusUserLinkAll(){{
                setId(cusUserLink.getId());
                setCusUserId(cusUserLink.getCusUserId());
                setLinkName(cusUserLink.getLinkName());
                setRelationId(cusUserLink.getRelationId());
                setPhone(cusUserLink.getPhone());
                setCreateTime(cusUserLink.getCreateTime());
                setRelationName(relationName);
            }});
        }};

        return cusUserInfoAll;

    }

    @RequestMapping(value = "/cus/user", method = RequestMethod.PATCH)
    public ResultBean<?> update(@RequestBody UserInfoParam userInfoParam,
                                @JWTParam(key = "userId", required = true) Long userId) {
        userInfoParam.getCusUserInfo().setId(userId);
        userInfoParam.getCusUserLink().setCusUserId(userId);
        userInfoParam.getCusUserLink().setCreateTime(new Date());
        this.cusUserInfoService.update(userInfoParam);
        return new ResultBean();
    }

}
