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
public class Exercicio09 {
    /*
    Entrar com um número inteiro e informar se ele é divisível por 3 e por 7
    */
    public static void main(String[] args) {
        //declarando
        int nr;
        
        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if ((nr % 3 == 0) && (nr % 7 == 0)){
            JOptionPane.showMessageDialog(null, "É divisível por 3 e 7!");
        }else{
            if (nr % 3 == 0){
                JOptionPane.showMessageDialog(null, "É divisível por 3!");
            }else{
                if (nr % 7 == 0){
                   JOptionPane.showMessageDialog(null, "É divisível por 7!");    
                }else{
                    JOptionPane.showMessageDialog(null, "Não é divisível por 3 nem por 7!");        
                }
            }
            
        }
    }
}
