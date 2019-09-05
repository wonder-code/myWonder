package com.zl.design.singleton;

/**
 * 单例模式/懒汉式
 */
public class Lazyton {
    private static volatile Lazyton lazyton = null;     //volatile关键字保证线程安全
    private Lazyton(){}
    private int count=0;

    public static synchronized Lazyton getInstance(){   //  synchronized关键字保证线程安全
        if(lazyton == null){
            lazyton = new Lazyton();
        }
        return lazyton;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
