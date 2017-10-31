package com.xingguang.quartz.login.controller;

import com.xingguang.quartz.common.beans.ResultBean;
import com.xingguang.quartz.login.domain.TaskUser;
import com.xingguang.quartz.login.service.ITaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/31  19:15
 * @Version v1.0.0
 */
@Controller
public class LoginController {

    @Autowired
    private ITaskUserService taskUserService;

    @RequestMapping(value={"/login"} , method = RequestMethod.GET)
    public String login(){
        return "login/login";
    }

    @ResponseBody
    @RequestMapping(value={"/login"} , method = RequestMethod.POST)
    public ResultBean<?> login(@RequestParam("account") String account ,
                               @RequestParam("password")  String password ,
                               HttpServletRequest request) throws Exception{

        ResultBean<?> resultBean = null;
        TaskUser taskUser = taskUserService.findUserByAccount(account);
        if(null == taskUser){
            resultBean = new ResultBean<>();
            resultBean.setBizCode(1);
            resultBean.setMsg("用户不存在!");
        }else{
            if(!password.equals(taskUser.getPassword())){
                resultBean = new ResultBean<>();
                resultBean.setBizCode(1);
                resultBean.setMsg("用户密码不正确!");
            }else{
                resultBean = new ResultBean<>(resultBean);
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("user" , taskUser);
        return resultBean;
    }

    @RequestMapping(value = "/logon" , method = RequestMethod.GET)
    public void logon(HttpServletRequest request , HttpServletResponse response) throws Exception{
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        request.getRequestDispatcher("/login").forward(request,response);
    }

}
