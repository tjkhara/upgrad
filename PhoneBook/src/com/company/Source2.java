package com.company;

import java.util.HashSet;

public class Source2 {
    public static void method(int[]  array ){
        int count = 0,n = array.length;

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
            hashSet.add(array[i]);

        int currentElement = array[0];

        while (hashSet.contains(currentElement)) {

            count++;

            currentElement--;
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        int[] array = new int[]{5,8,10};
        method(array);
    }
}
