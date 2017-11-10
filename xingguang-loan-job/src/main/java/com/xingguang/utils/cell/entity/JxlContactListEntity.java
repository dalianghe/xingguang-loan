package com.xingguang.utils.cell.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  13:23
 * @Version v1.0.0
 */
public class JxlContactListEntity implements Serializable {
    private Long id;
    private Long rptId;
    private String phoneNum; // 号码
    private String phoneNumLoc; // 号码归属地
    private String contactName; // 号码被标注的名称
    private String needsType; // 被标注的名称的类型
    private Integer callCnt; // 通话次数
    private BigDecimal callLen; // 通话时长(分）
    private Integer callOutCnt; // 呼出次数
    private BigDecimal callOutLen; // 呼出时间(分）
    private Integer callInCnt; // 呼入次数
    private BigDecimal callInLen; // 呼入时间(分）
    private String pRelation; // 关系推测（未实现）
    private Integer contact_1w; // 最近一周联系次数
    private Integer contact_1m; // 最近一月联系次数
    private Integer contact_3m; // 最近三月联系次数
    private Integer contact_3m_plus; // 三个月以上联系次数
    private Integer contactEarlyMorning; // 凌晨联系次数
    private Integer contactMorning; // 上午联系次数
    private Integer contactNoon; // 中午联系次数
    private Integer contactAfternoon; // 下午联系次数
    private Integer contactNight; // 晚上联系次数
    private String contactAllDay; // 是否全天联系
    private Integer contactWeekday; // 周中联系次数
    private Integer contactWeekend; // 周末联系次数
    private Integer contactHoliday; // 节假日联系次数

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNumLoc() {
        return phoneNumLoc;
    }

    public void setPhoneNumLoc(String phoneNumLoc) {
        this.phoneNumLoc = phoneNumLoc;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getNeedsType() {
        return needsType;
    }

    public void setNeedsType(String needsType) {
        this.needsType = needsType;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public BigDecimal getCallLen() {
        return callLen;
    }

    public void setCallLen(BigDecimal callLen) {
        this.callLen = callLen;
    }

    public Integer getCallOutCnt() {
        return callOutCnt;
    }

    public void setCallOutCnt(Integer callOutCnt) {
        this.callOutCnt = callOutCnt;
    }

    public BigDecimal getCallOutLen() {
        return callOutLen;
    }

    public void setCallOutLen(BigDecimal callOutLen) {
        this.callOutLen = callOutLen;
    }

    public Integer getCallInCnt() {
        return callInCnt;
    }

    public void setCallInCnt(Integer callInCnt) {
        this.callInCnt = callInCnt;
    }

    public BigDecimal getCallInLen() {
        return callInLen;
    }

    public void setCallInLen(BigDecimal callInLen) {
        this.callInLen = callInLen;
    }

    public String getpRelation() {
        return pRelation;
    }

    public void setpRelation(String pRelation) {
        this.pRelation = pRelation;
    }

    public Integer getContact_1w() {
        return contact_1w;
    }

    public void setContact_1w(Integer contact_1w) {
        this.contact_1w = contact_1w;
    }

    public Integer getContact_1m() {
        return contact_1m;
    }

    public void setContact_1m(Integer contact_1m) {
        this.contact_1m = contact_1m;
    }

    public Integer getContact_3m() {
        return contact_3m;
    }

    public void setContact_3m(Integer contact_3m) {
        this.contact_3m = contact_3m;
    }

    public Integer getContact_3m_plus() {
        return contact_3m_plus;
    }

    public void setContact_3m_plus(Integer contact_3m_plus) {
        this.contact_3m_plus = contact_3m_plus;
    }

    public Integer getContactEarlyMorning() {
        return contactEarlyMorning;
    }

    public void setContactEarlyMorning(Integer contactEarlyMorning) {
        this.contactEarlyMorning = contactEarlyMorning;
    }

    public Integer getContactMorning() {
        return contactMorning;
    }

    public void setContactMorning(Integer contactMorning) {
        this.contactMorning = contactMorning;
    }

    public Integer getContactNoon() {
        return contactNoon;
    }

    public void setContactNoon(Integer contactNoon) {
        this.contactNoon = contactNoon;
    }

    public Integer getContactAfternoon() {
        return contactAfternoon;
    }

    public void setContactAfternoon(Integer contactAfternoon) {
        this.contactAfternoon = contactAfternoon;
    }

    public Integer getContactNight() {
        return contactNight;
    }

    public void setContactNight(Integer contactNight) {
        this.contactNight = contactNight;
    }

    public String getContactAllDay() {
        return contactAllDay;
    }

    public void setContactAllDay(String contactAllDay) {
        this.contactAllDay = contactAllDay;
    }

    public Integer getContactWeekday() {
        return contactWeekday;
    }

    public void setContactWeekday(Integer contactWeekday) {
        this.contactWeekday = contactWeekday;
    }

    public Integer getContactWeekend() {
        return contactWeekend;
    }

    public void setContactWeekend(Integer contactWeekend) {
        this.contactWeekend = contactWeekend;
    }

    public Integer getContactHoliday() {
        return contactHoliday;
    }

    public void setContactHoliday(Integer contactHoliday) {
        this.contactHoliday = contactHoliday;
    }
}
