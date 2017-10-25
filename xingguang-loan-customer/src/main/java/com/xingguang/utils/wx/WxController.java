package com.xingguang.utils.wx;

import com.xingguang.beans.ResultBean;
import com.xingguang.utils.wx.entity.WxAccessToken;
import com.xingguang.utils.wx.entity.WxConfig;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class WxController {

    protected static final Logger logger = LogManager.getLogger(WxController.class);

    @Autowired
    private WxUtils wxUtils;

    @RequestMapping(value = "/wx/getAccessToken",method = RequestMethod.GET)
    public ResultBean<?> getAccessToken(){
        WxAccessToken wxAccessToken = this.wxUtils.getAccessToken();
        return new ResultBean(wxAccessToken);
    }

    @RequestMapping(value = "/wx/getWxConfig",method = RequestMethod.GET)
    public ResultBean<?> getWxConfig(@RequestParam(value = "url", required = false) final String url, HttpServletRequest request){
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
    public void wx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String echostr = request.getParameter("echostr");
        response.getWriter().append(echostr).flush();
    }


    @RequestMapping(value = "/wx/self/test", method = RequestMethod.GET)
    public void wxSelfTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String token = "A3ci5j70D1m4nvRuti5w6xm1vw9o";
        response.getWriter().append(token).flush();
    }


}
