package com.xingguang.utils;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/12  12:55
 * @Version v1.0.0
 */
public class MapUtils {

    private static double EARTH_RADIUS = 6371.393;
    private static double rad(double d){
        return d * Math.PI / 180.0;
    }

    /**
     * 计算两个经纬度之间的距离
     * @param lat1
     * @param lng1
     * @param lat2
     * @param lng2
     * @return
     */
    public static double GetDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
                Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 1000);
        return s;
    }

    /**
     * 计算两个经纬度之间的距离
     * @param lat1Str
     * @param lng1Str
     * @param lat2Str
     * @param lng2Str
     * @return
     */
    public static double GetDistance(String lat1Str, String lng1Str, String lat2Str, String lng2Str) {
        double lat1 = Double.parseDouble(lat1Str);
        double lng1 = Double.parseDouble(lng1Str);
        double lat2 = Double.parseDouble(lat2Str);
        double lng2 = Double.parseDouble(lng2Str);
        return GetDistance(lat1, lng1, lat2, lng2);
    }

    public static void main(String[] args) {
        System.out.println(MapUtils.GetDistance(116.337853,39.759187,116.334538,39.758917));
    }
}
