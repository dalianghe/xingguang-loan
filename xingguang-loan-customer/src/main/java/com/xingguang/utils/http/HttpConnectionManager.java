package com.xingguang.utils.http;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/11/5.
 */
@Component
public class HttpConnectionManager {

    protected static final Logger logger = LogManager.getLogger(HttpConnectionManager.class);

    /**
     * 最大连接数200
     */
    private static int MAX_CONNECTION_NUM = 200;

    /**
     * 单路由最大连接数80
     */
    private static int MAX_PER_ROUTE = 80;

    /**
     * 构造函数
     */
    private HttpConnectionManager() {}

    private static Object LOCAL_LOCK = new Object();

    /**
     * 连接池管理对象
     */
    PoolingHttpClientConnectionManager cm = null;

    /**
     *
     * 功能描述: <br>
     * 初始化连接池管理对象
     *
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    private PoolingHttpClientConnectionManager getPoolManager() {
        logger.info("initPoolManager");
        if (null == cm) {
            synchronized (LOCAL_LOCK) {
                if (null == cm) {
                    SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
                    try {
                        sslContextBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
                        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(
                                sslContextBuilder.build());
                        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
                                .register("https", socketFactory)
                                .register("http", new PlainConnectionSocketFactory())
                                .build();
                        cm = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
                        cm.setMaxTotal(MAX_CONNECTION_NUM);
                        cm.setDefaultMaxPerRoute(MAX_PER_ROUTE);
                    } catch (Exception e) {
                        logger.error("init PoolingHttpClientConnectionManager Error" + e);
                    }
                }
            }
        }
        return cm;
    }

    /**
     * 创建线程安全的HttpClient
     *
     * @param config 客户端超时设置
     *
     * @return
     */
    public CloseableHttpClient getHttpsClient(RequestConfig config) {
        logger.info("initHttpsClient");
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config)
                .setConnectionManager(this.getPoolManager())
                .build();
        return httpClient;
    }

}
