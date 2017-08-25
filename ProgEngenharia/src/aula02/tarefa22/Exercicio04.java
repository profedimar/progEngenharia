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
public class Exercicio04 {
    /*
    Ler dois números inteiros e mostrar o produto
    */
    public static void main(String[] args) {
        //declarando as variáveis
        int nr1, nr2, produto;
        
        //lendo
        //lendo
        nr1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        nr2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        
        //calculando o produto
        produto = nr1 * nr2;
        
        //mostrando
        JOptionPane.showMessageDialog(null, "O produto é: "+produto);
    }
}
