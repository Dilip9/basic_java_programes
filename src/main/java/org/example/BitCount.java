package org.example;



public class BitCount {

    public static void main(String[] args){
        System.out.println("Total Bit set Count is:::::"+countBitsBy(13));
        System.out.println(" Using Recursive method:::::::"+recursiveBitCount(3));
    }

    //1st Approach
    private static int countBitsBy(int number) {

        int count = 0;
        while(number>0){

            count += number & 1;
            number >>= 1;
        }

        return count;
    }
    //2nd Approach using recursion
    private static int recursiveBitCount(int number){
        if(number == 0)
            return 0;
        else
            return (number & 1 )+ recursiveBitCount(number >> 1);

    }

}
