package com.xingguang.cell.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  10:05
 * @Version v1.0.0
 */
public class JxlCellBehaviorEntity implements Serializable {

    private Long id;
    private Long rptId;
    private String cellOperator; // 运营商
    private String cellOperatorZh; // 运营商(中文)
    private String cellPhoneNum; // 号码
    private String cellLoc; // 归属地
    private String cellMth; // 月份
    private Integer callCnt; // 呼叫次数
    private Integer callOutCnt; // 主叫次数
    private BigDecimal callOutTime; // 主叫次数
    private Integer callInCnt; // 被叫次数
    private BigDecimal callInTime; // 被叫时间
    private BigDecimal netFlow; // 流量
    private Integer smsCnt; // 短信数目
    private BigDecimal totalAmount; // 话费消费(元)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRptId() {
        return rptId;
    }

    public void setRptId(Long rptId) {
        this.rptId = rptId;
    }

    public String getCellOperator() {
        return cellOperator;
    }

    public void setCellOperator(String cellOperator) {
        this.cellOperator = cellOperator;
    }

    public String getCellOperatorZh() {
        return cellOperatorZh;
    }

    public void setCellOperatorZh(String cellOperatorZh) {
        this.cellOperatorZh = cellOperatorZh;
    }

    public String getCellPhoneNum() {
        return cellPhoneNum;
    }

    public void setCellPhoneNum(String cellPhoneNum) {
        this.cellPhoneNum = cellPhoneNum;
    }

    public String getCellLoc() {
        return cellLoc;
    }

    public void setCellLoc(String cellLoc) {
        this.cellLoc = cellLoc;
    }

    public String getCellMth() {
        return cellMth;
    }

    public void setCellMth(String cellMth) {
        this.cellMth = cellMth;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public Integer getCallOutCnt() {
        return callOutCnt;
    }

    public void setCallOutCnt(Integer callOutCnt) {
        this.callOutCnt = callOutCnt;
    }

    public BigDecimal getCallOutTime() {
        return callOutTime;
    }

    public void setCallOutTime(BigDecimal callOutTime) {
        this.callOutTime = callOutTime;
    }

    public Integer getCallInCnt() {
        return callInCnt;
    }

    public void setCallInCnt(Integer callInCnt) {
        this.callInCnt = callInCnt;
    }

    public BigDecimal getCallInTime() {
        return callInTime;
    }

    public void setCallInTime(BigDecimal callInTime) {
        this.callInTime = callInTime;
    }

    public BigDecimal getNetFlow() {
        return netFlow;
    }

    public void setNetFlow(BigDecimal netFlow) {
        this.netFlow = netFlow;
    }

    public Integer getSmsCnt() {
        return smsCnt;
    }

    public void setSmsCnt(Integer smsCnt) {
        this.smsCnt = smsCnt;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
