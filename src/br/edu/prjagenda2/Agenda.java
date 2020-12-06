package br.edu.prjagenda2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    List<ContatoBasico> contatos = new ArrayList<>();

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
                System.out.println("Telefone inválido!");
            }
        } while(t != 1);
        System.out.println("Site: ");
        contatoPJ.setHomepage(sc.nextLine());
        System.out.println("Nome do contato na empresa: ");
        contatoPJ.setFuncionário(sc.nextLine());
        this.contatos.add(contatoPJ);
        System.out.println("\nContato PJ adicionado com sucesso!");
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
                System.out.println("Telefone inválido!");
            }
        } while(t != 1);
        do{
            System.out.println("Data de nascimento (DD/MM/YYYY): ");
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
