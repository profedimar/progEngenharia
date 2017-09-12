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
public class Exercicio10 {
    /*
    Entrar com o nome de uma pessoa e informar se José faz parte do nome.
    */
    public static void main(String[] args) {
        //declarando
        String nome;
        
        //lendo
        nome = JOptionPane.showInputDialog("Digite o nome:");
        
        if (nome.toLowerCase().contains("josé")){
            JOptionPane.showMessageDialog(null, "Parte do nome é josé");
        }else{
            JOptionPane.showMessageDialog(null, "Não tem josé no nome");
        }
    }
}
