package com.xingguang.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by admin on 2017/11/1.
 */
public class DateUtils {

    public static String getCurrentDate(){
        Calendar cal=Calendar.getInstance();
        Date time=cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    public static String convertTimeStr(String s){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args){
        System.out.println(convertTimeStr("1512183001666"));
    }

}
