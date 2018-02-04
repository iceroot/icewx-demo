package com.iceyyy.icewx.test;

import cn.hutool.core.date.DateException;
import cn.hutool.core.date.DateUtil;

public class Main {

    public static void main(String[] args) {
       System.out.println(isDate("20170101"));
       System.out.println(isDate("20170101A"));

    }

    private static boolean isDate(String dateStr) {
        try {
            DateUtil.parse(dateStr);
            return true;
        } catch (DateException e) {
            return false;
        }
    }

}
