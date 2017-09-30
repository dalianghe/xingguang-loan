package com.xingguang.system.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 统一路由转发器
 */
@Controller
public class RouterController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String zero(){
        return "redirect:/router/system/login/login";
    }

    @RequestMapping(value = "/router/{first}",method = RequestMethod.GET)
    public String first(@PathVariable String first){
        return first;
    }

    @RequestMapping(value = "/router/{first}/{second}",method = RequestMethod.GET)
    public String second(@PathVariable String first,@PathVariable String second){
        return first + "/" + second;
    }

    @RequestMapping(value = "/router/{first}/{second}/{third}",method = RequestMethod.GET)
    public String third(@PathVariable String first,@PathVariable String second,@PathVariable String third){
        return first + "/" + second + "/" +third;
    }
}
