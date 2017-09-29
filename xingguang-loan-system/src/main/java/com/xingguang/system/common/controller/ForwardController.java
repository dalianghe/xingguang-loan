package com.xingguang.system.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

/**
 * 统一路由转发器
 */
@Controller
public class ForwardController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String first(){
        return "system/login/login";
    }

    @RequestMapping(value = "/forward/{first}",method = RequestMethod.GET)
    public String first(@PathVariable String first){
        return first;
    }

    @RequestMapping(value = "/forward/{first}/{second}",method = RequestMethod.GET)
    public String second(@PathVariable String first,@PathVariable String second){
        return first + "/" + second;
    }

    @RequestMapping(value = "/forward/{first}/{second}/{third}",method = RequestMethod.GET)
    public String third(@PathVariable String first,@PathVariable String second,@PathVariable String third){
        return first + "/" + second + "/" +third;
    }
}
