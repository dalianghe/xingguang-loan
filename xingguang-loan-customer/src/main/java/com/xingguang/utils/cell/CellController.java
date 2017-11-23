package com.xingguang.utils.cell;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.utils.cell.entity.AuthResponse;
import com.xingguang.utils.cell.entity.CollectResponse;
import com.xingguang.utils.cell.entity.UserBasicInfoDomain;
import com.xingguang.utils.cell.entity.UserSmsInfoDomain;
import com.xingguang.utils.interfacelog.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.utils.interfacelog.service.ISysInterfaceLogService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by admin on 2017/11/7.
 */
@RestController
public class CellController {

    private final Logger logger = LogManager.getLogger(CellController.class);

    @Autowired
    private CellUtils cellUtils;

    @Autowired
    private ISysInterfaceLogService sysInterfaceLogService;

    @RequestMapping(value = "/cell/auth" , method = RequestMethod.POST)
    public ResultBean<?> cellAuth(@RequestBody UserBasicInfoDomain domain,
                                  @JWTParam(key = "userId", required = true) Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        if(this.checkObjFieldIsNull(domain)){
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("必填参数不能为空！");
            return resultBean;
        }

        AuthResponse response = cellUtils.sendToAuth(domain);
        if(65557!=response.getCode() || !response.getSuccess()){
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("运营商授权失败！");
            return resultBean;
        }

        CollectResponse collectResponse = cellUtils.sendSms(response , domain.getCellPhoneNum() , domain.getPassword());
        if(!collectResponse.getSuccess()){
            logger.info("调用动态验证接口错误！");
            resultBean = new ResultBean<>();
            resultBean.setBizCode(ResultBean.FALL);
            resultBean.setMsg("调用动态验证接口错误！");
            return resultBean;
        }
        if("10008".equals(collectResponse.getData().getProcess_code())){
            SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
            sysInterfaceLogWithBLOBs.setType(3);
            sysInterfaceLogWithBLOBs.setStatus(1);
            sysInterfaceLogWithBLOBs.setCreateTime(new Date());
            sysInterfaceLogWithBLOBs.setRoleType(2);
            sysInterfaceLogWithBLOBs.setIdNo(domain.getIdCardNum());
            sysInterfaceLogWithBLOBs.setName(domain.getName());
            sysInterfaceLogWithBLOBs.setPhone(domain.getCellPhoneNum());
            sysInterfaceLogWithBLOBs.setUserId(userId);
            this.sysInterfaceLogService.create(sysInterfaceLogWithBLOBs);
            collectResponse.setAppId(sysInterfaceLogWithBLOBs.getId());
        }
        collectResponse.setToken(response.getData().getToken());
        collectResponse.setWebsite(response.getData().getDatasource().getWebsite());
        collectResponse.setPassword(domain.getCellPhoneNum());
        collectResponse.setPassword(domain.getPassword());
        resultBean = new ResultBean<>(collectResponse);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

    @RequestMapping(value = "/cell/collect" , method = RequestMethod.POST)
    public ResultBean<?> cellCollect(@RequestBody UserSmsInfoDomain domain,
            @JWTParam(key = "userId", required = true) Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        CollectResponse response = cellUtils.collect(domain);
        if(!response.getSuccess()){
            logger.info("调用收集信息接口错误！");
            resultBean = new ResultBean<>();
            resultBean.setSysCode(ResultBean.FALL);
            resultBean.setMsg("调用收集信息接口错误！");
            return resultBean;
        }
        if("10008".equals(response.getData().getProcess_code())){
            SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
            sysInterfaceLogWithBLOBs.setType(3);
            sysInterfaceLogWithBLOBs.setStatus(1);
            sysInterfaceLogWithBLOBs.setCreateTime(new Date());
            sysInterfaceLogWithBLOBs.setRoleType(2);
            sysInterfaceLogWithBLOBs.setIdNo(domain.getIdNo());
            sysInterfaceLogWithBLOBs.setName(domain.getName());
            sysInterfaceLogWithBLOBs.setPhone(domain.getPhone());
            sysInterfaceLogWithBLOBs.setUserId(userId);
            this.sysInterfaceLogService.create(sysInterfaceLogWithBLOBs);
            response.setAppId(sysInterfaceLogWithBLOBs.getId());
        }
        resultBean = new ResultBean<>(response);
        resultBean.setSysCode(ResultBean.SUCCESS);
        return resultBean;
    }

    private boolean checkObjFieldIsNull(Object obj) throws IllegalAccessException{
        boolean flag = false;
        for(Field field : obj.getClass().getDeclaredFields()){
            field.setAccessible(true);
            logger.info(field.getName());
            if(field.get(obj) == null){
                flag = true;
                return flag;
            }
        }
        return flag;
    }

}
