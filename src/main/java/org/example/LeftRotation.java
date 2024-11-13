package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> result = new ArrayList<>();
        int index = d;

        while (index < arr.size()){
            result.add(arr.get(index));
            index++;
        }

        index = 0;
        while (index < d){
            result.add(arr.get(index));
            index++;
        }
        return result;
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
