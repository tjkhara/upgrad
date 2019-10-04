package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class PairWithAGivenSum {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        //write your code here

        // Create a hash set
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            int diff = targetSum - array[i];
            if(h.contains(diff)){
                System.out.println("true");
                return;
            }
            h.add(array[i]);
        }

        System.out.println("false");

    }
}
