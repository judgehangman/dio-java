package com.github.judgehangman;

/*
* Faça um programa que leia 5 números e informe o maior número e a média desses números.
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorMedia {

    public static void main (String[] args) {

        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int num = 0;
        int max = 0;

        do {
            System.out.println("Insira um número: ");
            num = sc.nextInt();
            sum += num;
            count++;

            if(num > max){max = num;}

        }while(count<5);

        System.out.println("Média: " + sum/count);
        System.out.println("Maior numero: " + max);

    }

}
