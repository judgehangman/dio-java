package com.github.judgehangman;

import java.util.Scanner;

public class ConsoantesChar {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        /* TODO: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes. */

        // Resolucao do exercicio usando char

        char[] vetor = new char[6], consoantes = new char[vetor.length];
        int consTotal = 0;

        // Iterando array
        for(int i=0; i<vetor.length;i++){
            System.out.println("Insira uma letra: ");
            String letra = sc.next();

            // Checa se letra é consoante
            if(!(letra.equalsIgnoreCase("A")) &&
                    !(letra.equalsIgnoreCase("E")) &&
                    !(letra.equalsIgnoreCase("I")) &&
                    !(letra.equalsIgnoreCase("O")) &&
                    !(letra.equalsIgnoreCase("U"))
            )
            {
                consoantes[i] = letra.charAt(0);
                consTotal++;
            }
        }

        System.out.print("Letras: " + String.valueOf(vetor));
        System.out.print("\nConsoantes: " + consTotal + " [ ");

        // Definindo array consoantes
        for(char c : consoantes){
            int count = 0;
            do{
                if(c!='\u0000'){
                    System.out.print(c + " ");
                }
                count++;
            }while(count>consTotal);
        }

        System.out.print("]");
    }

}
