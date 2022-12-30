/*
    Escreva um programa que carregue um número inteiro e indique se ele é um número primo, para isto deve ser usado
    um módulo que recebe como parâmetro o número e retorn verdadeiro se ele for primo e falso caso contrário.

    -> Carregue um valor inteiro N pelo teclado e imprima os N primeiros números primos
*  */

package bloco.funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class NumeroPrimo {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(ePrimo(N)){
            System.out.println(N + " é primo!");
        }else{
            System.out.println(N + " não é primo!");
        }

        System.out.print("Os " + N + " primeiros primos são: ");
        System.out.println(imprimirNPrimeirosPrimos(N));

    }

    // Pega o ultimo digito do numero
   private static int ultimoDigito(int n){

       String nString = String.valueOf(n);

       int[] digitos = Arrays.stream(
               nString.split(""))
               .mapToInt(Integer::parseInt)
               .toArray();

       return digitos[digitos.length-1];
    }

    private static boolean ePrimo(int n){

        if(n<=1) return false;

        if(n==2 || n==3 || n==5) return true;

        if(n%3==0) return false;


        // Compara o digito final do numero com os digitos finais possiveis

        final int[] DIGITOS_FINAIS_POSSIVEIS = {1,3,7,9};

        int ultimoDigito = ultimoDigito(n);
        for(int digito : DIGITOS_FINAIS_POSSIVEIS){
            if(ultimoDigito==digito) {
                return true;
            }
        }

        return false;
    }

    // Exibe os N primeiros primos
    private static String imprimirNPrimeirosPrimos(int x){

        int[] nPrimos = new int[x];
        int num = 0;

        for(int counter=0; counter<x; num++){

            if(ePrimo(num)){
                nPrimos[counter] = num;
                counter++;
            }
        }

        return Arrays.toString(nPrimos)
                .replace("[","")
                .replace("]","");
    }
}