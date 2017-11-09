package com.xingguang.utils.cell.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/11/7.
 */
public class CollectResponse implements Serializable {

    private Boolean success;
    private String token;
    private String phone;
    private String password;
    private String website;
    private Data data;
    private Long appId;
    public class Data{
        private String process_code;
        private String content;
        private ReqMsgTpl req_msg_tpl;
        class ReqMsgTpl{
            private String type;
            public String getType() {
                return type;
            }
            public void setType(String type) {
                this.type = type;
            }
        }
        public String getProcess_code() {
            return process_code;
        }
        public void setProcess_code(String process_code) {
            this.process_code = process_code;
        }
        public String getContent() {
            return content;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public ReqMsgTpl getReq_msg_tpl() {
            return req_msg_tpl;
        }
        public void setReq_msg_tpl(ReqMsgTpl req_msg_tpl) {
            this.req_msg_tpl = req_msg_tpl;
        }
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
