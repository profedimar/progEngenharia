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
public class Exercicio06 {
    /*
    Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e mesmo tipo em um terceiro vetor com dobro
do tamanho.
     */
    
    public static void main(String[] args) {
        //declarando
        int[] v1 = {4, 5, 6, 7, 7, 8, 9, 5};
        int[] v2 =  {5, 6, 7, 8, 6, 7, 8, 4};
        int[] v3 = new int[16];
        int i;
        
        /* fazendo a união de v1 e v2 em v3*/
        for(i=0; i<8; i++){
            v3[i] = v1[i];
            v3[i+8] = v2[i];
        }
        
        // mostrando v3
        for(i=0; i<16; i++){
            System.out.println(""+v3[i]);
        }
        
        
    }
}
