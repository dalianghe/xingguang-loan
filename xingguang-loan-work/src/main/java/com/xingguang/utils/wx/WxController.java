package com.xingguang.utils.wx;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.JWTToken;
import com.xingguang.beans.ResultBean;

import com.xingguang.utils.JwtUtils;
import com.xingguang.utils.wx.entity.WxAccessToken;
import com.xingguang.utils.wx.entity.WxAuth;
import com.xingguang.utils.wx.entity.WxConfig;
import com.xingguang.work.auth.controller.AuthController;
import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class WxController {

    protected static final Logger logger = LogManager.getLogger(WxController.class);

    @Autowired
    private WxUtils wxUtils;

    @Autowired
    private IWorkUserInfoService workUserInfoService;

    @RequestMapping(value = "/wx/getAccessToken",method = RequestMethod.GET)
    public ResultBean<?> getAccessToken(){
        logger.info("===========进入获取AccessToken==========");
        WxAccessToken wxAccessToken = this.wxUtils.getAccessToken();
        return new ResultBean(wxAccessToken);
    }

    @RequestMapping(value = "/wx/getWxConfig",method = RequestMethod.GET)
    public ResultBean<?> getWxConfig(@RequestParam(value = "url", required = false) final String url, HttpServletRequest request){
        logger.info("===========进入获取WxConfig==========");
        String requestUrl = url;
        if(StringUtils.isBlank(requestUrl)){
//            requestUrl = request.getRequestURL().toString();
            requestUrl = request.getHeader("referer");
        }

        logger.info("head.referer=" + request.getHeader("referer"));
        logger.info("RemoteHost=" + request.getRemoteHost());
        logger.info("getRemoteAddr=" + request.getRemoteAddr()+ ":" + request.getRemotePort());


        String path = request.getContextPath();
        String url1 = request.getScheme() + "://" + request.getServerName() +  path + "/";
        logger.info("==获取WxConfig的==url1==" + url1);
        logger.info("==获取WxConfig的==requestUrl==" + requestUrl);
        WxConfig wxConfig = this.wxUtils.getWxConfig(requestUrl);
        logger.info("wxConfig:===============:" + wxConfig);
        return new ResultBean(wxConfig);
    }

    @RequestMapping(value = "/wx", method = RequestMethod.GET)
    public void wxGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("===========进入监听接口GET==========");
        String echostr = request.getParameter("echostr");
        response.getWriter().append(echostr).flush();
    }

    @RequestMapping(value = "/wx", method = RequestMethod.POST)
    public void wxPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("===========进入监听接口POST==========");
        String echostr = request.getParameter("echostr");
        response.getWriter().append(echostr).flush();
    }

    @RequestMapping(value = "/wx/auth/{code}", method = RequestMethod.GET)
    public ResultBean<?>  wx(HttpServletRequest request, HttpServletResponse response, @PathVariable String code) throws Exception {
        logger.info("===========进入获取openId==========");
        Map<String, String> map = new HashMap<>();
        WxAuth wxAuth = this.wxUtils.getAuthToken(code);
        logger.info("wxAuth:=============:" + wxAuth);
        if(wxAuth == null){
            return new ResultBean();
        }
        map.put("openId", wxAuth.getOpenid());
        WorkUserInfoEntity workUserInfoEntity = this.workUserInfoService.selectWorkInfoByOpenId(wxAuth.getOpenid());
        if(workUserInfoEntity == null){
            return new ResultBean(map);
        }
        String jwtToken = JwtUtils.createJWT("work.xingguanqb.com", JSON.toJSONString(new JWTToken(workUserInfoEntity.getId(), workUserInfoEntity.getPhone())), AuthController.EXPIR_TIME);
        map.put("token", jwtToken);
        return new ResultBean(map);
    }


    @RequestMapping(value = "/wx/self/test", method = RequestMethod.GET)
    public void wxSelfTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String token = "A3ci5j70D1m4nvRuti5w6xm1vw9o";
        response.getWriter().append(token).flush();
    }


}
