package com.os;

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
        List<Processo> entrada = Entrada.ler();

        SRT.main(entrada);

        System.out.println("Round Robin!");
        RoundRobin.main(entrada, 3);

    }
}