package com.json;

/**
 * Created by kang on 18/9/12.
 */
public enum WeekEnum {

    // 因为已经定义了带参数的构造器，所以在列出枚举值时必须传入对应的参数
    SUNDAY("星期日"), MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六");

    //定义一个private 的成员变量
    private String date;

    //定义一个带参数的构造器，枚举类构造器只能有private修饰
    private WeekEnum(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }
}
