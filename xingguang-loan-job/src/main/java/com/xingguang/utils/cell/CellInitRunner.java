package com.xingguang.utils.cell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  15:08
 * @Version v1.0.0
 */
@Component
public class CellInitRunner implements CommandLineRunner {

    private final Logger logger = LogManager.getLogger(CellInitRunner.class);

    public static Map<String,String> map = new HashMap<>();

    @Autowired
    private CellUtils cellUtils;

    @Override
    public void run(String... args) throws Exception {
        logger.info(">>>>>>>>>>>>>>>server start init<<<<<<<<<<<<<");
        String token = cellUtils.getAccessToken();
        map.put("token" , token);
        logger.info(">>>>>>>>>>>>>>>server start init end <<<<<<<<<<<<<");
    }
}
