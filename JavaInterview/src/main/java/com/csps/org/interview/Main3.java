package com.csps.org.interview;

public class Main3 {
    public static void main(String[] args) {

        int ret = m1();

        System.out.println("M1 Returned::: " + ret);

    }

    static int m1()

    {

        try

        {

            System.out.println("Returning 10");

            return 10;

        }

        finally

        {

            System.out.println("returning 20");

           // return 20;

        }

    }
}
