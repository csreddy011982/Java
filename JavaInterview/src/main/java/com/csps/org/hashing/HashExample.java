package com.csps.org.hashing;

import java.util.HashMap;

public class HashExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Chandra",42);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("test",450);
       // If you try to insert the duplicate key in HashMap, it will replace the element of the corresponding key.
        map.put("Chandra",30);
        System.out.println(map.size()); //4
        System.out.println(map);
        map.remove("Chandra");
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Chandra")) {

            // Mapping
            Integer a = map.get("Chandra");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"Chandra\" is: " + a);
        }
    }

}
