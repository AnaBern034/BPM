package org.example;

public class NUMBER1 {
    public static void writeNumberAndReturnMaxOuMin(int number1, int number2){
        if (number1 > number2) {
            System.out.println("Number "+number1+" is greaten than number"+number2);
        } else if (number2 > number1) {
            System.out.println("Number " + number2 + " is greaten than number " + number1);
        }
    }
}
