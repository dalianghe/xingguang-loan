package com.xingguang.utils.qrcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by admin on 2017/10/2.
 */
public class QrcodeUtilsTest {

    public static void main(String[] args) throws IOException {
        MatrixToBgImageConfig config = new MatrixToBgImageConfig();

        //config.setHeadimgUrl("https://avatars2.githubusercontent.com/u/6011374?v=4&u=7672049c1213f7663b79583d727e95ee739010ec&s=400");

        config.setQrcode_url("http://baidu.com");

        config.setRealname("何大亮");

        byte[] bytes = QrcodeUtils.createQrcode(config);
        Path path = Files.createTempFile("qrcode_with_bg_", ".jpg");
        Files.write(path, bytes);
    }

}
