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
public class Exercicio07 {

    /*
    Faça um algoritmo que lê um vetor de tamanho 5 e tipo inteiro, ordena o vetor e mostra o vetor ordenado
     */
    public static void main(String[] args) {
        //declarando
        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        int i, j, aux;

        //lendo o  vetor
        for (i = 0; i < TAMANHO; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        }

        //ordenando
        for (i = TAMANHO; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }

        //mostrando o vetor
        for (i = 0; i < TAMANHO; i++) {
            System.out.println("" + vetor[i]);
        }
    }
}
