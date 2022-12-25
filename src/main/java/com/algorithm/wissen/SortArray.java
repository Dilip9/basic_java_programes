package com.algorithm.wissen;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 7, 8, 1, 4, 5, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(" " + arr[i]);
        }
        int secondHeight=arr.length-1;
        System.out.println("Second Heighest:::"+arr[secondHeight-2]);


//        int a[] = {12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78};
//        int temp;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] < a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println("Array elements in descending order:");
////accessing element of the array
//        for (int i = 0; i <= a.length - 1; i++) {
//            System.out.println(a[i]);
//        }
//    }
    }
}
