package org.example;

public class Fibonacci{
    static int n1 =1;
    static int n2 = 0;

    public static void  fibo (){
        System.out.println("Write a number");
        int write = Scan.sc.nextInt();
        for (int i = 0; i < write; i++) {
            System.out.println(n1);
           int next = n1 + n2;
           n1 = n2;
           n2 = next;
        }

    }

}