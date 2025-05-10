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

        // Lista de processos
        List<Processo> entrada = new ArrayList<>();
        entrada.add(new Processo("A", 1, 3));
        entrada.add(new Processo("B", 0, 2));
        entrada.add(new Processo("C", 1, 4));
        entrada.add(new Processo("D", 1, 4));
        entrada.add(new Processo("E", 2, 1));
        entrada.add(new Processo("F", 3, 2));
        entrada.add(new Processo("G", 4, 1));
        entrada.add(new Processo("H", 20, 1));

        SRT.main(entrada);

        System.out.println("Round Robin!");
        RoundRobin.main(entrada, 3);

    }
}