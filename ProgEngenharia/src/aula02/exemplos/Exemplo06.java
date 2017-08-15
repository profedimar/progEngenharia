/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 * 
 * Objetivo: ler uma variável numérica (precisão dupla)
 */
public class Exemplo06 {
    public static void main(String[] args) {
        //declarando a variável que receberá o valor a ser lido
        double salario;

        //lendo -- Informar ponto em vez de vírgula
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));

        //mostrando o nome lido
        JOptionPane.showMessageDialog(null, "Seu salário é: " + salario);
    }
}
