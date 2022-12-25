package com.algorithm.array;

import java.util.ArrayList;

public class SumOfSubarray {
    
    public static void main(String[] args){
        
        int[] arr = {3,5,6,7,8,2,3,5,7,9};
        int n=arr.length, sum=12;
        System.out.println(subArraySum(arr,n,sum));
    }

    private static ArrayList<Integer> subArraySum(int[] arr, int n, int sum) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        int temp=0, start=1, end=0;
        if(temp==sum){
            arrlist.add(-1);
            return arrlist;
        }
        for(int i=0;i<n-1;i++){
            temp += arr[i];
            end++;
            while (temp>sum){
                temp -= arr[start-1];
                start++;
            }
        }
        if(temp==sum){
            arrlist.add(start);
            arrlist.add(end);
        }
        else
            arrlist.add(-1);
        return arrlist;
    }
}
