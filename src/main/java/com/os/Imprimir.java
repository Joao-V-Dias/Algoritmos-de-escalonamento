package com.os;

public class Imprimir {
    public static void timeline(int tempo){
        System.out.println("Tempo " + tempo + ": ocioso");
    }

    public static void timeline(int tempo, String processo){
        System.out.println("Tempo " + tempo + ": executando " + processo);
    }
}
