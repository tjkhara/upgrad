package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the no of tickets from input
        int n = in.nextInt();

        // map to store all the tickets
        Map<String, String> tickets = new HashMap<String, String>();

        // Store the source and destination of the tickets to the map "tickets"
        for (int i = 0; i < n; i++) {
            tickets.put(in.next(), in.next());
            in.nextLine();
        }

        // write your code here

        // Create reverse tickets map
        Map<String, String> reverseTickets = new HashMap<String, String>();
        String startingPoint = null;

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : tickets.entrySet())
             reverseTickets.put(entry.getValue(), entry.getKey());

        for (Map.Entry<String,String> entry : tickets.entrySet())
        {
            if(reverseTickets.containsKey(entry.getKey())){

            } else {
                startingPoint = entry.getKey();
            }
        }

        String temp = startingPoint;

        while(temp != null){
            System.out.print(temp + " ");
            temp = tickets.get(temp);
        }
    }
}
