package com.practice.Code.interview.StreamAPIProgram;


public class TwoDMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {3, 1, 2},
                {2, 3, 1}
        };

        int num = 3; // Number to search

        // Calling the separate method

        Thread thread=new Thread(()->searchAndPrintRow(matrix,num),"Thread-swati");
        //searchAndPrintRow(matrix, num);
        thread.start();
    }

    // Method to search for the number and print the row
    public static void searchAndPrintRow(int[][] matrix, int num) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == num) {
                    // Printing the row where number is found
                    for (int k = 0; k < matrix[i].length; k++) {
                        System.out.print(matrix[i][k] + " ");
                        System.out.print(Thread.currentThread().getName());
                    }
                    return; // Stop after finding the first occurrence
                }
            }
        }
    }
}

