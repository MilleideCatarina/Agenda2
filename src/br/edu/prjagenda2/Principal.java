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
                    principal.CadastrarPJ();
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
    public void CadastrarPJ() {
            ContatoPJ contatoPJ = new ContatoPJ();
            Scanner sc = new Scanner(System.in);
            System.out.println("\nDigite:\n");
            System.out.println("nome da empresa: ");
            contatoPJ.setNome(sc.nextLine());
            System.out.println("email: ");
            contatoPJ.setEmail(sc.nextLine());
        int t = 0;
        do{
            System.out.println("telefone: ");
            try {
                contatoPJ.setTelefone(Integer.parseInt(sc.nextLine()));
                t=1;
            } catch (NumberFormatException e) {
                System.out.println("Telefone inválido!");
            }
        } while(t != 1);
        System.out.println("site: ");
            contatoPJ.setHomepage(sc.nextLine());
            System.out.println("nome do contato na empresa: ");
            contatoPJ.setFuncionário(sc.nextLine());
            this.contatos.add(contatoPJ);
        System.out.println("\nContato PJ adicionado com sucesso!");
        };

    public void CadastrarPF(){
        ContatoPF contatoPF = new ContatoPF();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite:\n");
        System.out.println("nome do contato: ");
        contatoPF.setNome(sc.nextLine());
        System.out.println("email: ");
        contatoPF.setEmail(sc.nextLine());
        int t = 0;
        do{
            System.out.println("telefone: ");
            try {
                contatoPF.setTelefone(Integer.parseInt(sc.nextLine()));
                t=1;
            } catch (NumberFormatException e) {
                System.out.println("Telefone inválido!");
            }
        } while(t != 1);
        do{
            System.out.println("data de nascimento: ");
            try {
                contatoPF.setDataNascimento(sc.nextLine());
                t=2;
            } catch (ParseException e) {
                System.out.println("Data inválida!");
            }
        } while(t != 2);
        this.contatos.add(contatoPF);
        System.out.println("\nContato PF adicionado com sucesso!");
    }


    public void Listar(){
        if (contatos.isEmpty()){
            System.out.println("\nAgenda Vazia!");
        }else {
        for (ContatoBasico c : this.contatos){
            {
            System.out.println(c.toString());
            }
            }
        }
    }

    public void Buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome para busca: ");
        String nome = sc.nextLine();
        for (int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
                System.out.println(contatos.get(i));
            } else {
                System.out.println("\nContato não encontrado!");
            }
        }

    }
    public void Excluir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do contato para exclusão: ");
        String nome = sc.nextLine();
        for (int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)){
            contatos.remove(i);
                System.out.println("\nContato excluído com sucesso!");
            } else {
                System.out.println("\nContato não encontrado!");
            }
        }

    }


}




