package br.edu.prjagenda2;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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
    private JTextArea textArea1;

    public JPanel getAgenda() {
        return Agenda;
    }

    List<ContatoBasico> contatos = new ArrayList<>();

    public List<ContatoBasico> getContatos() {
        return contatos;
    }

    public void setContatos(List<ContatoBasico> contatos) {
        this.contatos = contatos;
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
                        return;
                    }
                contatoPJ.setHomepage(textField5.getText());
                contatoPJ.setFuncionário(textField6.getText());
                contatos.add(contatoPJ);
                JOptionPane.showMessageDialog(null, "ContatoPJ cadastrado com sucesso!");
                acaobotaolimpa();
            }

        });

        CADASTRARButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ContatoPF contatoPF = new ContatoPF();
                contatoPF.setNome(textField2.getText());
                contatoPF.setEmail(textField7.getText());
                 try {
                    contatoPF.setTelefone(Integer.parseInt(textField8.getText()));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro Telefone Inválido!");
                    System.out.println(" erro:" + ex.getMessage());
                    return;
                }
                try {
                    contatoPF.setDataNascimento(textField9.getText());

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Data Inválida!");
                    System.out.println(" erro:" + ex.getMessage());
                    return;
                }

                contatos.add(contatoPF);
                JOptionPane.showMessageDialog(null, "ContatoPF cadastrado com sucesso!");
                acaobotaolimpa();

            }

        });
        LISTARButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              if (contatos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Agenda Vazia!");
                    acaobotaolimpa();
                } else {
                    for (ContatoBasico c : contatos) {
                        {
                            textArea1.setText(String.valueOf(contatos.toString()));
                        }
                    }

                }
            }
        });
        BUSCARButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              if (contatos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Agenda Vazia!");
                    acaobotaolimpa();
                } else {
                    for (ContatoBasico c : contatos) {
                        if (c.getNome().equalsIgnoreCase(textField11.getText())) {
                            textField12.setText(String.valueOf(c.toString()));
                            return;
                        }

                    }
                    JOptionPane.showMessageDialog(null, "Contato não encontrado!");
                    acaobotaolimpa();
                }
            }
        });

        EXCLUIRButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               if (contatos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Agenda Vazia!");
                } else {
                    for (ContatoBasico c : contatos) {
                        if (c.getNome().equalsIgnoreCase(textField13.getText())) {
                            contatos.remove(c);
                            JOptionPane.showMessageDialog(null, "Contato excluído com sucesso!");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Contato não encontrado!");
                    acaobotaolimpa();
                }
            }

        });

    }
    public void acaobotaolimpa() {
        if (textField1 != null) {
        textField1.setText(""); }

        if (textField2 != null) {
        textField2.setText("");}

        if (textField3 != null) {
        textField3.setText("");}

        if (textField4 != null) {
        textField4.setText("");}

        if (textField5 != null) {
        textField5.setText("");}

        if (textField6 != null) {
        textField6.setText("");}

        if (textField7 != null) {
        textField7.setText("");}

        if (textField8 != null) {
        textField8.setText("");}

        if (textField9 != null) {
        textField9.setText("");}

        if (textField10 != null) {
        textField10.setText("");}

        if (textField11 != null) {
        textField11.setText("");}

        if (textField12 != null) {
        textField12.setText("");}

        if (textField13 != null) {
        textField13.setText("");}
    }
}