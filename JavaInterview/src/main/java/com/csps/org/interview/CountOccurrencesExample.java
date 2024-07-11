package com.csps.org.interview;

import java.util.*;
import java.util.stream.Collectors;

public class CountOccurrencesExample {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,10,20,40,30,50);
        List<Integer> newList=list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);
       // countFrequencies(list);
        countFrequencies1(list);

    }
    public static void countFrequencies(List<Integer> list)
    {
       // hash set is created and elements of
        // arraylist are inserted into it
        Set<Integer> st = new HashSet<>(list);
        for (Integer s : st)
            System.out.println(s + ": " + Collections.frequency(list, s));
    }

    public static void countFrequencies1(List<Integer> list)
    {
        // hashmap to store the frequency of element
        Map<Integer, Integer> hm = new HashMap<>();

        for (Integer i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<Integer, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }
}
