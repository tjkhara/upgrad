package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Source3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        // Write your code here
        HashSet<Integer> h = new HashSet<Integer>();
        int currElement;

        for (int i = 0; i < array.length; i++) {
            h.add(array[i]);
        }

        int count = 0;

        currElement = array[0];

        while(h.contains(currElement)){
            count++;
            currElement--;
        }

        currElement = array[0] + 1;

    }
}
