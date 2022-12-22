package com.github.judgehangman;

// Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
// Ao final, mostre os números e seus sucessores.

import java.util.Random;

public class NumerosAleatorios {

    public static void main (String[] args) {

        int[] nums = new int[20];
        Random random = new Random();

        for(int i=0; i<nums.length;i++){
            nums[i] = random.nextInt(100);
        }

/*
        for(int n : nums){
            System.out.print("Numero: " + n + " ");
            System.out.println("\nSucessor: " + (n+1) + " ");
            System.out.println("===");
        }
*/

        System.out.print("Numeros aleatórios: ");
        for(int n : nums){
            System.out.print(n + " ");
        }
        System.out.print("\nSucessores: ");
        for(int n : nums){
            System.out.print(n+1 + " ");
        }
    }

}
