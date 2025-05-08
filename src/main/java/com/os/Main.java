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

        //Classe entrada para captura todos os processos
        //digitados pelo usuario que serao salvos na lista de processos
        System.out.println("Inserindo lista de processos!");
        List<Processo> processoList = Entrada.inserir();

        SRT.main(processoList);
        RoundRobin.main(processoList);
    }
}