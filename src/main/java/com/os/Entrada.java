package com.os;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    static List<Processo> ler(){
        Scanner input = new Scanner(System.in);

        //Pegar lista de processos
        System.out.print("Digite a quantidade de processos: ");
        int qtdprocessos = input.nextInt();
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
