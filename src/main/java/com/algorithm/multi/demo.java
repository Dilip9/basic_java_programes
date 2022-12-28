package com.algorithm.multi;

import java.util.HashMap;

public class demo {

    public static void main(String[] ars){
        String str = "Java is great Python is also great";
        int[] arr = {3,4,5,4,5,4};
        int[] num = {10,5,4,8};
        int high=num.length;

//        String[] strs = str.split(" ");
//        int count=1;
        int frequency = 1;
//        String[] strs = str.split(" ");
//        StringBuffer sb  = new StringBuffer();
//        for(int i=strs.length-1;i>=0;i--){
//            sb.append(strs[i]+" ");
//        }
//        System.out.println("String in reverse order::::: "+sb);
        HashMap<Integer, Integer> map = new HashMap<>();
//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i=0;i<strs.length;i++){
//            if(map.containsKey(strs[i])){
//                map.put(strs[i],count++);
//            }else {
//                map.put(strs[i], 1);
//            }
//        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],frequency++);
            }else map.put(arr[i],1);
        }
        System.out.println("::::: "+map.entrySet());


        quickSort(num,0,high-1);
    }

    private static void quickSort(int[] num, int l, int h) {
        if(l<h){
        int pivot= partitions(num,l, h);   // low=0, high =num.length
        quickSort(num, l, pivot-1);
        quickSort(num,pivot+1,h);
        }
        for(int i=0;i<num.length;i++) {
            System.out.print(" " +num[i]);
        }
    }

    private static int partitions(int[] num, int low, int high) {
        int key = num[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(num[j]<=key){
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        int temp = num[i+1];
        num[i+1] = num[high];
        num[high] = temp;

        return i+1;
    }
}
