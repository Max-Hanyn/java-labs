package com.company.lab1.Task4;

public class Task4 {
    public static void main(final String[] args) {
    //final
        final String str1 = "Fizz";
        final String str2 = "Buzz";
        final int n=100;
        final int[] array = new int[n];

        ////////////////////////////////////////////////////

        for (int i = 1; i<=array.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println(i + "= "  + str1 + str2);
            else if (i % 3 == 0)
                System.out.println(i + " = " + str1);
            else if (i % 5 == 0)
                System.out.println(i + " =  " + str2);
            else System.out.println(i + " = " + i);

        }
    }
}

