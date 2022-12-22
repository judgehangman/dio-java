package com.github.judgehangman;

/* Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.println("Insira uma nota (entre 0 e 10): ");
        nota = sc.nextFloat();

        while (nota < 0 || nota >10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = sc.nextFloat();
        }

    }

}
