package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(Integer apple : apples){

            if(apple + a >= s && apple + a <= t)
                appleCount++;
        }

        for(Integer orange : oranges){
            if(orange + b >= s && orange + b <= t)
                orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>(List.of(-2, 2, 1));
        List<Integer> oranges = new ArrayList<>(List.of(5, -6));

        countApplesAndOranges(7,11,3,2, apples, oranges);
    }
}
