package com.company.lab1.Task5;

import java.util.Scanner;


public class MatrixTranspose {

    public static int[][] transposeMatrix(final int[][] m) {
        final int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

    public static void showMatrix(final int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(final String[] args) {

        final int[][] matrix = {
                {1, 2},
                {4, 5},
                {7, 3},
        };

        System.out.println("Basic matrix");
        showMatrix(matrix);

        final int[][] transposeMatrix = transposeMatrix(matrix);

        System.out.println("Transposed matrix");
        showMatrix(transposeMatrix);
    }
}





