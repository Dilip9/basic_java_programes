package com.algorithm.multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class demo {

    public static void main(String[] ars) {


        List<Integer> data = Arrays.asList(4,5,6,3,6,2,4,7,9,4,5,6,2,4,6,8);

        System.out.println(":::::::"+data.stream().sorted(Integer::compareTo).collect(Collectors.toList()));
        System.out.println(":::::::: Distinct data elements::"+data.stream().distinct().sorted(Integer::compareTo).collect(Collectors.toList()));

    }

}
