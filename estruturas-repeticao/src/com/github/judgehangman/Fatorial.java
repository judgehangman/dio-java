package com.github.judgehangman;

// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

import java.util.Scanner;

public class Fatorial {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        int factorial = num;

        for (int i=num-1;i>0;i--){
            factorial *= i;
        }

        System.out.println(" = " + factorial);
    }
}
