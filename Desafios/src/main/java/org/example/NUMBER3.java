package org.example;

public class NUMBER3 {
    public static void returnAletterIfVowelOrConsonante(String letter){
        if (letter.contains("a") || letter.contains("e") || letter.contains("i") || letter.contains("o") || letter.contains("u")){
            System.out.println("It's a vowel");
        }else {
            System.out.println("It's consonante ");
        }
    }
}
