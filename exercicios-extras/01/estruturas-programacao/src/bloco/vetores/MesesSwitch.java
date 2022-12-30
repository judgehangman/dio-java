/*
 *  Escreva uma funcao que receba como parâmetro um número inteiro relativo a um Mẽs do ano
 *  e retorne uma string com o nome deste mês por extenso. Resolva o problema da seguinte maneira:
 *
 *       -> Sem um vetor, através de uma estrutura de switch/case
 *
 * */

package bloco.vetores;

import java.util.Scanner;

public class MesesSwitch {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        System.out.println(mostrarNomeMes(mes));

    }

    static String mostrarNomeMes(int i){
        return switch(i) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Insira um mês válido! ";
        };
    }

}
