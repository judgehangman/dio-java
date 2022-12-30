/* Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
   impares entre A e B
*/

package bloco.estruturas;

import java.util.Scanner;

public class Impar {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("\nInsira o segundo numero: ");
        int b = sc.nextInt();


        System.out.print("\nOs númeors ímpares entre " + a + " e " + b + " são: [ ");
        for(int i = a+1; i<b; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.print(" ]");
    }
}
