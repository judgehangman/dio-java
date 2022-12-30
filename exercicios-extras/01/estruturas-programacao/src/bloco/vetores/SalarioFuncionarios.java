/*
*  Uma empresa deve realizar uma estatística do salário de seus funcionários.
*  Para isto precisa de um programa que leia uma lista contendo os salários dos funcionários da empresa
*  e imprima quantos funcionários ganham salário acima da média. Sabe-se que a empresa possui 50 funcionários.
*
*  Considerando que não há um número fixo de 50 funcionários, o programa pergunta no incício quantos funcionários
*  possui a empresa e realiza o restante do processo.
*
* */
package bloco.vetores;

import java.util.Scanner;

public class SalarioFuncionarios {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios tem a empresa atualmente?");
        int numFuncionarios = sc.nextInt();


        if(numFuncionarios>0 && numFuncionarios<=50){
            double[] salarios = new double[numFuncionarios];
            System.out.print(calcularAcimaDaMedia(salarios) + " funcionários ganham acima da média");
        }else {
            System.out.println("Insira uma quantidade válida");
        }
    }

    static int calcularAcimaDaMedia(double[] valores){
        Scanner sc = new Scanner(System.in);

       double total = 0.0d;

        int quantidade = 0;

        for(int i=0; i<valores.length; i++){


            System.out.print("Qual o salário do funcionário? ");
            double d = sc.nextDouble();

            valores[i] = d;

            total = total+d;

            double media = total/valores.length;

            if(d < media){
                quantidade++;
            }
        }

        return quantidade;
    }
}
