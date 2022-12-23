package com.github.judgehangman;

// Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

import java.util.Scanner;

public class OrdemInversa {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] userArray = new int[5];
        int[] vetor = {12, 33, -145, 4, 10};
        int num;

        // Mostra ordem normal - VETOR
        // Usando while

        System.out.print("Vetor: ");
        int count = 0;
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        // Mostra em ordem reversa - VETOR
        for (int i = (vetor.length - 1); i >=0; i--){
            System.out.print(vetor[i] + " ");
        }

        // Insere numeros do usuário no array
        for(int i=0;i<userArray.length;i++){
            System.out.println("\nInsira um número: ");
            num = sc.nextInt();
            userArray[i] = num;
        }

        // Mostra em ordem normal - CUSTOM
        // Usando foreach
        System.out.print("\nVetor: ");
        for(int i : userArray){
            System.out.print(i + " ");
        }

        // Mostra em orderm reversa - CUSTOM
        System.out.print("\nVetor: ");
        for (int i = (userArray.length - 1); i>=0; i--){
            System.out.print(userArray[i] + " ");
        }


    }

}
