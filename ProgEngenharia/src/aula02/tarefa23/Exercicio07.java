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
public class Exercicio07 {

    /*
    Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo, considerando o reajuste de 1%
     */
    public static void main(String[] args) {
        //declarando as variáveis
        double numero, montante;
        //lendo
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digie um saldo"));
        //calculando
        montante = numero + (numero * 0.01);
        //mostrando
        JOptionPane.showMessageDialog(null, "O saldo resultante do reajuste de 1% no valor da aplicação é " + montante);

    }
}
