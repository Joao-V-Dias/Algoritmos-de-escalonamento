package com.os;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    static List<Processo> ler(){
        Scanner input = new Scanner(System.in);
        int qtdprocessos;

        do{
            System.out.print("Digite a quantidade de processos: ");
            qtdprocessos = input.nextInt();

            if ( qtdprocessos < 2 || qtdprocessos > 15) System.out.println(RED + "Digite uma quantidade valida!" + RESET);
        }while(qtdprocessos < 2 || qtdprocessos > 15);

        input.nextLine();

        List<Processo> listaProcesso = new ArrayList<>();
        for(int i = 0 ; i < qtdprocessos; i++){
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Tempo de chegada: ");
            int tempoChegada = input.nextInt();

            System.out.print("Tempo de execucao: ");
            int tempoExecucao = input.nextInt();
            input.nextLine();

            listaProcesso.add(new Processo(nome, tempoChegada, tempoExecucao));
        }

        input.close();
        return listaProcesso;
    }
}
