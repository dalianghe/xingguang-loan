package com.xingguang.utils.verifycode;

import com.xingguang.beans.ResultBean;
import com.xingguang.utils.oss.OssUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class VerifyCodeController {

    private final Logger logger = LogManager.getLogger(VerifyCodeController.class);

    @RequestMapping(value = "/verify/code", method = RequestMethod.GET)
    public void buildVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        HttpSession session = request.getSession();
        session.setAttribute("rand", verifyCode.toLowerCase());
        //生成图片
        int w = 200, h = 80;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @RequestMapping(value = "/verify/code/{verifyCode}", method = RequestMethod.GET)
    public ResultBean<?> validateVerifyCode(HttpServletRequest request, HttpServletResponse response, @PathVariable String verifyCode) throws IOException {
        HttpSession session = request.getSession();
        String sessionVerifyCode = (String)session.getAttribute("rand");
        if(verifyCode.toLowerCase().equals(sessionVerifyCode)){
            return new ResultBean(1);
        }
        return new ResultBean(0);
    }

}
