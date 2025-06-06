package com.os;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoundRobin {
    public static void main(List<Processo> processoEntrada, int quantum){
        // Iniciar time
        int time = 0;
        // Representa as vezes de uso até o quantum
        int uso = 0;

        // Cria uma copia de dos processo que veio da entrada para nao alterar os originais
        List<Processo> processos = new ArrayList<>(processoEntrada);

        // Cria lista ordenada de acordo com a entrada dos processos
        List<Processo> fila = new ArrayList<>();

        Iterator<Processo> it = processos.iterator();
        while (it.hasNext()) {
            Processo processo = it.next();
            if(processo.getTempoExecucao() <= 0 || processo.getTempoChegada() < 0){
                it.remove();
            }else if (processo.getTempoChegada() == time) {
                fila.add(processo);
                it.remove();
            }
        }

        // Timeline
        System.out.println("\n[ Escalonamento RR - Roudin Robin ]");
        Imprimir.cabecalho();
        while(!processos.isEmpty() || !fila.isEmpty()){
            if (!fila.isEmpty()) {
                Processo atual = fila.get(0);

                atual.executar();
                Imprimir.timeline(time, atual.getName());
                time++;
                uso++;

                if (atual.encerrado()) {
                    fila.remove(0);
                    uso = 0;
                }else if (uso == quantum) {
                    fila.remove(0);
                    fila.add(atual);
                    uso = 0;
                }
            }

            Iterator<Processo> iterator = processos.iterator();
            while (iterator.hasNext()) {
                Processo processo = iterator.next();
                if (processo.getTempoChegada() == time ) {
                    fila.add(processo);
                    iterator.remove();
                }
            }
            if(fila.isEmpty()){
                Imprimir.timeline(time);
                time++;
            }
        }
        Imprimir.rodape();
    }
}
