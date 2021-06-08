package com.telerikacademy;

import java.util.Scanner;

public class WordOrNumber {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int lines = scanner.nextInt();
                int number = 0;
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < lines; i++) {
                    while (scanner.hasNext()) {
                        number += scanner.nextInt();
                        ++i;
                        if (i >= lines) {
                            break;
                        }
                    }
                    System.out.println(number);
                    number = 0;

                    while (!scanner.hasNextInt()) {
                        sb.append(scanner.nextLine());
                        if (i >= lines) {
                            break;
                        }
                        if (!scanner.hasNextInt()) {
                            sb.append("-");
                        }
                        ++i;
                    }
                    System.out.println(sb);
                    --i;
                }
    }
}

