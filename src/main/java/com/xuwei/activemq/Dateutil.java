package com.xuwei.activemq;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutil {
    public static void main(String[] args) {
        System.out.println(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
