package com.company;

public class Main {

    public static void main(String[] args) {
        // Homework 3
        String first = args[0];
        String second = args[1];
        int badge = 0;
        for(int i = 0; i < first.length(); i++) {
            if (first.substring(i, second.length() + i).equalsIgnoreCase(second)) {
                for (int j = badge; j < i; j++)
                    System.out.print(first.substring(j));
                System.out.println("");
                badge = second.length() + i + 1;
            }

        }
        for (int j = badge; j < first.length(); j++)
            System.out.print(first.substring(j));
    }
}
