package com.algorithm;


import java.util.Arrays;

public class Demo
{

    public static void main(String[] args){

        String str = "i love my country";
        String[] splitData = str.split(" ");
        int i=0,j=splitData.length-1;
        while (i<j){
            String temp = splitData[i];
            splitData[i]=splitData[j];
            splitData[j]=temp;
            i++;
            j--;
        }
        Arrays.asList(splitData);
        String s1= String.join(" ", splitData);
        System.out.println(s1);

    }

}





