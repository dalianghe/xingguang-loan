package com.xingguang.utils.oss;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class OssController {

    private final Logger logger = LogManager.getLogger(OssController.class);

    @Autowired
    private OssUtils ossUtils;

    @RequestMapping(value = "/oss/file", method = RequestMethod.PUT)
    public void pushFile(String path, @RequestParam("excel") MultipartFile file){
        try {
            this.ossUtils.putFile(path, file.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException("验证码错误");
        }
    }

}
