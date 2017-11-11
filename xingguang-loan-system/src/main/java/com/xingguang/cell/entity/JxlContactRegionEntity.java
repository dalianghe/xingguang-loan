package com.xingguang.cell.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  12:10
 * @Version v1.0.0
 */
public class JxlContactRegionEntity implements Serializable {

    private Long id;
    private Long rptId;
    private String regionLoc; // 联系人的号码归属地
    private Integer regionUniqNumCnt; // 去重后的联系人号码数量
    private Integer regionCallInCnt; // 电话呼入次数
    private Integer regionCallOutCnt; // 电话呼出次数
    private BigDecimal regionCallInTime; // 电话呼入总时间（分）
    private BigDecimal regionCallOutTime; // 电话呼出总时间（分）
    private BigDecimal regionAvgCallInTime; // 平均电话呼入时间（分）
    private BigDecimal regionAvgCallOutTime; // 平均电话呼出时间（分）
    private BigDecimal regionCallInCntPct; // 电话呼入次数百分比
    private BigDecimal regionCallOutCntPct; // 电话呼出次数百分比
    private BigDecimal regionCallInTimePct; // 电话呼入时间百分比
    private BigDecimal regionCallOutTimePct; // 电话呼出时间百分比

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

    public String getRegionLoc() {
        return regionLoc;
    }

    public void setRegionLoc(String regionLoc) {
        this.regionLoc = regionLoc;
    }

    public Integer getRegionUniqNumCnt() {
        return regionUniqNumCnt;
    }

    public void setRegionUniqNumCnt(Integer regionUniqNumCnt) {
        this.regionUniqNumCnt = regionUniqNumCnt;
    }

    public Integer getRegionCallInCnt() {
        return regionCallInCnt;
    }

    public void setRegionCallInCnt(Integer regionCallInCnt) {
        this.regionCallInCnt = regionCallInCnt;
    }

    public Integer getRegionCallOutCnt() {
        return regionCallOutCnt;
    }

    public void setRegionCallOutCnt(Integer regionCallOutCnt) {
        this.regionCallOutCnt = regionCallOutCnt;
    }

    public BigDecimal getRegionCallInTime() {
        return regionCallInTime;
    }

    public void setRegionCallInTime(BigDecimal regionCallInTime) {
        this.regionCallInTime = regionCallInTime;
    }

    public BigDecimal getRegionCallOutTime() {
        return regionCallOutTime;
    }

    public void setRegionCallOutTime(BigDecimal regionCallOutTime) {
        this.regionCallOutTime = regionCallOutTime;
    }

    public BigDecimal getRegionAvgCallInTime() {
        return regionAvgCallInTime;
    }

    public void setRegionAvgCallInTime(BigDecimal regionAvgCallInTime) {
        this.regionAvgCallInTime = regionAvgCallInTime;
    }

    public BigDecimal getRegionAvgCallOutTime() {
        return regionAvgCallOutTime;
    }

    public void setRegionAvgCallOutTime(BigDecimal regionAvgCallOutTime) {
        this.regionAvgCallOutTime = regionAvgCallOutTime;
    }

    public BigDecimal getRegionCallInCntPct() {
        return regionCallInCntPct;
    }

    public void setRegionCallInCntPct(BigDecimal regionCallInCntPct) {
        this.regionCallInCntPct = regionCallInCntPct;
    }

    public BigDecimal getRegionCallOutCntPct() {
        return regionCallOutCntPct;
    }

    public void setRegionCallOutCntPct(BigDecimal regionCallOutCntPct) {
        this.regionCallOutCntPct = regionCallOutCntPct;
    }

    public BigDecimal getRegionCallInTimePct() {
        return regionCallInTimePct;
    }

    public void setRegionCallInTimePct(BigDecimal regionCallInTimePct) {
        this.regionCallInTimePct = regionCallInTimePct;
    }

    public BigDecimal getRegionCallOutTimePct() {
        return regionCallOutTimePct;
    }

    public void setRegionCallOutTimePct(BigDecimal regionCallOutTimePct) {
        this.regionCallOutTimePct = regionCallOutTimePct;
    }
}
