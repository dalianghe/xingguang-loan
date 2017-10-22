package com.xingguang.utils.wx;

import com.xingguang.beans.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class WxController {

    @Autowired
    private WxUtils wxUtils;

    @RequestMapping(value = "/wx/getAccessToken",method = RequestMethod.GET)
    public ResultBean<?> getAccessToken(){
        WxAccessToken wxAccessToken = this.wxUtils.getAccessToken();
        return new ResultBean(wxAccessToken);
    }


    @RequestMapping(value = "/wx", method = RequestMethod.GET)
    public void wx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String echostr = request.getParameter("echostr");
        response.getWriter().append(echostr).flush();
    }


}
