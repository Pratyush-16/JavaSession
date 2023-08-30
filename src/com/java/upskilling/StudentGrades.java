package com.java.upskilling;


import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average job");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

}


