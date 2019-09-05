package com.zl.design.factorymethod.impl;

import com.zl.design.factorymethod.intef.MiFactoryIntef;
import com.zl.design.factorymethod.pojo.Mi;

public class MiFactory implements MiFactoryIntef {
    public Mi creatProduct() {
        System.out.println("工厂开始生产Mi...");
        return new Mi();
    }
}
