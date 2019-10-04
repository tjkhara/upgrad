package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocksAndKeys {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
        }
        in.nextLine();

        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }

        //write your code here
        // map to store all the tickets
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < locks.length; i++) {
            m.put(locks[i], i);
        }

        for (int i = 0; i < keys.length; i++) {
            if(m.get(keys[i]) != null){
                locks[i] = keys[i];
            }
            else {
                System.out.println("Not possible");
                return;
            }
        }

        for (int i = 0; i < locks.length; i++) {
            System.out.print(keys[i] + " " + locks[i] + "\n");
        }
    }
}
