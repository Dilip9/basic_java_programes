package com.algorithm.wissen;

import java.util.Arrays;
import java.util.stream.IntStream;

//    int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    int splitSize = 3;
//
//		/* expected Output
//		[0, 1, 2]
//		[3, 4, 5]
//		[6, 7, 8]
//		[9]
//		*/
class Demo{

    public static void main(String[] arg){
        int[] original = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int splitSize = 3;
        int[][] splitedData = splitArray(original,splitSize);
        Arrays.stream(splitedData)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    private static int[][] splitArray(int[] original, int splitSize) {
        return IntStream.iterate(0, i -> i + splitSize)
                .limit((long) Math.ceil((double) original.length / splitSize))
                .mapToObj(j -> Arrays.copyOfRange(original, j, j + splitSize > original.length ? original.length : j + splitSize))
                .toArray(int[][]::new);
    }


}