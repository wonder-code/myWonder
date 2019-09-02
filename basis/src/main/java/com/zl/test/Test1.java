package com.zl.test;

import com.zl.algorithm.sort.*;
import org.junit.Test;

public class Test1 {
    private int[] array = new int[]{73,17,123,13,25,442,22,34,65,53};
    @Test
    public void test(){
        for(int i: HeapSort.buildMaxHeap(array,0)){
            System.out.print(i+" ");
        }

    }
    @Test
    public void test1(){
        System.out.println(3+4>>1);
        System.out.println(3+4/2);
    }
}
