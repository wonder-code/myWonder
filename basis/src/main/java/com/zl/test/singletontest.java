package com.zl.test;

import com.zl.design.singleton.Hungryton;
import com.zl.design.singleton.Lazyton;
import org.junit.Test;

public class singletontest {
    @Test
    public void singleTonTest(){
        Lazyton lazyton1 = Lazyton.getInstance();
        lazyton1.setCount(10);
        Lazyton lazyton2 = Lazyton.getInstance();
        System.out.println(lazyton2.getCount());

        Hungryton hungryton1 = Hungryton.getInstance();
        hungryton1.setCount(10);
        Hungryton hungryton2 = Hungryton.getInstance();
        System.out.println(hungryton2.getCount());
    }
}
