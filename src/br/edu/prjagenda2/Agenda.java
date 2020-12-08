package br.edu.prjagenda2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    List<ContatoBasico> contatos = new ArrayList<>();

    public List<ContatoBasico> getContatos() {
        return contatos;
    }

    public void setContatos(List<ContatoBasico> contatos) {
        this.contatos = contatos;
    }

    public void CadastrarPJ() {
        ContatoPJ contatoPJ = new ContatoPJ();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite:\n");
        System.out.println("Nome da empresa: ");
        contatoPJ.setNome(sc.nextLine());
        System.out.println("E-mail: ");
        contatoPJ.setEmail(sc.nextLine());
        int t = 0;
        do{
            System.out.println("Telefone: ");
            try {
                contatoPJ.setTelefone(Integer.parseInt(sc.nextLine()));
                t=1;
            } catch (NumberFormatException e) {
                System.out.println("Telefone inválido!\n");
            }
        } while(t != 1);
        System.out.println("Site: ");
        contatoPJ.setHomepage(sc.nextLine());
        System.out.println("Nome do contato na empresa: ");
        contatoPJ.setFuncionário(sc.nextLine());
        this.contatos.add(contatoPJ);
        System.out.println("\nContato PJ adicionado com sucesso!\n");
    };

    public void CadastrarPF(){
        ContatoPF contatoPF = new ContatoPF();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite:\n");
        System.out.println("Nome do contato: ");
        contatoPF.setNome(sc.nextLine());
        System.out.println("E-mail: ");
        contatoPF.setEmail(sc.nextLine());
        int t = 0;
        do{
            System.out.println("telefone: ");
            try {
                contatoPF.setTelefone(Integer.parseInt(sc.nextLine()));
                t=1;
            } catch (NumberFormatException e) {
                System.out.println("Telefone inválido!\n");
            }
        } while(t != 1);
        do{
            System.out.println("Data de nascimento (DD/MM/YYYY): ");
            try {
                contatoPF.setDataNascimento(sc.nextLine());
                t=2;
            } catch (ParseException e) {
                System.out.println("Data inválida!\n");
            }
        } while(t != 2);
        this.contatos.add(contatoPF);
        System.out.println("\nContato PF adicionado com sucesso!\n");
    }


    public void Listar(){
        if (contatos.isEmpty()){
            System.out.println("\nAgenda Vazia!\n");
        }else {
            for (ContatoBasico c : this.contatos){
                {
                    System.out.println(c.toString());
                }
            }
            System.out.println(" ");
        }
    }

    public void Buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome para busca: ");
        String nome = sc.nextLine();
        if (contatos.isEmpty()) {
            System.out.println("\nAgenda Vazia!\n");
        } else {
            for (ContatoBasico c : this.contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    System.out.println(c.toString());
                    System.out.println(" ");
                        return;
                    }

                }
                System.out.println("\nContato não encontrado!\n");
            }
        }

    public void Excluir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do contato para exclusão: ");
        String nome = sc.nextLine();
        if (contatos.isEmpty()) {
            System.out.println("\nAgenda Vazia!\n");
        } else {
            for (ContatoBasico c : this.contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatos.remove(c);
                    System.out.println("\nContato excluído com sucesso!\n");
                        return;
                }
                }
            System.out.println("\nContato não encontrado!\n");
            }
        }
    }

