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
public class Exercicio02 {
    /*
    Ler um número inteiro com três dígitos e
    informar se o algoritmo da casa das centenas é par ou ímpar
    */
    public static void main(String[] args) {
        //declarando
        int nr, centena;
        
        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        centena = nr/100; //  int/int = int
        
        if (centena % 2 == 0){
            JOptionPane.showMessageDialog(null, "Centena par!");
        }else{
            JOptionPane.showMessageDialog(null, "Centena ímpar!");
        }
        
    }
}
