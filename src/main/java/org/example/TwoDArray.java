package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArray {

    public static int hourglassSum(List<List<Integer>> arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {

                int firstRow = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                int secondRow = arr.get(i+1).get(j+1);
                int thirdRow = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                System.out.print(" ");

                System.out.print(max);
                if(max < firstRow+secondRow+thirdRow)
                    max = firstRow+secondRow+thirdRow;
            }
            System.out.println("");

        }
        return max;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(-1, -1, 0, -9, -2, -2),
                Arrays.asList(-2, -1, -6, -8, -2, -5),
                Arrays.asList(-1, -1, -1, -2, -3, -4),
                Arrays.asList(-1, -9, -2, -4, -4, -5),
                Arrays.asList(-7, -3, -3, -2, -9, -9),
                Arrays.asList(-1, -3, -1, -2, -4, -5)
        );

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
