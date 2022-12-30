
/* Escreva um programa que leia o nome e salário atual de um funcionário. O programa de calcular seu novo
salário (segundo a tabela abaixo) e mostre o nome, o salário atual e o salário reajustado do funcionário:


      FAIXA SALARIAL

acima de            até     |  acréscimo
   --               150     |     25%
   150              300     |     20%
   300              600     |     15%
   600              --      |     10%

   -> repita o processo cima até que seja digitado FIM no lugar do nome do funcionário
   -> mostrar ao final do programa a soma dos salários atuais, a soma dos salários reajustados e a diferença entre eles

* */

package bloco.estruturas;

import java.util.Scanner;

public class ReajusteSalarial {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int somaAtual = 0;
        int somaReajuste = 0;
        while(true) {

            System.out.print("Nome: ");
            String nome = sc.next();

            if(nome.equalsIgnoreCase("FIM")){
                break;
            }

            System.out.print("\nSalário Atual:R$ ");
            int salarioAtual = sc.nextInt();
            System.out.println();

            double reajuste = 0;

            if(salarioAtual>0){
                if(salarioAtual<150){
                    reajuste = salarioAtual*0.25d;
                    System.out.println(reajuste);
                } else if (salarioAtual>150 && salarioAtual<300){
                    reajuste = salarioAtual*0.2d;
                    System.out.println(reajuste);
                } else if(salarioAtual>300 && salarioAtual<600){
                    reajuste = salarioAtual*0.15d;
                    System.out.println(reajuste);
                } else{
                    reajuste = salarioAtual*0.1d;
                    System.out.println(reajuste);
                }
            }
            somaAtual += salarioAtual;
            somaReajuste += salarioAtual + reajuste;

        }

        System.out.println("Soma dos salários atuais: R$" + somaAtual);
        System.out.println("Soma dos salários reajustados: R$" + somaReajuste);
        System.out.println("Diferença: R$" + (somaReajuste-somaAtual));
    }

}
