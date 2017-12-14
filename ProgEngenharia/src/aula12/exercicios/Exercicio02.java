/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio02 {

    /*
    Crie um programa que leia 5 notas de alunos, as armazene em um vetor e mostre a menor nota
     */

    public static void main(String[] args) {
        //declarando variáveis e vetores
        final int TAMANHO = 5;
        double[] notas = new double[TAMANHO];
        double menorNota;
        int i;

        //lendo as notas
        for (i = 0; i < TAMANHO; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
        }

        //achando a maior nota
        menorNota = notas[0]; //inicializando menorNota
        for (i = 1; i < TAMANHO; i++) {
            if (menorNota > notas[i]) {
                menorNota = notas[i];
            }
        }
        JOptionPane.showMessageDialog(null, "A maior nota é: " + menorNota);
    }
}
