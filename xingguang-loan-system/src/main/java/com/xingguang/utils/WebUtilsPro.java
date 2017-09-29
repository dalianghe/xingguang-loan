package com.xingguang.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/9/27.
 */
public class WebUtilsPro {
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String requestedWith = request.getHeader("x-requested-with");
        if (requestedWith != null && requestedWith.equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        } else {
            return false;
        }
    }
}
