package com.algorithm.wissen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accolite {

    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(1,3,5,7);
        List<Integer> l2 = Arrays.asList(5,1,9);

        //int[] l3 = new int[]{3,7,9};   //output

        List<Integer> result = l1.stream().filter(x ->!l2.contains(x)).collect(Collectors.toList());
        result.addAll(l2.stream().filter(x ->!l1.contains(x)).collect(Collectors.toList()));//.stream().filter(x ->!l2.contains(x)).collect(Collectors.toList());
        System.out.println(result);

    }


}
