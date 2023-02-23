package com.algorithm.accolite;

/*
* Find missing number from an array of 10 natural numbers eg - {1,2,3,4,5,6,8,9,10} - output should be 7
*
* An array contains random 0's , 1's and 2's. eg -{0,1,2,2,1,1,0} -
Rearrange the input array so the output should contain all the 0s followed by all the 1s followed by all the 2s. Something like this {0,0,1,1,1,2,2}
But you are not allowed to use internal AIPs like Collections.sort or Tree Maps and all etc
*
* Find the uncommon number between two list integer data array.
* l1 = Arrays.asList(1,3,5,7),l2 = Arrays.asList(5,1,9);
*
*
*
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accolite {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int[] mixxData = {0,1,2,2,1,1,0};
        int n = 10;
        int missingNumber = findMissingNumber(arr,n);
        System.out.println(missingNumber);
        zerosOneTwo(mixxData);
        List<Integer> l1= Arrays.asList(1,3,5,7);
        List<Integer> l2 = Arrays.asList(5,1,9);
        List<Integer> result = l1.stream().filter(x ->!l2.contains(x)).collect(Collectors.toList());
        result.addAll(l2.stream().filter(x ->!l1.contains(x)).collect(Collectors.toList()));//.stream().filter(x ->!l2.contains(x)).collect(Collectors.toList());
        System.out.println(result);


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
