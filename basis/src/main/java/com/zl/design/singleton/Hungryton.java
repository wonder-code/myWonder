package com.zl.design.singleton;
/**
 * 单例模式/饿汉式
 */
public class Hungryton {
    private static final Hungryton hungryton = new Hungryton();
    private Hungryton(){}
    private int count = 0;

    public static Hungryton getInstance(){
        return hungryton;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
