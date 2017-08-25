/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.tarefa31;

import javax.swing.JOptionPane;

/**
 *
 * @author labin
 */
public class Exercicio05 {
    /*
    Ler um número inteiro e informar se ele é maior, menor ou igual a 20
    */
    public static void main(String[] args) {
        //declarando as variáveis
        int numero;
        
        //lendo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        //verificando se ele é maior, menor ou igual a 20
        if (numero > 20){
             JOptionPane.showMessageDialog(null, "Maior que 20!");
        }else{
            if (numero < 20){
               JOptionPane.showMessageDialog(null, "Menor que 20!"); 
            }else{
               JOptionPane.showMessageDialog(null, "Igual a 20!");  
            }
        }
    }
}
