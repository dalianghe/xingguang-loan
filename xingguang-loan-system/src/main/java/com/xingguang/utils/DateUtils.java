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

}
