package com.github.judgehangman;

import com.github.judgehangman.objects.funcionarios.Faxineiro;
import com.github.judgehangman.objects.funcionarios.Gerente;
import com.github.judgehangman.objects.funcionarios.Vendedor;
import com.github.judgehangman.objects.funcionarios.Funcionario;

public class Main {

    public static void main (String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcasting

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /* Downcasting -> ocorre ClassCastException

        # https://docs.oracle.com/javase/7/docs/api/java/lang/ClassCastException.html

        // Gerente gerenteD = (Gerente) new Funcionario();
        // Vendedor vendedorD = (Vendedor) new Funcionario();
        // Faxineiro faxineiroD = (Faxineiro) new Funcionario();

         */

    }
}