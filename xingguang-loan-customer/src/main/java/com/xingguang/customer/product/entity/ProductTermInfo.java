package com.xingguang.customer.product.entity;

import java.math.BigDecimal;

public class ProductTermInfo {
    private Long id;

    private Long productId;

    private BigDecimal rate;

    private Integer termNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getTermNumber() {
        return termNumber;
    }

    public void setTermNumber(Integer termNumber) {
        this.termNumber = termNumber;
    }
}