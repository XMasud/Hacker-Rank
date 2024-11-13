package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        List<Integer> results = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else if (type == 2) {
                lastAnswer = arr.get(idx).get(y % arr.get(idx).size());
                results.add(lastAnswer);
            }
        }
        System.out.println(lastAnswer);
        return results;
    }
    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 1)
        );

        List<Integer> result = dynamicArray(2, arr);
    }
}
