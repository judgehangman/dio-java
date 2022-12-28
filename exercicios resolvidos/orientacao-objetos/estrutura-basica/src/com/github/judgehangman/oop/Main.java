package com.github.judgehangman.oop;

public class Main {

    public static void main (String[] args) {

        // Chevrolet Impala 1967 Preto

        Carro chevyImpala67Black = new Carro();

        chevyImpala67Black.setCor("Preto");
        chevyImpala67Black.setModelo("1967 Impala");
        chevyImpala67Black.setCapacidadeTanque(90);

        System.out.println(chevyImpala67Black.getCor());
        System.out.println(chevyImpala67Black.getModelo());
        System.out.println(chevyImpala67Black.getCapacidadeTanque());
        System.out.println(chevyImpala67Black.calcValorTotal(4.92));

        // Saturn Sky 2007 Vermelho

        Carro saturnSky = new Carro("Vermelho", "2007 Saturn Sky", 51);

        System.out.println(saturnSky.getCor());
        System.out.println(saturnSky.getModelo());
        System.out.println(saturnSky.getCapacidadeTanque());
        System.out.println(saturnSky.calcValorTotal(5.19));
    }
}
