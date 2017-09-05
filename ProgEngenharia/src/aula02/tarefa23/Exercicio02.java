/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa23;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio02 {

    /*
    Entrar com quatro números reais e imprimir a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4
     */
    public static void main(String[] args) {
        //declarando as variáveis
        double nota01, nota02, nota03, nota04, media;

        //lendo
        nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 01:"));
        nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 02:"));
        nota03 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 03:"));
        nota04 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 04:"));

        //calculando
        media = nota01 * 0.1 + nota02 * 0.2 + nota03 * 0.3 + nota04 * 0.4;

        //mostrando
        JOptionPane.showMessageDialog(null, "Média: " + media);

    }
}
