package com.xingguang.common.controller;

import com.alibaba.fastjson.JSON;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 统一路由转发器
 */
@Controller
public class RouterController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(){
        //return "/system/login/login";
        return "redirect:/router/common/index";
    }

    @RequestMapping(value = "/system/login",method = RequestMethod.GET)
    public String rlogin(){
        //return "redirect:/";
        return "/system/login/login";
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
    @RequestMapping(value = "/router/{first}",method = RequestMethod.POST)
    public ModelAndView first(@PathVariable String first, String paramJson){
        Map<String , Object > map = JSON.parseObject(paramJson,Map.class);
        return  new ModelAndView(first, map);
    }

    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}",method = RequestMethod.GET)
    public String second(@PathVariable String first,@PathVariable String second){
        return first + "/" + second;
    }
    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}",method = RequestMethod.POST)
    public ModelAndView second(@PathVariable String first,@PathVariable String second, String paramJson){
        Map<String , Object > map = JSON.parseObject(paramJson,Map.class);
        return  new ModelAndView(first + "/" + second , map);
    }

    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}/{third}",method = RequestMethod.GET)
    public String third(@PathVariable String first,@PathVariable String second,@PathVariable String third){
        return first + "/" + second + "/" +third;
    }
    @RequiresUser
    @RequestMapping(value = "/router/{first}/{second}/{third}",method = RequestMethod.POST)
    public ModelAndView third(@PathVariable String first,@PathVariable String second,@PathVariable String third, String paramJson){
        Map<String , Object > map = JSON.parseObject(paramJson,Map.class);
        return  new ModelAndView(first + "/" + second + "/" +third , map);
    }
    @RequiresUser
    @RequestMapping(value = "/prouter/{first}/{second}/{third}/{id}",method = RequestMethod.GET)
    public String third1(@PathVariable String first, @PathVariable String second, @PathVariable String third, @PathVariable("id") String id,Model model){
        model.addAttribute("id",id);
        return first + "/" + second + "/" +third;
    }

    private Model putParam2Model(String json ,  Model model){
        Map<String , Object > paramMap = JSON.parseObject(json,Map.class);
        Set keySet= paramMap.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = (String)iterator.next();
            Object value = paramMap.get(key);
            model.addAttribute(key , value);
        }
        return model;
    }

}
