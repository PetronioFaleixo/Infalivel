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

public class PontoAcai {
    public  static void  main(String[] args){

            Double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe a opção : " +
                    "\n  300" +
                    "\n  500" +
                    "\n  700"));

            Boolean acrescimo = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem acrescimo digite true ou false"));
            Acai a = new Acai();
            Double valor = a.MontaAcai(preco,acrescimo);

            JOptionPane.showMessageDialog(null, "O preço foi  : "
                    + valor, "Informações",JOptionPane.INFORMATION_MESSAGE );

    }
}
