package org.example;

public class Factorial {
   static int number, factorial = 1;

    public static void process(){
        do {
            System.out.println("Write a number: ");
            number = Scan.sc.nextInt();
        }while(number < factorial);

        while (number > 0){
            factorial = factorial * number;
            number--;
        }
        System.out.println("The result is "+ factorial);
    }
}
