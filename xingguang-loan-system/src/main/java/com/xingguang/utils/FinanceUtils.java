package com.xingguang.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by admin on 2017/10/21.
 */
public class FinanceUtils {

    /**
     *  服务费（手续费） = 借款金额 * 服务费率
     * @param amount  借款金额
     * @param serviceRate  服务费率
     * @return 服务费，四舍五入
     */
    public static BigDecimal getServiceCharge(BigDecimal amount , BigDecimal serviceRate){
        return amount.multiply(serviceRate).setScale(2 , BigDecimal.ROUND_HALF_UP);
    }

    /**
     *  账户管理费 = 借款金额 * 账户管理费率
     * @param amount 借款金额
     * @param accMgmtRate 账户管理费率
     * @return 账户管理费 ，四舍五入
     */
    public static BigDecimal getAccMgmtCharge(BigDecimal amount , BigDecimal accMgmtRate){
        return amount.multiply(accMgmtRate).setScale(2 , BigDecimal.ROUND_HALF_UP);
    }

    /**
     *  本金 = 贷款金额 / 期数
     * @param amount 借款金额
     * @param term 期数
     * @return 本金 ， 四舍五入
     */
    public static BigDecimal getPrincipalAmount(BigDecimal amount , int term){
        return amount.divide(new BigDecimal(term) , 2 , RoundingMode.HALF_UP);
    }

    /**
     *  利息 = 借款金额 * 天利率 * 借款天数
     * @param amount 借款金额
     * @param rate 天利率
     * @param days 借款天数
     * @return 利息 ， 四舍五入
     */
    public static BigDecimal getInterestAmount(BigDecimal amount , BigDecimal rate , int days){
        return amount.multiply(rate).multiply(new BigDecimal(days)).setScale(2 , RoundingMode.HALF_UP);
    }

    /**
     *  计划还款日期 = 借款日期 + days
     * @param loanDate 借款日期
     * @param days 借款天数
     * @return 计划还款日期
     */
    public static Date getPlanRepymtDate(Date loanDate , int days){
        Calendar c = Calendar.getInstance();
        c.setTime(loanDate);
        c.add(Calendar.DAY_OF_MONTH, days);
        return c.getTime();
    }

    public static void main(String[] args) {
        BigDecimal a;
        BigDecimal b;
        a = new BigDecimal(1000);
        b = new BigDecimal(0.01);
        int c = 7;
        System.out.println("===="+getInterestAmount(a,b,c));
    }

}
