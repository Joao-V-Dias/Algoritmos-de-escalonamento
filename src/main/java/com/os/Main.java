package com.os;

import java.util.List;

public class Main {
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(BLUE + "Algoritmos de Escalonamento" + RESET);

        // Lista de processos
        List<Processo> entrada = Entrada.ler();

        SRT.main(entrada);

        RoundRobin.main(entrada, 2);
    }
}