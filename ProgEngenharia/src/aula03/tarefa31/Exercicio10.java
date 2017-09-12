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
public class Exercicio10 {
    /*
    Entrar com um número inteiro e informar se ele é divisível por 10, por 5, por 2 
    ou se não é divisível por nenhum desses
    */
    public static void main(String[] args) {
        //declarando
        int nr;
        
        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if (nr % 10 == 0){ //se é divisível por 10, tb é por 5 e 2
            JOptionPane.showMessageDialog(null, "É divisível por 10, 5 e 7!");
        }else{
            if (nr % 5 == 0){
                JOptionPane.showMessageDialog(null, "É divisível por 5!");
            }else{
                if (nr % 2 == 0){
                    JOptionPane.showMessageDialog(null, "É divisível por 2!");    
                }else{
                    JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 nem 2!");    
                }
            }
        }
    }
}
