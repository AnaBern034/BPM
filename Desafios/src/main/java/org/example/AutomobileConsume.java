package org.example;

public class AutomobileConsume {
    static Integer distance;
   static Double totalGasline;

    public static void showTotalCalculated(){
        System.out.println("Write your total distance");
        distance = Scan.sc.nextInt();

        System.out.println("Write your total gasoline");
        totalGasline = Scan.sc.nextDouble();

        Double consumeTotal = distance / totalGasline;

        System.out.println("Your consume is " + String.format("%.3f", consumeTotal) + " km/l");

    }
}
