/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa22;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio02 {

    /**
     * Ler um numero inteiro e mostrar seu sucessor e seu antecessor
     */
    public static void main(String[] args) {

        //declarando a variável que receberá o valor a ser lido
        int numero, sucessor, antecessor;

        //lendo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        //calculando o sucessor
        sucessor = numero+1;
        
        //calculando o antecessor
        antecessor = numero -1;

        //mostrando o sucessor
        JOptionPane.showMessageDialog(null, "Sucessor: " + sucessor);
        
        //mostrando o antecessor
        JOptionPane.showMessageDialog(null, "Antecessor: " + antecessor);
    }
}
