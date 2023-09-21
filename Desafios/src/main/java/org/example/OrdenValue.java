package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenValue {
    static List<Integer> listOfNumber = new ArrayList<>();
    int number;

    public static void howMannyNumber(){
      System.out.println("Write how many number u want add");
      int number = Scan.sc.nextInt();
      if (number > 0){
        for (int i = 0; i <  number; i++) {
          System.out.println("Write number "+ (i+1));
          int write = Scan.sc.nextInt();
          while (write < 0){
            System.out.println("number need to be positive");
            write = Scan.sc.nextInt();
          }
            listOfNumber.add(write);
        }
      }else {
        System.out.println("u need to write positive number ");
      }
    }
    public static void askNumberAndIncludeToList() {
       List<Integer> listEven = listOfNumber.stream().sorted((a,b)->{
         if (a % 2 == 0 && b % 2 != 0){
           return -1;
         } else if (a % 2 != 0 && b % 2 == 0){
           return 1;
         }else {
          return a.compareTo(b);
         }
      }).collect(Collectors.toList());

      System.out.println("Number orden "+ listEven);
    }
}
