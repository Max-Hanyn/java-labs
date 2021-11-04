package com.company.lab1.Task3;

public class Task3 {
    public static void main(final String[] args) {
        final int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final char[] arrayChar = {'m', 't', 'l', 'q', 'o', 'a', 's', 'r', 'g'};

        //////////////////////////////////////////////////////

        printString(arrayInt, arrayChar);
    }

    public static String mergeToString(final int[] arrayInt, final char[] arrayChar) {//метод запису 2 масива в стрінгу
        final int maxLength;

        if (arrayInt.length != arrayChar.length) {
            return "Arrays not equal";
        }

        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < arrayInt.length; i++) {
            result.append(arrayChar[i]);
            result.append(arrayInt[i]);
        }

        return result.toString();
    }

    public static void printString(final int[] intArr, final char[] chArr) {
        System.out.println(mergeToString(intArr, chArr));

    }
}
