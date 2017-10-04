package com.xingguang.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.Map;

/**
 * Created by admin on 2017/10/3.
 */
public class JsonUtils {

    public static Map<String, Object> json2Map(String str) {
        Map<String, Object> map = (Map<String, Object>) JSON.parseObject(str, new TypeReference<Map<String, Object>>() {
        });
        return map;
    }

    public static void main(String[] args) {
        String json = "{\"userId\":\"1\"}";
        Map<String, Object> map = json2Map(json);
        System.out.println(map.get("userId"));
    }
}
