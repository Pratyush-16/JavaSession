package com.java.upskilling;

import java.util.Scanner;

public class EvenOdd {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            findOdd(n);
        }



        public static void findOdd(int n) {
            try {
                findEven(n);
                System.out.println(n + " is even");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        public static void findEven(int number) {
            if (number % 2 != 0) {
                throw new IllegalArgumentException(number + " is odd");
            }
        }


}
