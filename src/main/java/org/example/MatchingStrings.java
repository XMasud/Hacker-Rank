package org.example;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int count = 0;
            for (int j = 0; j < stringList.size(); j++) {
                if (queries.get(i).equals(stringList.get(j))) {
                    count++;
                }
            }
            arr.add(count);
        }
        return arr;
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("ab", " ab", "abc"));
        List<String> queries = new ArrayList<>(List.of("ab", " abc", "bc"));

        List<Integer> result = matchingStrings(stringList, queries);
        System.out.println(result);
    }
}
