package com.xingguang.customer.bankcard.entity;

import com.xingguang.customer.bank.entity.CusBank;

public class CusBankCardForList {

    private Long id;

    private CusBank cusBank;

    private CusBankCard cusBankCard;

    public CusBankCardForList(CusBankCard cusBankCard, CusBank cusBank) {
        this.cusBank = cusBank;
        this.cusBankCard = cusBankCard;
        this.id = cusBankCard.getId();
        String cardNo = cusBankCard.getCardNo();
        if(cardNo.length() > 4){
            cardNo = cardNo.substring(cardNo.length() - 4, cardNo.length());
        }
        this.cusBankCard.setCardNo(cardNo);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CusBank getCusBank() {
        return cusBank;
    }

    public void setCusBank(CusBank cusBank) {
        this.cusBank = cusBank;
    }

    public CusBankCard getCusBankCard() {
        return cusBankCard;
    }

    public void setCusBankCard(CusBankCard cusBankCard) {
        this.cusBankCard = cusBankCard;
    }
}