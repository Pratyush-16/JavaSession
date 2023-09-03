package com.java.upskilling;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {

    public static void main(String args[]) {
        List<Integer>  numbers = Arrays.asList(1,55,66,2,55,99);
        numbers.stream()
                .distinct()
                .collect(Collectors.toList());

    }
}
