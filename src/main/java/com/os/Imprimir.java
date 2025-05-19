package com.os;

public class Imprimir {
    public static void cabecalho() {
        System.out.println("+--------+----------------+");
        System.out.println("| Tempo  | Processo       |");
        System.out.println("+--------+----------------+");
    }

    public static void timeline(int tempo) {
        System.out.printf("| %6d | %-14s |\n", tempo, "ocioso");
    }

    public static void timeline(int tempo, String processo) {
        System.out.printf("| %6d | %-14s |\n", tempo, processo);
    }

    public static void rodape() {
        System.out.println("+--------+----------------+");
    }
}
