package com.algorithm.wissen;

public class KadensAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};//31-6=25
        int maxSum=0, currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum+arr[i];
            for (int j=0;j<arr.length;j++){
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
                if(currentSum<0){
                    currentSum=0;
                }
            }
        }
        System.out.println("Different Approach::::"+maxSum);

//
//        int size = arr.length;
//        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
//        for (int i = 0; i < size; i++) {
//            max_ending_here = max_ending_here + arr[i];
//            if (max_so_far < max_ending_here) max_so_far = max_ending_here;
//            if (max_ending_here < 0) max_ending_here = 0;
//        }
//        System.out.println(max_so_far);
    }

}
