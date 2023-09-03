package com.java.upskilling;

import java.util.Arrays;
import java.util.List;

public class AverageNum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        System.out.println("List of numbers: " + num);

        double avg = num.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average value of the numbers: " + avg);
    }
}

