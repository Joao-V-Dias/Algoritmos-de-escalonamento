package com.os;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void printTitulo(){
        System.out.println("  █████╗ ██╗      ██████╗  ██████╗ ██████╗ ██╗████████╗███╗   ███╗ ██████╗ ███████╗                                ");
        System.out.println(" ██╔══██╗██║     ██╔════╝ ██╔═══██╗██╔══██╗██║╚══██╔══╝████╗ ████║██╔═══██╗██╔════╝                                ");
        System.out.println(" ███████║██║     ██║  ███╗██║   ██║██████╔╝██║   ██║   ██╔████╔██║██║   ██║███████╗                                ");
        System.out.println(" ██╔══██║██║     ██║   ██║██║   ██║██╔══██╗██║   ██║   ██║╚██╔╝██║██║   ██║╚════██║                                ");
        System.out.println(" ██║  ██║███████╗╚██████╔╝╚██████╔╝██║  ██║██║   ██║   ██║ ╚═╝ ██║╚██████╔╝███████║                                ");
        System.out.println(" ╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝   ╚═╝   ╚═╝     ╚═╝ ╚═════╝ ╚══════╝                                ");
        System.out.println(" ██████╗ ███████╗                                                                                                 ");
        System.out.println(" ██╔══██╗██╔════╝                                                                                                 ");
        System.out.println(" ██║  ██║█████╗                                                                                                   ");
        System.out.println(" ██║  ██║██╔══╝                                                                                                   ");
        System.out.println(" ██████╔╝███████╗                                                                                                 ");
        System.out.println(" ╚═════╝ ╚══════╝                                                                                                 ");
        System.out.println(" ███████╗███████╗ ██████╗ █████╗ ██╗      ██████╗ ███╗   ██╗ █████╗ ███╗   ███╗███████╗███╗   ██╗████████╗ ██████╗ ");
        System.out.println(" ██╔════╝██╔════╝██╔════╝██╔══██╗██║     ██╔═══██╗████╗  ██║██╔══██╗████╗ ████║██╔════╝████╗  ██║╚══██╔══╝██╔═══██╗");
        System.out.println(" █████╗  ███████╗██║     ███████║██║     ██║   ██║██╔██╗ ██║███████║██╔████╔██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║");
        System.out.println(" ██╔══╝  ╚════██║██║     ██╔══██║██║     ██║   ██║██║╚██╗██║██╔══██║██║╚██╔╝██║██╔══╝  ██║╚██╗██║   ██║   ██║   ██║");
        System.out.println(" ███████╗███████║╚██████╗██║  ██║███████╗╚██████╔╝██║ ╚████║██║  ██║██║ ╚═╝ ██║███████╗██║ ╚████║   ██║   ╚██████╔╝");
        System.out.println(" ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ");
        System.out.println("                                                                                                                  ");
    }

    public static void main(String[] args) {
        printTitulo();

        //Classe entrada para captura todos os processos digitados pelo usuario que serao salvos na lista de processos
        //A lista de processo servirá para os dois algoritmos, então não é nécessario criar outra lista de processos
        System.out.println("Inserindo lista de processos!");
        //List<Processo> processoEntrada = Entrada.inserir();

        // SRT.main(processoEntrada);
        List<Processo> entrada = new ArrayList<>();
        entrada.add(new Processo("A", 1, 3));
        entrada.add(new Processo("B", 0, 2));
        entrada.add(new Processo("C", 0, 4));
        entrada.add(new Processo("D", 1, 4));
        entrada.add(new Processo("E", 2, 1));
        entrada.add(new Processo("F", 3, 2));
        entrada.add(new Processo("G", 6, 1));

        RoundRobin.main(entrada, 3);

    }
}