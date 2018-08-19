package org.spring.springboot.util;

import java.text.DecimalFormat;

public class GPSFormatUtils {
    private static final double EARTH_RADIUS = 6371.393;//m
    static DecimalFormat df = new DecimalFormat("#.000000");

    //经度 longitude
    //纬度 latitude

    private static double getLatitude(int i) {

        double d = Double.parseDouble(df.format((Math.PI * EARTH_RADIUS) / 180)) * i; //s
        return d;
    }

    private static double getLongitude(double lat, int i) {
        double d = (Math.PI * EARTH_RADIUS * getCos(lat)) / 180;
        return Double.parseDouble(df.format(d));
    }

    public static void main(String[] args) {
        System.out.println(getLatitude(1));
        System.out.println(getLongitude(45, 1));
        double distance = getDistance(34.2675560000, 108.9534750000,
                34.2464320000, 108.9534750000);
        System.out.println("距离" + distance / 1000 + "公里");
    }

    private static double distance(double lng1, double lat1, double lng2, double lat2) {
        double lngDis = (lng1 - lng2);
        double latDis = (lat1 - lat2);
        return 0.0;
    }

    private static double getCos(double d) {
        return Double.parseDouble(df.format(Math.cos(Math.PI / (180 / d))));
    }

    public static double getDistance(double lat1, double lng1, double lat2,
                                     double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;
        s = s * 1000;
        return s;
    }

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
}
