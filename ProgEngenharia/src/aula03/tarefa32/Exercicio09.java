/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.tarefa32;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio09 {
    /*
    Entrar com o nome de uma pessoa e imprimir se o primeiro caractere é a letra A 
    (considerar letra minúscula ou maiúscula)
    */
    public static void main(String[] args) {
        //declarando a variável
        String nome;
        
        //lendo
        nome = JOptionPane.showInputDialog("Digite o nome:");
        
        if (nome.startsWith("A") || nome.startsWith("a")){
            JOptionPane.showMessageDialog(null, "Começa com a letra A");
        }else{
            JOptionPane.showMessageDialog(null, "Não começa com a letra A");
        }
    }
}
