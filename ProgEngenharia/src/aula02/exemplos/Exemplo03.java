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
 * Objetivo: ler texto
 */
public class Exemplo03 {

    public static void main(String[] args) {
        //declarando a variável que receberá o valor a ser lido
        String nome;

        //lendo
        nome = JOptionPane.showInputDialog("Digite o seu nome:");

        //mostrando o nome lido
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);

    }
}
