package com.company.lab1.Task2;

public class Task2 {


    public static int countChar(final String string, final char c)
    {
        int res = 0;
        for (int i=0; i<string.length(); i++)
        {
            // перевірка символу в рядку
            if (string.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    static void printNumberOfChar(final String string, final char c)
    {
        System.out.println ( "Total number of char \""+c+"\" in a string: " + countChar (string,c)) ;
    }

    public static void main(final String[] args)
    {
        final String string =  "We do not remember days, we remember moments" ;
        final char c = 'e';

        /////////////////////////////////////////////////////////////////

        System.out.println (string);
        printNumberOfChar (string,c);
    }



}
