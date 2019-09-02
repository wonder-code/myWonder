package com.zl.algorithm.sort;

public class HeapSort {
    public static int[] buildMaxHeap(int[] array,int a){
        if(a==array.length-1){
            return array;
        }
        for(int i=array.length;i>=a;i--){
            array = heap(array,i);
        }
        buildMaxHeap(array,a+1);
        return array;
    }

    public static int[] heap(int[] array,int currentIndex){
        int size = array.length;
        if(currentIndex>size){
            return array;
        }
        int left = 2*currentIndex+1;
        int right = 2*currentIndex+2;
        int max = currentIndex;
        if(left<size && array[left]>array[currentIndex]){
            max = left;
        }
        if(right<size && array[right]>array[currentIndex]){
            max = right;
        }
        if(max!=currentIndex){
            int temp = array[currentIndex];
            array[currentIndex] = array[max];
            array[max] = temp;
            heap(array,max);
        }
        return array;
    }
}
