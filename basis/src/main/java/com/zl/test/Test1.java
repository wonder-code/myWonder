package com.zl.test;

import com.zl.sort.*;
import org.junit.Test;

import java.util.Collections;

public class Test1 {
    @Test
    public void test(){
        for(int i: ShellSort.sort(new int[]{0,1,2,3,4,9,8,7,6,5})){
            System.out.print(i);
        }

    }
    @Test
    public void test1(){
        System.out.println(3+4>>1);
        System.out.println(3+4/2);
    }
}
