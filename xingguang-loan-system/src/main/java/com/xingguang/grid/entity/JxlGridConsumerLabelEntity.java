package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  19:20
 * @Version v1.0.0
 */
public class JxlGridConsumerLabelEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String ifOwnCc;
    private String ownWgCc;
    private String ifOwnCar;
    private String ifPayIns;
    private String ifFinBuyPre6;
    private String cstScoreFinally;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public String getIfOwnCc() {
        return ifOwnCc;
    }

    public void setIfOwnCc(String ifOwnCc) {
        this.ifOwnCc = ifOwnCc;
    }

    public String getOwnWgCc() {
        return ownWgCc;
    }

    public void setOwnWgCc(String ownWgCc) {
        this.ownWgCc = ownWgCc;
    }

    public String getIfOwnCar() {
        return ifOwnCar;
    }

    public void setIfOwnCar(String ifOwnCar) {
        this.ifOwnCar = ifOwnCar;
    }

    public String getIfPayIns() {
        return ifPayIns;
    }

    public void setIfPayIns(String ifPayIns) {
        this.ifPayIns = ifPayIns;
    }

    public String getIfFinBuyPre6() {
        return ifFinBuyPre6;
    }

    public void setIfFinBuyPre6(String ifFinBuyPre6) {
        this.ifFinBuyPre6 = ifFinBuyPre6;
    }

    public String getCstScoreFinally() {
        return cstScoreFinally;
    }

    public void setCstScoreFinally(String cstScoreFinally) {
        this.cstScoreFinally = cstScoreFinally;
    }
}
