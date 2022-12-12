package com.algorithm.interviewquestions;

public class DuplicateElementsUsingArrayOn {

    public static void main(String[] args){
        int[] arr = {2,5,3,7,8,4,9,2,6,3,7,8,8,2};
        duplicate(arr); // 1st Approach using 2 for loop.
        duplicateS(arr); // 2nd Approach using O(n) approach.
    }

    private static void duplicateS(int[] arr) {

        System.out.println(":::::::::::::::: Print Duplicate from Number using O(n)  :::::::::::::::::::::::::");
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        }
        for (int i=0; i<n; i++){
            if(arr[i] >= n*2){
                System.out.println(i+" ");
            }
        }
    }

    private static void duplicate(int[] arr) {
        System.out.println(":::::::::::::::: Print Duplicate from Number using for loop  :::::::::::::::::::::::::");
        int n = arr.length;
        for(int i=0; i<n;i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }




}
