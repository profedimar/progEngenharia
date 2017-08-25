/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa22;

import javax.swing.JOptionPane;

/**
 *
 * @author labin
 */
public class Exercicio06 {
    /*
     Entrar com dois números reais e imprimir a média aritmética
     */

    public static void main(String[] args) {
        //declarando as variáveis
        double nr1, nr2, media;

        //lendo
        nr1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        nr2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));

        //calculando a media
        media = (nr1 + nr2) / 2;

        //mostrando
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}
