package org.example;

public class Paarlindrom {

    public static void main(String[] args){

        int r, temp, sum = 0;
        int palinNumber = 450;
        temp = palinNumber;
        while(palinNumber>0){
            r = palinNumber%10;
            sum = (sum*10)+r;
            palinNumber = palinNumber/10;
        }
        if(temp == sum){
            System.out.println("it's palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }

    //String palindrome;




}
