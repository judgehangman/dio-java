package com.github.judgehangman;

import java.util.Scanner;

public class ConsoantesString {

    public static void main (String[] args) {

        // Resolucao do exercicio usando string

        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[6], consoante = new String[vetor.length];

        int consTotal = 0;

        int count = 0;
        while(count< vetor.length){
            System.out.print("Insira uma letra: ");
            String letra = sc.next();

            // Checa se letra é consoante
            if(!(letra.equalsIgnoreCase("A")) &&
                    !(letra.equalsIgnoreCase("E")) &&
                    !(letra.equalsIgnoreCase("I")) &&
                    !(letra.equalsIgnoreCase("O")) &&
                    !(letra.equalsIgnoreCase("U"))
            )
            {
                consoante[count] = letra;
                consTotal++;
            }

            vetor[count] = letra;
            count++;
        }


        System.out.print("Letras: ");
        for(String v : vetor){
            System.out.print(v + " ");
        }
        System.out.print("\nConsoantes: " + consTotal + " [ ");

        for(String c : consoante){
            if(c!=null){
                System.out.print(c + " ");
            }
        }

        System.out.println("]");
    }

}
