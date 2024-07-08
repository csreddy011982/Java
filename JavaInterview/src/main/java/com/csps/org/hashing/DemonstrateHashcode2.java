package com.csps.org.hashing;

import java.lang.reflect.Method;

public class DemonstrateHashcode2 {

    public static void main(String[] args)
            throws ClassNotFoundException
    {
        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.String");

        System.out.println("Class represented by c1: "
                + c1);

        // hashCode method on c1
        System.out.println("HashCode value: "
                + c1.hashCode());

        Class c2 = int.class;

        System.out.println("Class represented by c1: "
                + c2);

        // hashCode method on c1
        System.out.println("HashCode value: "
                + c2.hashCode());
    }
}
