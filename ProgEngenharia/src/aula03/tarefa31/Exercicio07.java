/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.tarefa31;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio07 {
    /*
    Ler um número inteiro e informar se ele é múltiplo de 3 ou não
    */
    public static void main(String[] args) {
        //declarando
        int nr;
        
        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if (nr % 3 == 0){
            JOptionPane.showMessageDialog(null, "É múltiplo de 3!");
        }else{
            JOptionPane.showMessageDialog(null, "Não é múltiplo de 3!");
        }
    }
}
