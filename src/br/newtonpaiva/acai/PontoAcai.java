package br.newtonpaiva.acai;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class PontoAcai extends JFrame {
    public  static void  main(String[] args){
        PontoAcai field = new PontoAcai();
        field.testaJFormattedTextField();

        Acai a = new Acai();
        a.MontaAcai(500.0,true);
    }
    private void testaJFormattedTextField() {
        Container janela = getContentPane();
        setLayout(null);

        //Define os rótulos dos botões
        JLabel labelTamanho = new JLabel("Tamanho: 300/500/700 ");
        JLabel labelAcrescimo = new JLabel("Vai Ter acréscimo : SIM-NAO ");
        labelTamanho.setBounds(50,40,100,20);
        labelAcrescimo.setBounds(50,80,100,20);

        //Define as máscaras
        MaskFormatter mascaraTamanho = null;
        MaskFormatter mascaraAcrescimo = null;

        try{
            mascaraTamanho = new MaskFormatter("###ml");
            mascaraAcrescimo = new MaskFormatter("UUU");

            mascaraTamanho.setPlaceholderCharacter('_');
            mascaraAcrescimo.setPlaceholderCharacter('_');
        }
        catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextTamanho = new JFormattedTextField(mascaraTamanho);
        JFormattedTextField jFormattedTextAcrescimo = new JFormattedTextField(mascaraAcrescimo);

        jFormattedTextTamanho.setBounds(150,40,100,20);
        jFormattedTextAcrescimo.setBounds(150,80,100,20);

        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelTamanho);
        janela.add(labelAcrescimo);
        janela.add(jFormattedTextTamanho);
        janela.add(jFormattedTextAcrescimo);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
