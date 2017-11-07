package com.xingguang.utils.cell.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/11/7.
 */
public class AuthResponse implements Serializable {

    private Boolean success;
    private String message;
    private Integer code;
    private Data data;


    class Data{
        private String token;
        private DataSource datasource;
        class DataSource{
            private String website;
            public String getWebsite() {
                return website;
            }
            public void setWebsite(String website) {
                this.website = website;
            }
        }

        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }
        public DataSource getDatasource() {
            return datasource;
        }
        public void setDatasource(DataSource datasource) {
            this.datasource = datasource;
        }
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
