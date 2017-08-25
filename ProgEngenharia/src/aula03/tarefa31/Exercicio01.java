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
public class Exercicio01 {
    /*
    Ler um número e imprimir se ele é par ou ímpar
    */
    public static void main(String[] args) {
      //definindo as variáveis
        int numero;
        
        //lendo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        //verificando se é par ou ímpar
        if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número digitado é par!");
        }else{
            JOptionPane.showMessageDialog(null, "O número digitado é ímpar!");
        }
    }
}
