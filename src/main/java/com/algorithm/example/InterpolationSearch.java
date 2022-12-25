package com.algorithm.example;

import java.util.Scanner;

public class InterpolationSearch {

    public static void main(String[] args){

        int n, search;
        int[] arr = new int[10];
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter the size of array:::");
        n = scn.nextInt();
        search = scn.nextInt();
        System.out.println(" Enter the array elements:::::");
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Array available data is ::::::::");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int index = interpolationSearchs(arr, search);
        if(index==-1){
            System.out.println(" Element not found.");
        }
        else
            System.out.println("Element not found at "+index+"index.");
    }
    public static int interpolationSearchs(int arr[], int search){
        int l = 0;
        int high = arr.length-1;
        int pos;
        while(arr[l] <=search && arr[high]>= search){
            if(arr[high] -arr[l]==0){
                return (l+high)/2;
            }
            pos = l+((search-arr[l])*(high-l))/(arr[high]-arr[l]);
            if (arr[pos]<search){
                l = pos+1;
            }
            else if (arr[pos]>search){
                high=pos-1;
            }
            else return pos;
        }
        if (arr[l] == search){
            return l;
        }
        else return -1;
    }
}
