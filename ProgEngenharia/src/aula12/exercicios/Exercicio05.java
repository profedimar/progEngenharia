/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.exercicios;

/**
 *
 * @author Administrador
 */
public class Exercicio05 {
    /*
    Faça um algoritmo que some o conteúdo de dois vetores de tamanho 8 e armazene o resultado em um terceiro vetor.
Atribua os valores para os dois primeiros vetores. Mostre os valores do terceiro vetor

     */
    
    public static void main(String[] args) {
        //Declarando as variáveis
        final int TAMANHO = 8;
        int[] vetor1 = new int[TAMANHO];
        int[] vetor2 = new int[TAMANHO];
        int[] vetor3 = new int[TAMANHO];
        int i;
        
        //Atribuindo valores para os dois primeiros vetores
        for(i=0; i<TAMANHO; i++){
            vetor1[i] = i;
            vetor2[i] = TAMANHO - i;
        }
        
        //Armazenando valores no terceiro vetor
        for(i=0; i<TAMANHO; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        
        //mostrando o terceiro vetor
        for (i = 0; i < TAMANHO; i++) {
            System.out.println(""+vetor3[i]);
        }
    }
}
