package com.company.lab1.Task1;
import java.util.Arrays;

public class Task1 {

    static void printArrayString(final String[] str)
    {
        for (final String value : str) {
            System.out.print(value+" ");
        }
    }
    static void quickSort(final String[] array, final int low, final int high)
    {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        final int middle = low + (high - low) / 2;
        final int opora = array[middle].length();

        int i = low, j = high;
        while (i <= j) {
            while (array[i].length() < opora) {
                i++;
            }

            while (array[j].length() > opora) {
                j--;
            }

            if (i <= j) {
                final String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(final String[] args) {
        final String[] arr = {"My", "friend", "was", "very", "hungry", "so", "he", "bought", "pizza"};
        System.out.println("Було");
        System.out.println(Arrays.toString(arr));

        final int low = 0;
        final int high = arr.length - 1;

        quickSort(arr, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(arr));

    }
}

