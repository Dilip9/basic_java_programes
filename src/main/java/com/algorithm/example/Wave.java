package com.algorithm.example;

import java.util.Arrays;


public class Wave {
    public static void main(String[] args){
        int[] arr = {3,4,6,1,3,8,3,5,9,10};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            swap(arr,i,i+1);

        }
    }
    public static int swap(int[]a, int l, int r){
        int temp=a[l];
        a[l] = a[r];
        a[r]=temp;
        return temp;
    }
}
