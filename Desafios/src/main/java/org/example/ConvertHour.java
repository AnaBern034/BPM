package org.example;

public class ConvertHour{

   static int hour, seconds, min, value;

    public static void converting(){
        value = Scan.sc.nextInt();


       hour = value / 3600;
       min = (value % 3600) / 60 ;
       seconds = (value % 3600) % 60;

        System.out.println("");


    }

}