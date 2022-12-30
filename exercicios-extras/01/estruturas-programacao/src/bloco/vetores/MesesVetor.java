/*
*  Escreva uma funcao que receba como parâmetro um número inteiro relativo a um Mẽs do ano
*  e retorne uma string com o nome deste mês por extenso. Resolva o problema da seguinte maneira:
*
*       -> Utilizando um vetor
*
* */
package bloco.vetores;

import java.util.Scanner;

public class MesesVetor {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        System.out.println(mostrarNomeMes(mes));

    }

    static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                            "Maio", "Junho", "Julho", "Agosto",
                            "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String mostrarNomeMes(int i){

        if(i > (meses.length) || i < 1){
            return "Insira um mês valído!";
        }else {
            return meses[i-1];
        }
    }
}
