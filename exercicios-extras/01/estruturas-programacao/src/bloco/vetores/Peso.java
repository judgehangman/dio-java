/* Escreva um programa que leia uma lista contendo o peso de uma série de indivíduos em um
* vetor de números reais. A lista possui 150 elementos.
*
* Depois que a lista foi toda inserida, o programa deve procurar e imprimir qual a posição no vetor
* onde está o menor peso.
* */

package bloco.vetores;

import java.util.Scanner;

public class Peso {

    public static void main (String[] args) {

        double[] pesos = new double[150];
        iniciaArray(pesos);

        System.out.print("\nMenor peso está na posição ");
        System.out.print(menorPesoIndex(pesos));
    }

    static void iniciaArray(double[] vetor){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<vetor.length; i++){

            System.out.print("Insira o peso: ");
            vetor[i] = sc.nextDouble();
        }
    }

    static int menorPesoIndex(double[] vetor){

        int pos = 0;
        double min = vetor[pos];

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]<= min){
                min = vetor[i];
                pos = i;
            }
        }

        return pos;
    }
}
