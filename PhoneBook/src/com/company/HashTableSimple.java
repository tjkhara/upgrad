package com.company;

import java.util.Hashtable;

public class HashTableSimple {


    public static void main(String[] args) {

        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        int arr[]={20, 17, 28, 15, 24, 22, 17, 21, 34};

        for (int i = 0; i < arr.length; i++) {
            boardingPass.put(arr[i], "Checked");
        }

        System.out.println(boardingPass.containsKey(20));

        System.out.println(boardingPass.toString());
    }



}
