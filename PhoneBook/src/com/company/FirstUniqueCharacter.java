package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here

        // Go through the string and put the characters in a hash map
        // if it is the first time put value 1
        // otherwise increment value
        HashMap<Character, Integer> map = new HashMap<>();

        //enhanced for loop
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            } else {
                int currentValue = map.get(str.charAt(i));
                // increase value
                currentValue++;
                map.put(str.charAt(i), currentValue);
            }
        }

        // Test
//        System.out.println(map.toString());
        boolean foundSomething = false;

        // Iterate through the string and see which char has value 1 first
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            Integer y = map.get(x);
            if(y == 1){
                foundSomething = true;
                System.out.println(str.charAt(i));
                break;
            }
        }

        if(!foundSomething){
            System.out.println(-1);
        }

    }

}
