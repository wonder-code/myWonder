package com.zl.design.abstractfactory.intef;

import com.zl.design.abstractfactory.pojo.Product1;
import com.zl.design.abstractfactory.pojo.Product2;

public interface ProductFactory {
    public Product1 createProduct1();
    public Product2 createProduct2();
}
