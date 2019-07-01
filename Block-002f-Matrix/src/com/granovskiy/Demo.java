package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = row + column;
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix[0].length: " + matrix[0].length);
    }
}
