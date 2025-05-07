package com.os;

public class Processo {
    private String name;
    private int tempoExecucao;
    private int tempoChagada;

    public Processo(String name, int tempoExecucao, int tempoChagada) {
        this.name = name;
        this.tempoExecucao = tempoExecucao;
        this.tempoChagada = tempoChagada;
    }

    public boolean terminou(){
        return this.tempoExecucao == 0;
    }
}
