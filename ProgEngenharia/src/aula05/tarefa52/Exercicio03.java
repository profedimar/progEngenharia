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
public class Exercicio03 {

    /*
   Crie um programa que leia dois números inteiros e mostre os números inteiros entre eles.
    Por exemplo, os números inteiros entre 5 e 10 são 6, 7, 8, 9. 
     */
    public static void main(String[] args) {
        //declarando
        int i, x, y;

        //lendo x e y
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y:"));

        //repetindo
        for (i = x+1; i < y; i++) {
            System.out.println(""+i);
        }

    }
}
