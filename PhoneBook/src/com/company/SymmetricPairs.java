package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here

        // Create a hash map
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean isSymPair = false;

        // Traverse through the array and check for every current pair to identify whether the second element of
        // the current pair is present in the hashmap or not.
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i][1])){
                // If it is present, then check whether the first element of the current pair and value of the
                // key in hashmap are the same or not.
                if(arr[i][0] == map.get(arr[i][1])){
                    // Is there a symmetric pair flag
                    isSymPair = true;

                    // If they are same, then print the key and value in the hashmap as a symmetric pair.
                    System.out.println(arr[i][1] + " " + arr[i][0]);
                }
            }
            // Otherwise, add that current pair to the hashmap considering the first element of the pair as the
            // key and the second element of the pair as the value of the key in the hashmap.
            else {
                map.put(arr[i][0], arr[i][1]);
            }
        }

        if(!isSymPair){
            System.out.println("No Symmetric pair");
        }

    }

}
