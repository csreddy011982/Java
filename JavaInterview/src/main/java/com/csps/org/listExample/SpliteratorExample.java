package com.csps.org.listExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
//Java 8 introduced the Spliterator interface, which stands for “split iterator.”
// It provides a way to iterate over elements in a more parallel-friendly manner.
// A Spliterator can be obtained from various sources, including collections like lists.
// The forEachRemaining method of Spliterator is used to traverse all remaining elements sequentially.
public class SpliteratorExample {
    public static void main(String[] args) {
        // List of String
        List<String> myList = List.of("A", "B", "C","D");

        // Using Spliterator
        Spliterator<String> spliterator = myList.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // Creating an ArrayList
        List<String> myList1 = new ArrayList<>();

        // Adding elements to the List
        // Custom inputs
        myList1.add("A");
        myList1.add("B");
        myList1.add("C");
        myList1.add("D");
        myList1.stream().forEach(
                (temp) -> System.out.println(temp));

    }
}
