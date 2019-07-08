package com.anexinet.exercise04;

import java.util.ArrayList;
import java.util.List;

public class MatrixOfCeros {

    private static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++) {
            for (int j =0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    private static List<String> findingCeros(int[][] matrix){
        List<String> list = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i=0;i<rows;i++) {
            for (int j =0;j<columns;j++) {
                final int zero = matrix[i][j];
                if(zero==0){
                    list.add(i+","+j);
                }
            }
        }

        return list;
    }

    private static int[][] matrizConvert(int[][] matrix,List<String> list){

        if(list.size()<1){
            return matrix;
        }

        String coordinates = list.get(0);
        list.remove(0);
        int row = coordinates.charAt(0) - '0';
        int column = coordinates.charAt(2) - '0';

        for(int i=0; i<matrix.length;i++){
            matrix[i][column]=0;
        }

        for(int j=0; j<matrix[0].length;j++){
            matrix[row][j]=0;
        }

        return matrix;
    }


    private static void matrixConvert(int[][] matrix){

        List<String> coordinates = findingCeros(matrix);

        System.out.println(coordinates);

        matrix = matrizConvert(matrix,coordinates);

        printMatrix(matrix);

    }


    public static void main(String[] args) {

        int[][] matrix=  {
                {1,2,0},
                {4,0,10},
                {7,8,9}
        };

        matrixConvert(matrix);

    }



}
