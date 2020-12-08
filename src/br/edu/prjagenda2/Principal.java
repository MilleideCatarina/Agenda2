package br.edu.prjagenda2;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        JFrame janela = new JFrame("Agenda");
        janela.setContentPane(new TelaAgenda().getAgenda());
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}





