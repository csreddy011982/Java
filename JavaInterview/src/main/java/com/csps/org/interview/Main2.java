package com.csps.org.interview;

public class Main2 {
    public static void main(String[] args) {
        try
        {
           int b = 10/0;
            System.out.println(b);
        }

        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException block...");
        }
        catch(Exception e)
        {
            System.out.println("Exception block...");
        }

        finally
        {
            System.out.println("returning 20");
           // return 20; final will not allow return
        }
    }
}
