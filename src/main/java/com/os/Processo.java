package com.os;

public class Processo {
    private String name;
    private int tempoTotal;
    private int tempoChagada;

    public Processo(String name, int tempoTotal, int tempoChagada) {
        this.name = name;
        this.tempoTotal = tempoTotal;
        this.tempoChagada = tempoChagada;
    }

    public boolean terminou(){
        return this.tempoTotal == 0;
    }
}
