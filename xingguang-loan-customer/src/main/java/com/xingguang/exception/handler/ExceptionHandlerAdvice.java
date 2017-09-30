package com.xingguang.exception.handler;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.ResultBean;
import com.xingguang.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/9/30.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    protected static final Logger logger = LogManager.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler({CustomException.class})
    public void authenticationException(CustomException customException , HttpServletResponse response) {
        logger.info("捕获到自定义异常，异常提示 : " + customException.getMessage());
        ResultBean<?> resultBean = new ResultBean<>(customException.getMessage());
        resultBean.setBizCode(ResultBean.FALL);
        writeJson(resultBean, response);
    }

    private void writeJson(ResultBean resultBean, HttpServletResponse response) {
        PrintWriter out = null;
        try {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            out = response.getWriter();
            out.write(JSON.toJSONString(resultBean));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
