package com.xingguang.http;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/16  10:12
 * @Version v1.0.0
 */
public class HttpClientResponse {
    // 响应码
    private Integer code;

    // 响应体
    private String body;

    public HttpClientResponse() {
        super();
    }

    public HttpClientResponse(Integer code, String body) {
        super();
        this.code = code;
        this.body = body;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
