package com.algorithm;

/*
* Find missing number from an array of 10 natural numbers eg - {1,2,3,4,5,6,8,9,10} - output should be 7
*
* An array contains random 0's , 1's and 2's. eg -{0,1,2,2,1,1,0} -
Rearrange the input array so the output should contain all the 0s followed by all the 1s followed by all the 2s. Something like this {0,0,1,1,1,2,2}
But you are not allowed to use internal AIPs like Collections.sort or Tree Maps and all etc
*
*
*
* */


public class Accolite {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int[] mixxData = {0,1,2,2,1,1,0};
        int n = 10;
        int missingNumber = findMissingNumber(arr,n);
        System.out.println(missingNumber);
        zerosOneTwo(mixxData);

    }

    private static void zerosOneTwo(int[] mixxData) {
        int n = mixxData.length;
        int zeros=0, ones=0,twos=0,j;
        for(int i=0;i<n;i++){
            switch (mixxData[i]){
                case 0:
                    zeros++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
            }
        }
        j=0;
        while (zeros>0){
            mixxData[j++] = 0;
            zeros--;
        }
        while (ones>0){
            mixxData[j++] = 1;
            ones--;
        }
        while (twos>0){
            mixxData[j++] = 2;
            twos--;
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+mixxData[i]);
        }
        System.out.println();

    }

    public static int findMissingNumber(int[] arr, int n){
        int totalSum = 0;
        totalSum = ((n)*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            totalSum -= arr[i];
        }
        return totalSum;
    }

}
