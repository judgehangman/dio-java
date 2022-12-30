/* Escreva um programa que leia um número inteiro e mostre a sua conversão em binário */

package bloco.estruturas;

import java.util.Scanner;

public class ConversorIntBinario {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero inteiro: ");
        int n = sc.nextInt();

        conversor(n);
    }

    public static void conversor(int n){

        int total = n;

        int[] bin = new int[32];
        int i = 0;

        while(total>0){
            bin[i++] = total%2;
            total = total/2;
        }

        exibeBinario(bin,i);

    }

    public static void exibeBinario(int[] binario, int index){

        if(index<4){
            while(4-index>0){
                index++;
            }
        }

        for(int i = index-1; i>=0; i--){

            System.out.print(binario[i] + "");

            switch(i) {
                case 8, 16, 24, 32 -> System.out.print(" ");
            }
        }
    }
}
