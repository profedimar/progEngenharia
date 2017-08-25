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
public class Exercicio02 {
    /*
    Ler um número e imprimir se ele é positivo, negativo ou nulo
    */
    public static void main(String[] args) {
        //declarando as variáveis
        int numero;
        
        //lendo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        //verificando se ele é positivo, negativo ou nulo
        if (numero > 0){
            JOptionPane.showMessageDialog(null, "O número digitado é positivo!");
        }else{
            if (numero < 0){
                JOptionPane.showMessageDialog(null, "O número digitado é negativo!");
            }else{
                JOptionPane.showMessageDialog(null, "O número digitado é nulo!");
            }
        }
    }
}
