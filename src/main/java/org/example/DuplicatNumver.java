package org.example;


public class DuplicatNumver {

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,5,6,6,3,5,2,6,7,8,4,7,4};
        duplicateData(arr);
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
}
