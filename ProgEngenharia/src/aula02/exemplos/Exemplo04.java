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
 * Objetivo: ler variável inteira
 */
public class Exemplo04 {
    public static void main(String[] args) {
        //declarando a variável que receberá o valor a ser lido
        int idade;

        //lendo
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        //mostrando o nome lido
        System.out.println("Seu idade é: " + idade);
    }
}
