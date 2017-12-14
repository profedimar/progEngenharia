/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio01 {

    /*
    Faça um programa que declara duas matrizes de inteiros m1 (2 X 3) e m2 (3 X 2). 
    Leia os valores para m1. Atribua para m2 os valores da transposta de m1. 
    Mostre os valores de m2
     */
    public static void main(String[] args) {
        //Declarando as variáveis e matrizes
        int[][] m1 = new int[2][3];
        int[][] m2 = new int[3][2];
        int L, C;
        
        // lendo m1
        for(L=0; L<2; L++){
            for(C=0; C<3; C++){
                m1[L][C] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de matriz["+L+"]["+C+"]:"));
            }
        }
        
        //atribuindo para a m2 a transporta de m1
        for(L=0; L<3; L++){
            for(C=0; C<2; C++){
                m2[L][C] = m1[C][L];
            }
        }
        
        //mostrando m2
        for (L = 0; L < 3; L++) {
            for (C = 0; C < 2; C++) {
                System.out.print("" + m2[L][C] + "\t");
            }
            System.out.print("\n");
        }
    }
}
