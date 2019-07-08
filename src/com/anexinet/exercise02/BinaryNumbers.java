package com.anexinet.exercise02;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumbers {

    private static int findOnes(int number){
        String value = Integer.toBinaryString(number);
        int count = 0;

        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='1'){
                count++;
            }
        }

        return count;

    }

    private static int findLargest(int number,int ones){

        if(number>Integer.MAX_VALUE){
            return number;
        }

        String value = Integer.toBinaryString(number);
        int count = 0;

        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='1'){
                count++;
            }
        }

        if(count==ones){
            return number;
        }



        return number+1;

    }

    private static int findsmallest(int number,int ones){

        if(number<1){
            return number;
        }

        String value = Integer.toBinaryString(number);
        int count = 0;

        for(int i=0;i<value.length();i++){
            if(value.charAt(i)=='1'){
                count++;
            }
        }

        if(count==ones){
            return number;
        }



        return number-1;

    }

    private static String binaryConvert(int number){

        if(number <=0){
            return number+" Is Not a Positive Number";
        }

        int firstCount = findOnes(number);
        int smallestCount = findsmallest(number-1,firstCount);
        int largestCount = findLargest(number+1,firstCount);
        String result=smallestCount+" "+largestCount;

        return result;

    }

    public static void main(String[] args) {

      String result =  binaryConvert(10);

        System.out.println(result);

    }

}
