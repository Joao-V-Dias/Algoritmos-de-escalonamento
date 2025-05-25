package com.os;

import java.util.*;

public class SRT {

    public static void main(List<Processo> processoEntrada) {
        // Cria cópia para não alterar os dados originais
        List<Processo> processos = new ArrayList<>();
        for (Processo p : processoEntrada) {
            processos.add(new Processo(p.getName(), p.getTempoChegada(), p.getTempoExecucao()));
        }

        // Lista de processos prontos
        List<Processo> fila = new ArrayList<>();

        int time = 0;
        int totalProcessos = processos.size();

        // Mapa para salvar tempo de execução restante
        Map<Processo, Integer> tempoRestante = new HashMap<>();
        for (Processo p : processos) {
            tempoRestante.put(p, p.getTempoExecucao());
        }

        // Mapa de saída final
        Map<Processo, Integer> tempoSaida = new HashMap<>();

        // Timeline
        System.out.println("\n[ Escalonamento SRT - Shortest Remaining Time ]");
        Imprimir.cabecalho();

        while (!fila.isEmpty() || !processos.isEmpty()) {
            // Adiciona processos que chegaram no tempo atual
            Iterator<Processo> it = processos.iterator();
            while (it.hasNext()) {
                Processo p = it.next();
                if (p.getTempoChegada() == time) {
                    fila.add(p);
                    it.remove();
                }
            }

            if (!fila.isEmpty()) {
                // Escolhe o processo com menor tempo restante
                Processo atual = fila.stream()
                        .min(Comparator.comparingInt(tempoRestante::get))
                        .get();

                // Executa o processo por 1 unidade
                tempoRestante.put(atual, tempoRestante.get(atual) - 1);
                Imprimir.timeline(time, atual.getName());
                time++;

                // Verifica se o processo terminou
                if (tempoRestante.get(atual) == 0) {
                    tempoSaida.put(atual, time); // tempo de término é o tempo atual
                    fila.remove(atual);
                }
            } else {
                // Nenhum processo disponível no momento
                Imprimir.timeline(time);
                time++;
            }
        }

        Imprimir.rodape();
    }
}
