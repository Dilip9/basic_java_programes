package com.algorithm.example;

import java.util.Scanner;


/* Binary search algorithm   */
public class BinarySearch {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();  // Item to bo found in an array.
        int[] arr = new int[10];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Elements into an array:::::");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
//        int result = binarySearchs(arr,0,n,x);
        int normalLoop = binarySearchNormal(arr,0,n,x);
//        if(result == -1){
//            System.out.println(" ::::::::::: Element not found ::::::::::");
//        }
//        else {
//            System.out.println(":::::::: Element found at index::::" + result);
//        }

        if(normalLoop == -1){
            System.out.println(" ::::::::::: Element not found ::::::::::");
        }
        else
            System.out.println(":::::::: Element found at index::::"+normalLoop);

    }

    //Recursive Approach.
    private static int binarySearchs(int[] arr, int l, int n, int x) {
        if(n>=l){
            int mid =l+(n-1)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return binarySearchs(arr,l,mid-1,x);
            }
            return binarySearchs(arr,mid+1,n,x);
        }
        return -1;
    }

    //Normal Approach
    private static int binarySearchNormal(int[] arr, int low, int high, int search ){
        int mid = low+(high-1)/2;
        while(high-low>1){
            if(arr[mid]<search){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        if(arr[low] == search){
            return low;
        }
        else if(arr[high]== search){
            return high;
        }
        else
            return -1;
    }
}
