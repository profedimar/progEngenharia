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
public class Exercicio04 {

    /*
    Faça um algoritmo que copie o conteúdo de um vetor de tamanho 10 em um segundo vetor de
tamanho 10, mas ao contrário. Leia o conteúdo do 1º vetor e mostre o conteúdo do 2º vetor

     */
    public static void main(String[] args) {
        //declarando variáveis e vetores
        final int TAMANHO = 10;
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];
        int i;

        //lendo o primeiro vetor
        for (i = 0; i < TAMANHO; i++) {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota: "));
        }

        //copiando para o segundo vetor ao contrário
        for (i = 0; i < TAMANHO; i++) {
            vetor2[i] = vetor1[TAMANHO-1-i];
        }
        
        //mostrando o segundo vetor
        for (i = 0; i < TAMANHO; i++) {
            System.out.println(""+vetor2[i]);
        }
    }
}
