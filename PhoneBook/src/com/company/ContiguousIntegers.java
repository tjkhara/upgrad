package com.company;
import java.util.HashSet;
import java.util.Scanner;

public class ContiguousIntegers {
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

        // Store all the elements of the array to a hashset
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            h.add(array[i]);
        }

        // Store first element of the array in a variable temp
        int temp = array[0];
        int count = 0;

        // While temp exists in set
        while(h.contains(temp)){
            temp--;
            count++;
        }

        // We are then storing (array[0] + 1) in temp and temp exists in set, we are incrementing temp and count both by 1.
        temp = array[0] + 1;
        while(h.contains(temp)){
            temp++;
            count++;
        }

        if(count == h.size()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
