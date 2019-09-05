package com.zl.design.factorymethod.impl;
import com.zl.design.factorymethod.intef.AppleFactoryIntef;
import com.zl.design.factorymethod.pojo.Apple;

public class AppleFactory implements AppleFactoryIntef {
    public Apple creatProduct() {
        System.out.println("工厂开始生产Apple...");
        return new Apple();
    }
}
