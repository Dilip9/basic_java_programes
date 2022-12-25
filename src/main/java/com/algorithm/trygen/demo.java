package com.algorithm.trygen;

import java.util.Arrays;

public class demo {

    public static void main(String[] args){
        int[] arr = {3,5,7,9,3,6,7};
        int sum= 8;
        /*
        * find sum of give number from given array.
        * */
        Arrays.sort(arr);
        sumOfTwoArrayValue(arr,sum);

    }

    private static void sumOfTwoArrayValue(int[] arr, int sum) {

        int low=0, high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==sum){
                System.out.println(" combination of "+arr[low]+" and "+arr[high]+" is "+sum);
            }
            if(arr[low]+arr[high]<sum){
                low++;
            }
            else high--;
        }
    }
}
