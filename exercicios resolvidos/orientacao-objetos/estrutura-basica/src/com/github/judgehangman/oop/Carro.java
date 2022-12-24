package com.github.judgehangman.oop;

class Carro{

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtores
    Carro(){    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // GETTERS E SETTERS
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    // MÉTODOS
    double calcValorTotal(double valorGasolina){
        return capacidadeTanque * valorGasolina;
    }
}