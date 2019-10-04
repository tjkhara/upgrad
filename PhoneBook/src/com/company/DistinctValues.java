package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class DistinctValues {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        Map<String, Integer> newMap = new HashMap<String, Integer>();

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer,String> entry : map.entrySet())
             newMap.put(entry.getValue(), 0);

        for (Map.Entry<String,Integer> entry : newMap.entrySet())
            System.out.print(entry.getKey() + " ");

    }

    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }
}
