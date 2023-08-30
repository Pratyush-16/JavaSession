package com.java.upskilling;

import java.util.Scanner;
import java.io.*;

public class ReverseString {


        public static void main (String[] args) {

            String str= "Pratyush", nstr="";
            char ch;

            System.out.print("Original word: ");
            System.out.println("Pratyush");

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }















