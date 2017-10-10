package com.xingguang.common.beans;

import java.io.Serializable;

/**
 * @Description 统一返回实体bean
 * @Author hedaliang
 * @Date 2017/9/21  16:24
 * @Version v1.0.0
 */
public class ResultBean<T> implements Serializable {
    public static final int SUCCESS = 0;
    public static final int FALL = 1;
    public static final int NO_PERMISSION = 2;

    private String msg = "success";
    private int sysCode = SUCCESS; // 请求结果状态码  只有成功和失败，无异常为成功0
    private int bizCode ; // 业务结果码  可根据业务自行扩展
    private T data;

    public ResultBean(){
        super();
    }

    public ResultBean(T data){
        super();
        this.data = data;
    }

    public ResultBean(Throwable e){
        super();
        this.msg = e.toString();
        this.sysCode = FALL;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
        this.sysCode = sysCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getBizCode() {
        return bizCode;
    }

    public void setBizCode(int bizCode) {
        this.bizCode = bizCode;
    }
}
