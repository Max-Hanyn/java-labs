package com.company.lab2.Task1;

public class Pa extends GrandPa {
    public static int b = 10;

    public String name = "Child name";

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child non-static block");
    }

    public Pa() {

        System.out.println("CHILD : public static int a = " + a);
        System.out.println("CHILD : public static int b = " + b);
    }
}
