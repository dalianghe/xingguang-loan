package com.xingguang.utils.http;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/11/5.
 */
@Component
public class HttpClientHelper {

    protected static final Logger logger = LogManager.getLogger(HttpClientHelper.class);

    private static final String CHAR_SET = "UTF-8";

    /**
     * 向服务端请求超时时间设置(单位:毫秒)
     */
    private static int SERVER_REQUEST_TIME_OUT = 5000;

    /**
     * 服务端响应超时时间设置(单位:毫秒)
     */
    private static int SERVER_RESPONSE_TIME_OUT = 5000;

    @Autowired
    private HttpConnectionManager connManager;

    public String doGet(String url) {
        RequestConfig requestConfig = RequestConfig.custom()
                .setSocketTimeout(SERVER_REQUEST_TIME_OUT*24).setConnectTimeout(SERVER_RESPONSE_TIME_OUT*24).build();
        HttpGet httpget = new HttpGet(url);
        CloseableHttpResponse response = null;
        String result = null;
        try {
            response = connManager.getHttpsClient(requestConfig).execute(httpget);
            int status = response.getStatusLine().getStatusCode();
            if (status == 200) {
                result = EntityUtils.toString(response.getEntity(), CHAR_SET);
            }
            EntityUtils.consume(response.getEntity());
        } catch (Exception e) {
            if (e instanceof SocketTimeoutException) {
                // 服务器请求超时
                logger.error("server request time out");
            } else if (e instanceof ConnectTimeoutException) {
                // 服务器响应超时(已经请求了)
                logger.error("server response time out");
            }
        }finally {
            httpget.releaseConnection();
            this.closeResponse(response);
        }
        return result;
    }

    public String doGet(String url, Map<String, Object> map){
        String result = null;
        URIBuilder uriBuilder = null;
        try {
            uriBuilder = new URIBuilder(url);
            if (map != null) {
                // 遍历map,拼接请求参数
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
                }
            }
            result = this.doGet(uriBuilder.build().toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String doPost(String url, JSONObject json) {
        CloseableHttpResponse response = null;
        HttpPost post = null;
        try {
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(SERVER_REQUEST_TIME_OUT*24).setConnectTimeout(SERVER_RESPONSE_TIME_OUT*24).build();
            post = new HttpPost(url);
            post.setConfig(requestConfig);
            if (json != null) {
                StringEntity se = new StringEntity(json.toString(), CHAR_SET);
                se.setContentEncoding(CHAR_SET);
                se.setContentType("application/json");
                post.setEntity(se);
                response = connManager.getHttpsClient(requestConfig).execute(post);
                int status = response.getStatusLine().getStatusCode();
                //System.out.println(EntityUtils.toString(response.getEntity(), CHAR_SET));
                String result = null;
                if (status == 200) {
                    result = EntityUtils.toString(response.getEntity(), CHAR_SET);
                }
                EntityUtils.consume(response.getEntity());
                return result;
            }
        } catch (Exception e) {
            if (e instanceof SocketTimeoutException) {
                // 服务器请求超时
                logger.error("server request time out");
            } else if (e instanceof ConnectTimeoutException) {
                // 服务器响应超时(已经请求了)
                logger.error("server response time out");
            }
        } finally {
            post.releaseConnection();
            this.closeResponse(response);
        }
        return null;
    }

    public String doPost(String url, Map<String, Object> map){
        CloseableHttpResponse response = null;
        HttpPost post = null;
        try {
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(SERVER_REQUEST_TIME_OUT).setConnectTimeout(SERVER_RESPONSE_TIME_OUT).build();
            post = new HttpPost(url);
            post.setConfig(requestConfig);
            if (map != null) {
                List<NameValuePair> list = new ArrayList<NameValuePair>();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    list.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
                }
                UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(list, CHAR_SET);
                // 把表单放到post里
                post.setEntity(urlEncodedFormEntity);
                response = connManager.getHttpsClient(requestConfig).execute(post);
                int status = response.getStatusLine().getStatusCode();
                String result = null;
                if (status == 200) {
                    result = EntityUtils.toString(response.getEntity(), CHAR_SET);
                }
                EntityUtils.consume(response.getEntity());
                return result;
            }
        }catch (Exception e) {
            if (e instanceof SocketTimeoutException) {
                // 服务器请求超时
                logger.error("server request time out");
            } else if (e instanceof ConnectTimeoutException) {
                // 服务器响应超时(已经请求了)
                logger.error("server response time out");
            }
        } finally {
            post.releaseConnection();
            this.closeResponse(response);
        }
        return null;
    }

    private void closeResponse(CloseableHttpResponse response){
        if (response != null) {
            try {
                EntityUtils.consume(response.getEntity());
                response.close();
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
    }
}
