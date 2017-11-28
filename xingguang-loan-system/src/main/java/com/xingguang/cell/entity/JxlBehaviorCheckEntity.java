package com.xingguang.cell.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/28  10:41
 * @Version v1.0.0
 */
public class JxlBehaviorCheckEntity implements Serializable {
    private Long id;
    private Long rptId;
    private String checkPoint;
    private String checkPointCn;
    private String result;
    private String evidence;
    private String score;

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

    public String getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
    }

    public String getCheckPointCn() {
        return checkPointCn;
    }

    public void setCheckPointCn(String checkPointCn) {
        this.checkPointCn = checkPointCn;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
