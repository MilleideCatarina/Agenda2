package br.edu.prjagenda2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    List <ContatoBasico> contatos = new ArrayList<>();

    public static void main(String[] args) {


        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("*-*-*-*-*-*-*-*-*-*");
            System.out.println("Minha Agenda:");
            System.out.println("*-*-*-*-*-*-*-*-*-*\n");
            System.out.println("Menu \n");
            System.out.println("1- Cadastrar PJ \n2- Cadastrar PF  \n3- Listar \n4- Buscar \n5- Excluir \n6- Sair");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    agenda.CadastrarPJ();
                    break;
                case 2:
                    agenda.CadastrarPF();
                    break;
                case 3:
                    agenda.Listar();
                    break;
                case 4:
                    agenda.Buscar();
                    break;
                case 5:
                    agenda.Excluir();
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (op != 6);

    }
}




