package com.example.Entity;

public class pattern {

        public static void main(String[] args) {

            int rows = 8;

            for (int i = 1; i <= rows; i++) {

                // First line and last line
                if (i == 1 || i == rows) {
                    for (int j = 1; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

                // Second line and second last line
                else if (i == 2 || i == rows - 1) {
                    for (int j = 1; j <= 2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("* *");
                }

                // Middle lines
                else {
                    for (int j = 1; j <= 1; j++) {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                    for (int j = 1; j <= 3; j++) {
                        System.out.print(" ");
                    }

                    System.out.println("*");
                }
            }
        }
    }

