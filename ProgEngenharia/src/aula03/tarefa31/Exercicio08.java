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
public class Exercicio08 {
    /*
    Entrar com um número inteiro e informar se ele é ou não divisível por 5
    */
    public static void main(String[] args) {
        //declarando
        int nr;
        
        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if (nr % 5 == 0){
            JOptionPane.showMessageDialog(null, "É divisível por 5!");
        }else{
            JOptionPane.showMessageDialog(null, "Não é divisível por 5!");
        }
    }
}
