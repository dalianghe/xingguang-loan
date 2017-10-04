package com.xingguang.system.common.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 统一路由转发器
 */
@Controller
public class RouterController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){
        return "/system/login/login";
    }

    @RequestMapping(value = "/system/login",method = RequestMethod.GET)
    public String rlogin(){
        return "redirect:/";
    }

    @RequestMapping(value = "/error/500" , method = RequestMethod.GET)
    public String error500(){
        return "/error/500";
    }

    @RequiresUser
    @RequestMapping(value = "/router/{first}",method = RequestMethod.GET)
    public String first(@PathVariable String first){
        return first;
    }
    @RequiresUser
    @RequestMapping(value = "/prouter/{first}/{id}",method = RequestMethod.GET)
    public String first(@PathVariable String first, @PathVariable("id") String id,Model model){
        model.addAttribute("id",id);
        return first;
    }

    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}",method = RequestMethod.GET)
    public String second(@PathVariable String first,@PathVariable String second){
        return first + "/" + second;
    }
    @RequiresUser
    @RequestMapping(value = "/prouter/{first}/{second}/{id}",method = RequestMethod.GET)
    public String second(@PathVariable String first, @PathVariable String second,  @PathVariable("id") String id,Model model){
        model.addAttribute("id",id);
        return first + "/" + second;
    }

    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}/{third}",method = RequestMethod.GET)
    public String third(@PathVariable String first,@PathVariable String second,@PathVariable String third){
        return first + "/" + second + "/" +third;
    }
    @RequiresUser
    @RequestMapping(value = "/prouter/{first}/{second}/{third}/{id}",method = RequestMethod.GET)
    public String third(@PathVariable String first, @PathVariable String second, @PathVariable String third, @PathVariable("id") String id,Model model){
        model.addAttribute("id",id);
        return first + "/" + second + "/" +third;
    }

}
