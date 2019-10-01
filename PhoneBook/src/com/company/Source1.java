package com.company;

public class Source1 {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";

        boolean emailExists = false;
        int index = -1;

        // Write your code here
        for (int i = 0; i < emails.length; i++) {
            if(emails[i].equals(NewEmail)){
                emailExists = true;
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
