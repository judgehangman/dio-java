/*       Escreva um módulo que determine se uma cadeia de caracteres é um palíndromo ou não.
         Um palíndromo é uma cadeia que é igual sua inversa

         ASA   =  ASA   (inverso)  -->   é um PALÍNDROMO
         JOAO  =  OAOJ  (inverso)  -->   não é um PALÍNDROMO
         343   =  343   (inverso)  -->   é um PALÍNDROMO
*/

package bloco.estruturas;

import java.util.Scanner;

public class Palindromo {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(ePalindromo(input)){
            System.out.print("é um PALÍNDROMO");
        }else{
            System.out.print("não é um PALÍNDROMO");
        }

    }

    // Inverte input
    static String inverte(String palavra){

        char[] invertida = new char[palavra.length()];

        int index = palavra.length()-1;
        for(int i = 0; index>=0; index--){
            invertida[i] = palavra.charAt(index);
            i++;
        }
        return String.valueOf(invertida);
    }

    // Checa se é palíndromo
    static boolean ePalindromo(String s){
        String invertida = inverte(s);

        return invertida.equalsIgnoreCase(s);
    }

}
