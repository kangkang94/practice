package com.json;

/**
 * Created by kang on 18/9/12.
 */
public class Test01 {
    public static void main(String[] args){

        System.out.println(WeekEnum.SATURDAY);

        for (WeekEnum weekEnum : WeekEnum.values()){
            System.out.println(weekEnum);
        }

        System.out.println(WeekEnum.SATURDAY.ordinal());
    }
}
