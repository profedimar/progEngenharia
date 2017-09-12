/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.tarefa52;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio07 {

    /*
    Crie um programa que leia dois números inteiros x_inicial e x_final. Mostre na tela o texto "Avance x" n vezes, onde n = x_final - x_inicial.
     */
    public static void main(String[] args) {
        //declarando
        int x_inicial, x_final, diff, i;
        
        //lendo
        x_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do x_inicial:"));
        x_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do x_final:"));
        
        //calculando
        diff = x_final - x_inicial;
        
        //repetindo
        for(i=0; i<diff; i++){
            System.out.println("Avance x");
        }
        
    }
}
