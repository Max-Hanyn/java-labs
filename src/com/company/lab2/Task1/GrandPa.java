package com.company.lab2.Task1;

import java.io.PrintStream;

public class GrandPa {

        public static int a = 10;

        static {
            System.out.println("Parent static block");
        }

        {
            name = "";
            System.out.println("Parent non-static block");
        }

        public String name = "Parent name";

        public GrandPa() {
            System.out.println("PARENT : public static int a = " + a);
            System.out.println("PARENT : public String name = " + name);

        }
}