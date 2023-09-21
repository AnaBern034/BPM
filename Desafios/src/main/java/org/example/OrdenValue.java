package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenValue {
    static List<Integer> listOfNumberPar = new ArrayList<>();
    static List<Integer> listOfNumberImpar = new ArrayList<>();
    static int number = 1000;

    public static void askNumberAndIncludeToList() {
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                listOfNumberPar.add(i);
            }else {
                listOfNumberImpar.add(i);
            }
        }

        System.out.println("Number par "+ listOfNumberPar);
        System.out.println("Number impar "+ listOfNumberImpar);
    }

}
