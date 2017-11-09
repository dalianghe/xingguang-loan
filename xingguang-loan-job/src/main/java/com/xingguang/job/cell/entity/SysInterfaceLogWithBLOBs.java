package com.xingguang.job.cell.entity;

public class SysInterfaceLogWithBLOBs extends SysInterfaceLog {
    private String sendData;

    private String receiveData;

    public String getSendData() {
        return sendData;
    }

    public void setSendData(String sendData) {
        this.sendData = sendData == null ? null : sendData.trim();
    }

    public String getReceiveData() {
        return receiveData;
    }

    public void setReceiveData(String receiveData) {
        this.receiveData = receiveData == null ? null : receiveData.trim();
    }
}