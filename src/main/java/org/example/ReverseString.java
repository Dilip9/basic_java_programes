package org.example;

public class ReverseString {
     public static void main(String[] args){
         int arr[] = {1,2,3,4,5,6};
         printArray(arr,6);
         reverseArray(arr,0,5);
         System.out.println("Reversed array is \n");
         printArray(arr,6);


     }

    private static void reverseArray(int[] arr, int start, int end) {
         int temp;
         while(start<end){
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }

    }

    static void printArray(int arr[], int n){
         for (int i=0; i<n;i++){
             System.out.println(arr[i]+" ");
         }
         System.out.println();
    }

}
