package com.zl.test;

import com.zl.design.prototype.Citation;
import org.junit.Test;

public class prototypetest {
    @Test
    public  void protoTypeTest() throws CloneNotSupportedException {
        Citation citation = new Citation("张三","得奖状","清华大学");
        System.out.println( citation.display());
        Citation citation1 = (Citation) citation.clone();
        citation1.setName("李四");
        System.out.println(citation1.display());
    }
}
