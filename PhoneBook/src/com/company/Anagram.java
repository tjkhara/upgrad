package com.company;
import java.util.*;

public class Anagram {
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
        boolean isAnagram = true;

        // If the size if different not an anagram
        if(ch1.length != ch2.length){
            isAnagram = false;
        } else {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            isAnagram = Arrays.equals(ch1, ch2);
        }

        return isAnagram;


    }
    //Method to sort the character array
    public static void arrange(char[] ch){
        //Write your code here
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
        //Write your code here

        // Getting an iterator
        Iterator hmIterator = map.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if(check(mapElement.getKey().toString(), mapElement.getValue().toString())){
                System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
            }
        }

    }
}
