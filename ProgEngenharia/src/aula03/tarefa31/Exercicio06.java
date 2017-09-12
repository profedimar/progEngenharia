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
public class Exercicio06 {

    /*
    Ler um número inteiro e imprimir a raiz quadrada do número caso ele seja positivo e
    o quadrado do número caso ele seja negativo
     */
    public static void main(String[] args) {
        //declarando as variáveis
        int nr;

        //lendo
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (nr > 0) {
            JOptionPane.showMessageDialog(null, "Raiz: " + Math.sqrt(nr));
        } else if (nr < 0) {
            JOptionPane.showMessageDialog(null, "Quadrado: " + Math.pow(nr, 2));
        }
    }
}
