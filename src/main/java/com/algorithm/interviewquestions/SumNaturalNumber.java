package com.algorithm.interviewquestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*  Print the   */
public class SumNaturalNumber {
//
//    public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {
//        // Set to store the duplicate elements
//        Set<T> items = new HashSet<>();
//        return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        Stream<Integer> stream
//                = Stream.of(5, 13, 4,
//                21, 13, 27,
//                2, 59, 59, 34);
//        System.out.println(findDuplicateInStream(stream));
//    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here

            // method 2
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                arr[arr[i]%n]+=n;
            }
            for(int i=0;i<arr.length;i++){
                arr[i]=arr[i]/n;
                if(arr[i]>1){
                    res.add(i);
                }
            }
            if(res.size()==0){
                res.add(-1);
            }

            return res;

            // method 1
            // ArrayList<Integer> res = new ArrayList<>();

            // Map<Integer,Integer> map=new HashMap<>();

            // for(int i=0;i<n;i++){
            //     if(map.containsKey(arr[i]) && !res.contains(arr[i])){
            //         map.put(arr[i],map.get(arr[i])+1);
            //         continue;
            //     }
            //     map.put(arr[i],1);
            // }

            // for(Map.Entry<Integer,Integer> hm : map.entrySet()){
            //     if(hm.getValue()>1){
            //         res.add(hm.getKey());
            //     }
            // }

            // if(res.size()>0){
            //     Collections.sort(res);
            //     return res;
            // }

            // res.add(-1);
            // return res;
        }
}
