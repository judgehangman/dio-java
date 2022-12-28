package com.github.judgehangman;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner =new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Primeiro operando: ");
        double d1 = scanner.nextDouble();
        System.out.println("Segundo operando: ");
        double d2 = scanner.nextDouble();

        calculadora.soma(d1,d2);
        calculadora.subtracao(d1,d2);
        calculadora.divisao(d1,d2);
        calculadora.multiplicacao(d1,d2);
    }

}
