package com.telerikacademy;

import java.util.Scanner;

public class WordOrNumber {

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder words = new StringBuilder();
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
                    maybePrintWords(words);
                    words = new StringBuilder();
                } catch (NumberFormatException e) {
                    // if not an int then append to words and print the sum so far
                    words.append(input).append("-");
                    maybePrintSum(sum);
                    sum = 0;
                }

            }
        }
        // print the final result
        maybePrintWords(words);
        maybePrintSum(sum);
        scanner.close();
    }

    private static void maybePrintWords(StringBuilder words) {
        if (words.length() != 0) {
            System.out.println(words.deleteCharAt(words.length() - 1));
        }
    }

    private static void maybePrintSum(int sum) {
        if (sum != 0) {
            System.out.println(sum);
        }
    }
}

