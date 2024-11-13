package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        for (int i = 0; i < d; i++) {
            int temp = arr.get(0);
            for (int j = 1; j < arr.size(); j++) {
                arr.set(j-1, arr.get(j));
            }
            arr.set(arr.size()-1, temp);
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        List<Integer> result = rotateLeft(2, arr);
        for(Integer n: result){
            System.out.println(n);
        }
    }
}
