/* Os números de Fibonacci formam um sequência em que cada númerp é igual à soma dos dois anteriores.
   Os dois primeiros números são, por definição, igual a 1, seguindo o exemplo abaixo:

   1 1 2 3 5 8 13...

   Escreva um programa que carregue um número interio pelo teclado e indique se ele faz parte da sequência de Fibonnaci

   FORMULAS:

 */

package bloco.estruturas;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(eFibonacci(num));
    }

    // Um quadrado perfeito é aquele cuja raiz quadrada de um int x é também um int, ou seja, é exato
    static boolean eQPerfeito(int x){

        int q = (int) Math.sqrt(x);

        return q*q==x;
    }

    // Um numero faz parte da sequencia de fibonacci somente se 5*n²+4 ou 5*n²-4 é um quadrado perfeito
    static boolean eFibonacci(int n){
        final int FORMULA_ADD = 5*(n*n)+4;
        final int FORMULA_SUB = 5*(n*n)-4;

        return eQPerfeito(FORMULA_ADD) || eQPerfeito(FORMULA_SUB);
    }
}
