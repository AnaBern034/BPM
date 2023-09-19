package org.example;

public class NUMBER4 {
    public static void verifyStatesOfStudents(Double note){
        if (note >= 8){
            System.out.println("You are approved");
        } else if(note >= 6.0 && note < 8 ){
            System.out.println("You are on recuperation, gotta need to do a prove again ");
        }else{
            System.out.println("You are reject");
        }
    }
}
