package com.github.judgehangman;

public class Main {

    public static void main (String[] args) {

        Superclasse[] classes = new Superclasse[]{new Subclasse1(), new Subclasse2(), new Superclasse()};

        for(Superclasse classe : classes){
            classe.metodo1();
        }

        for(Superclasse classe : classes){
            classe.metodo2();
        }

        System.out.println("");

        Subclasse2 subclasse2 = new Subclasse2();
        subclasse2.metodo2();
    }

}
