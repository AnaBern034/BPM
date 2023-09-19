package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NUMBER5 {

    public static void listOfNumber(){
        List<Integer> number = new ArrayList<>();

        System.out.println("how many time you want to add a number");
        int time = Scan.sc.nextInt();

        for (int i = 0; i < time ; i++) {
            System.out.println("Write numer "+(i+1));
            int num = Scan.sc.nextInt();
            number.add(num);
        }
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("-------");
        for (Integer num : number){
            System.out.println(num);
        }
    }


}
