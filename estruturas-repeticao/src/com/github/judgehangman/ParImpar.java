package com.github.judgehangman;

/*
* Faça um programa que peça N números inteiros.
* Calcule e mostre a quantidade de números pares e a quantidade de números impares.
* */

import java.util.Scanner;

public class ParImpar {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int quant;
        int count = 0;
        int num;
        int par = 0, impar = 0;

        System.out.println("Quantidade de números: ");
        quant = sc.nextInt();

        do{
            System.out.println("Número: ");
            num = sc.nextInt();

            if(num%2==0) { par++; }
            else { impar++; }

            count++;
        }while(count < quant);

        System.out.println("Quantidade de ímpares: " + impar);
        System.out.println("Quantidade de pares: " + par);


    }

}
