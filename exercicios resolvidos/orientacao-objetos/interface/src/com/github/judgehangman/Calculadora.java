package com.github.judgehangman;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma (double a, double b) {
        System.out.println("Soma: " + (a+b));;
    }

    @Override
    public void subtracao (double a, double b) {
        System.out.println("Subtração: " + (a-b));;
    }

    @Override
    public void divisao (double a, double b) {
        System.out.println("Divisão: " + (a/b));
    }

    @Override
    public void multiplicacao (double a, double b) {
        System.out.println("Multiplicação: " + a*b);
    }
}
