package com.anexinet.exercise06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingString {

    private static int findingString(String[] args, String word){

        if(args == null || word == null || word.isEmpty()){
            return -1;
        }

        List<String> list = Arrays.asList(args);

        return list.indexOf(word);
    }

    public static void main(String[] args) {

        String[] arr = {"art","","bar","","","car"};
        String word= "bar";

        int number = findingString(arr,word);
        System.out.println(number);

    }

}
