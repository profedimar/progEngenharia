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
public class Exercicio03 {
    /*
    Ler a idade de uma pessoa e informar se a idade é válida ou não.
    Considere inválidas idades negativas e idades maiores que 120
    */
    public static void main(String[] args) {
        //declarando
        int idade;
        
        //lendo
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        
        if (idade >= 0 && idade <= 120){
            JOptionPane.showMessageDialog(null, "Idade válida!");
        }else{
            JOptionPane.showMessageDialog(null, "Idade inválida!");
        }
            
    }
}
