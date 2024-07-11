package com.csps.org.interview;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();

        a1.m1(); //A

        B b1 = new B();

        b1.m1(); // B

        A a2 = new B();

        a2.m1(); // B

        B b2 = (B) new A();

        b2.m1(); // A
    }
}
class A

{
    public void m1()

    {
        System.out.println("A");

    }

}

class B extends A

{

    public void m1()

    {
        System.out.println("B");

    }

}

