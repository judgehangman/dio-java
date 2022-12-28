package com.github.judgehangman;

import com.github.judgehangman.pbclass.ClassePublica;

public class Main {

    public static void main (String[] args) {

        ClassePublica classePublica = new ClassePublica();

        System.out.println("Essa classe não está no mesmo subpacote de nenhuma outra class");
        System.out.println("Crio um objeto da Classe pública para acessar seus métodos: ");

        classePublica.topClassPublicVoidPublic();

    }
}
