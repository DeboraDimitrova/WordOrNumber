package com.telerikacademy;

import java.util.Scanner;

public class WordOrNumber {


    public static void main(String[] args) {
        StringBuilder words = new StringBuilder();
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        // get the expected number of lines
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            String input = null;
            // get the next input
            if (scanner.hasNext()) {
                input = scanner.next();
            }

            // null check just for safety
            if (input != null) {
                try {
                    // if can be parsed to integer add to sum and print the words so far
                    int number = Integer.parseInt(input);
                    sum += number;
                    if (words.length() != 0) {
                        System.out.println(words.deleteCharAt(words.length()-1));
                        words = new StringBuilder();
                    }
                } catch (NumberFormatException e) {
                    // if not an int then append to words and print the sum so far
                    words.append(input).append("-");
                    if (sum != 0) {
                        System.out.println(sum);
                        sum = 0;
                    }
                }

            }
        }
        // print the final result
        if (words.length() != 0) {
            System.out.println(words.deleteCharAt(words.length()-1));
        }
        if (sum != 0) {
            System.out.println(sum);
        }
        scanner.close();
    }
}

