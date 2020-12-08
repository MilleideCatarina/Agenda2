package br.edu.prjagenda2;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaAgenda {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton cadastrarButton;
    private JPanel Agenda;
    private JTextField textField2;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton CADASTRARButton;
    private JButton LISTARButton;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JButton BUSCARButton;
    private JTextField textField13;
    private JButton EXCLUIRButton;

    public JPanel getAgenda() {
        return Agenda;
    }


    public TelaAgenda() {
        cadastrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    ContatoPJ contatoPJ = new ContatoPJ();
                    contatoPJ.setNome(textField1.getText());
                    contatoPJ.setEmail(textField3.getText());
                      try {
                            contatoPJ.setTelefone(Integer.parseInt(textField4.getText()));

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Erro Telefone Inválido!");
                            System.out.println(" erro:" + ex.getMessage());
                        }
                    contatoPJ.setHomepage(textField5.getText());
                    contatoPJ.setFuncionário(textField6.getText());
                    Agenda agenda = new Agenda();
                    agenda.contatos.add(contatoPJ);
                    JOptionPane.showMessageDialog(null, "Contato PJ cadastrado com sucesso!");
                }

            });

    }
}
