package com.xingguang.system.common.controller;

import com.xingguang.beans.ResultBean;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

/**
 * Created by admin on 2017/10/2.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public ResultBean<?> test1() {
        ResultBean<?> resultBean = null;
        String imgFile = "C:\\Users\\admin\\AppData\\Local\\Temp\\qrcode_with_bg_6659262066777777528.jpg";
        String imgbese = getImgStr(imgFile);
        resultBean = new ResultBean<>(imgbese);
        return resultBean;
    }

    public static void main(String[] args) {
        String imgFile = "C:\\Users\\admin\\AppData\\Local\\Temp\\qrcode_with_bg_6659262066777777528.jpg";
        String imgbese = getImgStr(imgFile);
        System.out.println(imgbese.length());
        System.out.println(imgbese);
        String imgFilePath = "d:\\332.jpg";
        generateImage(imgbese, imgFilePath);
    }

    public static String getImgStr(String imgFile) {
        InputStream in = null;
        byte[] data = null;
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(Base64.encodeBase64(data));
    }

    public static boolean generateImage(String imgStr, String imgFilePath) {
        if (imgStr == null){
            return false;
        }
        try {
            byte[] b = Base64.decodeBase64(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
