package com.zl.test;

import com.zl.design.abstractfactory.intef.ProductFactory;
import com.zl.design.factorymethod.impl.AppleFactory;
import com.zl.design.factorymethod.impl.MiFactory;
import com.zl.design.factorymethod.intef.AppleFactoryIntef;
import com.zl.design.factorymethod.intef.MiFactoryIntef;
import com.zl.design.factorymethod.pojo.Apple;
import com.zl.design.factorymethod.util.XmlReader;
import org.junit.Test;

public class factorytest {
    @Test
    public void factoryTest(){
        AppleFactoryIntef appleFactoryIntef = new AppleFactory();
        Apple apple = appleFactoryIntef.creatProduct();
        MiFactoryIntef miFactoryIntef = new MiFactory();
        miFactoryIntef.creatProduct();
    }
    @Test
    public void xmltest(){
        AppleFactoryIntef appleFactory = (AppleFactory) XmlReader.getObject();
        appleFactory.creatProduct();
    }
    @Test
    public void test(){
        ProductFactory productFactory = new com.zl.design.abstractfactory.impl.ProductFactory();
        productFactory.createProduct1();
        productFactory.createProduct2();
    }
}
