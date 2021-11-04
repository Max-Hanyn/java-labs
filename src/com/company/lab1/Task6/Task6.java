package com.company.lab1.Task6;

public class Task6 {

    // Function to print Matrix
    static void printMatrix(final int[][] M) {
        final int rowSize = M.length;
        final int colSize = M[0].length;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static int[][] multiplyMatrix(final int[][] A, final int[][] B) {

        int i, j, k;

        final int row1 = A.length;
        final int col1 = A[0].length;
        final int row2 = B.length;
        final int col2 = B[0].length;

        if (row2 != col1) {

            System.out.println(
                    "\nMultiplication Not Possible");
            System.exit(0);
        }

        final int[][] C = new int[row1][col2];

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        return C;
    }

    public static void main(final String[] args) {

        final int[][] A = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}
        };

        final int[][] B = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3}
        };

        System.out.println("First matrix");
        printMatrix(A);
        System.out.println("Second matrix");
        printMatrix(B);

        final int[][] resultMatrix = multiplyMatrix(A, B);

        System.out.println("Result matrix");
        printMatrix(resultMatrix);
    }
}