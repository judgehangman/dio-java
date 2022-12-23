package com.github.judgehangman;

import java.util.Random;

public class ArrayMultidimensional {

    public static void main (String[] args) {

        int[][] M = new int[4][4];

        Random random = new Random();

        // Populando matriz com numeros
        for(int row = 0; row < M.length; row++){
            for(int column = 0; column<M[row].length; column++){
                M[row][column] = random.nextInt(9);
            }
        }
        // Imprimindo como matriz
        for(int[] row : M){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        // Exibindo resultados
        System.out.print("\nMenor número: " + getMin(M)[0]);
        System.out.print("\nPosição (normalizada): " + (getMin(M)[1] + 1) + ", ");
        System.out.println((getMin(M)[2] + 1));
        System.out.print("Posição (índice): " + getMin(M)[1] + ", ");
        System.out.println(getMin(M)[2]);
    }

    // Calcula o menor numero e sua posição
   static int[] getMin(int[][] nums){

        int[] valores = new int[3];
        int minV = nums[0][0];

        // Coordenadas cartesias (então x = linha, y = coluna)
        for(int x = 0; x < nums.length; x++) {
            for(int y = 0; y < nums.length; y++) {
                if(nums[x][y] < minV) {
                    minV = nums[x][y]; // valor minimo
                    valores = new int[]{minV, x, y}; //acrescenta 1 pois index começa em 0
                }
            }
        }
        return valores;
    }
}
