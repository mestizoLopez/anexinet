package com.anexinet.exercise01;

public class MatrixTransposed {

    private static void transposed(int[][] matrix){

        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i=0;i<columns;i++){
            for(int j=rows-1;j>=0;j--){

                final int value = matrix[j][i];
                System.out.print(value+" ");

            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        int[][] matrix=  {
                {1,2,3},
                {0,-1,10}
        };

        transposed(matrix);

    }

}
