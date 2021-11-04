package com.company.lab2.Task1;

public class Son extends Pa {


    public static int c = 1;

    public String name = "Child name";

    static {
        System.out.println("Grand child static block");
    }

    {
        System.out.println("Grand Child non-static block");
    }

    public Son() {

        System.out.println("GRAND CHILD : public static int a = " + a);
        System.out.println("GRAND CHILD : public static int b = " + b);
        System.out.println("GRAND CHILD : public static int b = " + c);
    }
}
