package com.xingguang.utils.oss;

import com.aliyun.oss.OSSClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.InputStream;
import java.text.MessageFormat;

@Service
public class OssUtils {

    private final Logger logger = LogManager.getLogger(OssUtils.class);

    @Value("${OSS.BUCKET}")
    private String bucket;
    @Value("${OSS.ACCESS.KEY.ID}")
    private String accessKeyId;
    @Value("${OSS.ACCESS.KEY.SECRET}")
    private String accessKeySecret;
    @Value("${OSS.ENDPOINT}")
    private String endpoint;

    private String basePath;

    private OSSClient client;

    @PostConstruct
    public void init() {
        this.basePath = MessageFormat.format("http://{0}.{1}/", this.bucket, this.endpoint);
        this.logger.info("OSSClient初始化=================>开始");
        client = new OSSClient(this.endpoint, this.accessKeyId, this.accessKeySecret);
        this.logger.info("OSSClient初始化=================>结束");
    }

    public String putFile(String path, InputStream inputStream ){
        this.client.putObject(this.bucket, path, inputStream);
        return this.basePath + path;
    }

    public String putFile(String path, File file ){
        this.client.putObject(this.bucket, path, file);
        return this.basePath + path;
    }

    public void getFile(String path, InputStream inputStream ){
        this.client.getObject(this.bucket, path);
    }

}
