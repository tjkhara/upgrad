package com.company;

import java.util.*;
import java.util.Scanner;

public class BoardingPassProblem {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i:arr)
        {
            //Check whether the pass already exists in the hash table or not. If it doesn’t, add it to the table; otherwise, print the duplicate pass number.
            if(boardingPass.containsKey(i)){
                System.out.println(i);
            } else {
                // add to the table
                boardingPass.put(i, "Checked");
            }
        }

//        System.out.println(boardingPass.toString());
    }
}
