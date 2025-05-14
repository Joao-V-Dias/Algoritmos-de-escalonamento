package com.os;

public class Processo {
    private String name;
    private int tempoExecucao;
    private int tempoChagada;

    public Processo(String name, int tempoChegada, int tempoExecucao) {
        this.name = name;
        this.tempoExecucao = tempoExecucao;
        this.tempoChagada = tempoChegada;
    }

    public int getTempoChegada() {
        return tempoChagada;
    }

    public String getName() {
        return name;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public void executar(){
        if (this.tempoExecucao > 0) this.tempoExecucao--;
    }

    public boolean encerrado(){
        return this.tempoExecucao <= 0;
    }

    @Override
    public String toString() {
        return "Processo: [" + this.name + ", chegada: " + this.tempoChagada
                + ", tempo execucao: " + this.tempoExecucao + " ]";
    }
}
