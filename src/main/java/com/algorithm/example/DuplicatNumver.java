package com.algorithm.example;


import java.util.Stack;

public class DuplicatNumver {

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,5,6,6,3,5,2,6,7,8,4,7,4};
        duplicate(arr);
        duplicateData(arr);
        duplicate(arr);
    }

    private static void duplicateData(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n; i++){
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        }
        for (int i=0; i<n;i++){
            if(arr[i] >= n*2){
                System.out.println(i+" ");
            }
        }
    }

    private static void duplicate(int[] arr){
        int n = arr.length;
        Stack<Integer> duplicate = new Stack<>();
        for(int i=0;i<n-1;i++){
            if(duplicate.empty() || duplicate.peek()!=arr[i]){
                duplicate.push(arr[i]);
            }
        }
        System.out.println("    ::::: "+duplicate);
    }


}
