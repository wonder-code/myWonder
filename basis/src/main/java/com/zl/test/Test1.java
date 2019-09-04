package com.zl.test;

import com.zl.algorithm.sort.*;
import javafx.scene.control.TreeTableView;
import org.junit.Test;

import java.util.Random;

public class Test1 {
    @Test
    public void test(){

    }
    @Test
    public void sortTest(){
        BubbleSort bubbleSort = new BubbleSort();   //2648ms
        HeapSort heapSort = new HeapSort();         //stack over flow!!
        InsertSort insertSort = new InsertSort();   //2550ms
        MergeSort mergeSort = new MergeSort();      //90ms
        QuickSort quickSort = new QuickSort();      //80ms
        RadixSort radixSort = new RadixSort();      //154ms
        SelectionSort selectionSort = new SelectionSort();      //7759ms
        ShellSort shellSort = new ShellSort();      //78ms
        int[] ary = new int[100000];
        System.out.println("开始生产数组:"+System.currentTimeMillis());
        for(int i=0;i<100000;i++){
            ary[i] = new Random().nextInt(100000);
        }
        long t1 = System.currentTimeMillis();
        ary = heapSort.sort(ary);
        long t2 = System.currentTimeMillis();
        boolean flag=true;
        for(int i=0;i<100000-1;i++){
           if(ary[i+1]<ary[i]){
               flag=false;
           }
        }
        System.out.println(t2-t1+"ms  "+flag);
    }
}
