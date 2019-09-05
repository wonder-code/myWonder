package com.zl.design.abstractfactory.impl;

import com.zl.design.abstractfactory.pojo.Product1;
import com.zl.design.abstractfactory.pojo.Product2;

public class ProductFactory implements com.zl.design.abstractfactory.intef.ProductFactory {
    public Product1 createProduct1() {
        System.out.println("开始生产1...");
        return new Product1();
    }

    public Product2 createProduct2() {
        System.out.println("开始生产2...");
        return new Product2();
    }
}
