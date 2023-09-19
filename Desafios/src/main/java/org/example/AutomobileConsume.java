package org.example;

public class AutomobileConsume {
    Double distance;
    Double totalGasline;

    public void showTotalCalculated(){
        System.out.println("Write your total distance");
        distance = Scan.sc.nextDouble();

        System.out.println("Write your total gasoline");
        totalGasline = Scan.sc.nextDouble();

        Double consumeTotla = distance / totalGasline;

        System.out.println("Your cosume is"+consumeTotla+"km/l");

    }
}
