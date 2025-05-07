package com.os;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
    public static List<Processo> inserir(){
        // Cria o scanner para ler a entrada
        Scanner input = new Scanner(System.in);

        //Recebe a quantidade de processos
        System.out.print("Número de processos: ");
        int qtdProcesso = input.nextInt();
        input.nextLine();

        //Cria a lista de processos
        List<Processo> inputProcesso = new ArrayList<>();

        //Recebe os dados de cada processo e adiciona na lista
        for(int i = 0; i < qtdProcesso ; i++){
            System.out.print("Digite o nome: ");
            String nome = input.nextLine();

            System.out.print("Digite o tempo de execução: ");
            int tempoExecucao = input.nextInt();

            System.out.print("Digite o tempo de chegada: ");
            int tempoChegada = input.nextInt();
            input.nextLine();

            inputProcesso.add(new Processo(nome, tempoExecucao, tempoChegada));

            System.out.println("________________________________________________________");
        }

        //Fecha o input e retorna para a main
        input.close();
        return inputProcesso;
    }
}
