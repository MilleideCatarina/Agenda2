package br.edu.prjagenda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    List <ContatoBasico> contatos = new ArrayList<>();

    public static void main(String[] args) {


        Principal principal = new Principal();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println(" Menu ");
            System.out.println("1- Cadastrar, 2- Listar, 3- Buscar, 4- Excluir, 5- Sair");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    principal.Cadastrar();
                    break;
                case 2:
                    principal.Listar();
                    break;
                case 3:
                    principal.Buscar();
                    break;
                case 4:
                    principal.Excluir();
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (op != 5);

    }
    public void Cadastrar() {
            ContatoPJ cont = new ContatoPJ();
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva o nome do contato");
            cont.setNome(sc.nextLine());
            System.out.println("Escreva o email do contato");
            cont.setEmail(sc.nextLine());
            System.out.println("Escreva o telefone");
            cont.setTelefone(Integer.parseInt(sc.nextLine()));
            System.out.println("Escreva o site da empresa");
            cont.setHomepage(sc.nextLine());
            System.out.println("Escreva o funcionário");
            cont.setFuncionário(sc.nextLine());
            this.contatos.add(cont);
        };

    public void Listar(){
        for (ContatoBasico c : this.contatos){
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

    public void Buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o nome para busca");
        String nome = sc.nextLine();
        for (int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                System.out.println(contatos.get(i));
            }
        }

    }
    public void Excluir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o nome do contato para excluir");
        String nome = sc.nextLine();
        for (int i = 0; i < contatos.size(); i++){
        if(contatos.get(i).getNome().equals(nome)){
            contatos.remove(i);
        }
    }

    }
      }




