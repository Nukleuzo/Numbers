package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        intList.forEach(number -> {
           if (number > 0 && number % 2 == 0) {
                System.out.print(number + " "); // способ без Stream
            }

        });
        System.out.println();
        StreamMain.main(); // способ со Stream
    }
}
