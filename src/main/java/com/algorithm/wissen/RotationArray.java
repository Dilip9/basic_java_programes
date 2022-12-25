package com.algorithm.wissen;

import java.util.Arrays;

/* Rotate an array based on input size n=3 arr={4,6,2,5,8,1,4,6,7,8,9} */
public class RotationArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int rotation=4;
        System.out.println("Before Rotation");
        Arrays.stream(arr).forEach(number -> System.out.print(String.format("%d, ", number)));
        rotationArray(arr,rotation);
    }

    private static void rotationArray(int[] arr, int rotation) {
        int n = arr.length,j=0;
        int[] temp = new int[n];
        for (int i = rotation; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        for(int i=0;i<rotation;i++){
            temp[j]=arr[i];
            j++;
        }
        System.out.println("Before Rotation:::::");
        Arrays.stream(temp).forEach(x ->System.out.print(String.format("%d,",x)));
    }
}
