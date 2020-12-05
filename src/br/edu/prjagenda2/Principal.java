package br.edu.prjagenda2;

import java.text.ParseException;
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
            System.out.println("*-*-*-*-*-*-*-*-*-*");
            System.out.println("Minha Agenda:");
            System.out.println("*-*-*-*-*-*-*-*-*-*\n");
            System.out.println("Menu \n");
            System.out.println("1- Cadastrar PJ \n2- Cadastrar PF  \n3- Listar \n4- Buscar \n5- Excluir \n6- Sair");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    principal.Cadastrar();
                    break;
                case 2:
                    principal.CadastrarPF();
                    break;
                case 3:
                    principal.Listar();
                    break;
                case 4:
                    principal.Buscar();
                    break;
                case 5:
                    principal.Excluir();
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (op != 6);

    }
    public void Cadastrar() {
            ContatoPJ cont = new ContatoPJ();
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva o nome do contato");
            cont.setNome(sc.nextLine());
            System.out.println("Escreva o email do contato");
            cont.setEmail(sc.nextLine());
            System.out.println("Escreva o telefone");
        try {
            cont.setTelefone(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Telefone inválido!");
        }
        System.out.println("Escreva o site da empresa");
            cont.setHomepage(sc.nextLine());
            System.out.println("Escreva o funcionário");
            cont.setFuncionário(sc.nextLine());
            this.contatos.add(cont);
        System.out.println("\nContato PJ adicionado com sucesso!");
        };

    public void CadastrarPF(){
        ContatoPF contatoPF = new ContatoPF();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o nome do contato");
        contatoPF.setNome(sc.nextLine());
        System.out.println("Escreva o email do contato");
        contatoPF.setEmail(sc.nextLine());
        System.out.println("Escreva o telefone");
        try {
            contatoPF.setTelefone(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Telefone inválido!");
        }
        System.out.println("Digite a data de nascimento: ");
        try {
            contatoPF.setDataNascimento(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Data inválida!");;
        }
        this.contatos.add(contatoPF);
        System.out.println("\nContato PF adicionado com sucesso!");
    }

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




