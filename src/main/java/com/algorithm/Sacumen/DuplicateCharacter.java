package com.algorithm.Sacumen;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateCharacter {

    public static void main(String[] args){

        //Duplicate Character in any string.
        String str = "Helloe hello";

        HashMap<String, Integer> duplicate = new HashMap<>();
        int count=1;
        String[] split = str.split(" ");
        for(int i=0;i<split.length;i++){
            if(duplicate.containsKey(split[i])){
                duplicate.put(split[i],count+1);
            }
        }
        System.out.println(" Duplicate:::"+duplicate.entrySet());

    }
}
