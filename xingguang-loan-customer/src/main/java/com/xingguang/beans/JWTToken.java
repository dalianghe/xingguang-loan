package com.xingguang.beans;

public class JWTToken {

    private Long userId;
    private String phone;

    public JWTToken(){

    }

    public JWTToken(Long userId, String phone){
        this.userId = userId;
        this.phone = phone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "JWTToken{" +
                "userId=" + userId +
                ", phone='" + phone + '\'' +
                '}';
    }
}
