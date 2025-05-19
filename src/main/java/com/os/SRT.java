package com.os;

import java.util.*;

public class SRT {

    public static void main(List<Processo> processosOriginais) {
        // Clonar os processos para evitar efeitos colaterais em outras execuções (ex: Round Robin depois)
        List<Processo> processos = new ArrayList<>();
        for (Processo p : processosOriginais) {
            processos.add(new Processo(p.getName(), p.getTempoChegada(), p.getTempoExecucao()));
        }

        escalonar(processos);
    }

    public static void escalonar(List<Processo> processos) {
        int tempoAtual = 0;
        int processosFinalizados = 0;
        int n = processos.size();

        // Mapas de controle
        Map<String, Integer> tempoRestante = new HashMap<>();
        Map<String, Integer> tempoSaida = new HashMap<>();
        Map<String, Integer> tempoEspera = new HashMap<>();
        Map<String, Integer> tempoInicio = new HashMap<>();

        for (Processo p : processos) {
            tempoRestante.put(p.getName(), p.getTempoExecucao());
            tempoEspera.put(p.getName(), 0);
        }

        Processo executando;

        while (processosFinalizados < n) {
            // Processos disponíveis
            List<Processo> disponiveis = new ArrayList<>();
            for (Processo p : processos) {
                if (p.getTempoChegada() <= tempoAtual && tempoRestante.get(p.getName()) > 0) {
                    disponiveis.add(p);
                }
            }

            // Seleciona processo com menor tempo restante
            executando = disponiveis.stream()
                    .min(Comparator.comparingInt(p -> tempoRestante.get(p.getName())))
                    .orElse(null);

            if (executando != null) {
                if (!tempoInicio.containsKey(executando.getName())) {
                    tempoInicio.put(executando.getName(), tempoAtual);
                }

                // Executa por 1 unidade de tempo
                tempoRestante.put(executando.getName(), tempoRestante.get(executando.getName()) - 1);

                if (tempoRestante.get(executando.getName()) == 0) {
                    tempoSaida.put(executando.getName(), tempoAtual + 1);
                    processosFinalizados++;
                }
            }

            tempoAtual++;
        }

        // Resultado
        System.out.println("\n[ Escalonamento SRT - Shortest Remaining Time ]");
        System.out.println("Processo | Chegada | Execução | Saída | Espera | Turnaround");
        for (Processo p : processos) {
            String nome = p.getName();
            int chegada = p.getTempoChegada();
            int exec = p.getTempoExecucao();
            int saida = tempoSaida.get(nome);
            int turnaround = saida - chegada;
            int espera = turnaround - exec;

            System.out.printf("  %6s |   %6d |   %7d |  %4d |  %5d |     %8d\n",
                    nome, chegada, exec, saida, espera, turnaround);
        }
    }
}
