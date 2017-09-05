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
public class Exercicio03 {

    /*
    Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante, cossecante e cotangente deste ângulo
     */
    public static void main(String[] args) {
        //declando as variáveis
        double angulo;

        //lendo
        angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite ângulo:"));

        //mostrando
        JOptionPane.showMessageDialog(null, "Seno: " + Math.sin(Math.toRadians(angulo)));
        JOptionPane.showMessageDialog(null, "Cosseno: " + Math.cos(Math.toRadians(angulo)));
        JOptionPane.showMessageDialog(null, "Tangente: " + Math.tan(Math.toRadians(angulo)));
        JOptionPane.showMessageDialog(null, "Secante: " + (1 / Math.cos(Math.toRadians(angulo))));
        JOptionPane.showMessageDialog(null, "Cossecante: " + (1 / Math.sin(Math.toRadians(angulo))));
        JOptionPane.showMessageDialog(null, "Cotangente: " + (1 / Math.tan(Math.toRadians(angulo))));
    }
}
