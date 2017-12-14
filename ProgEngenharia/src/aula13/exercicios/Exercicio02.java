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
public class Exercicio02 {
    /*
    Faça um programa que declara uma matriz de inteiros notas (5 X 2). 
    As linhas representam os alunos. As colunas representam as notas das provas 1 e 2, respectivamente.
    Leia as notas dos 5 alunos nas 2 provas. Mostre na tela a nota do terceiro aluno na segunda prova. 
    Mostre na tela a nota do quinto aluno na primeira prova.
     */
    public static void main(String[] args) {
        // declaração das variáveis
        final int NR_ALUNOS=5;
        final int NR_PROVAS=2;
        int[][] notas = new int[NR_ALUNOS][NR_PROVAS];
        int L, C;
        
        //lendo as notas
         for(L=0; L<NR_ALUNOS; L++){
            for(C=0; C<NR_PROVAS; C++){
                notas[L][C] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a nota do aluno "+L+" na prova "+C));
            }
        }
         
         System.out.println("Nota do terceiro aluno na segunda prova: "+notas[2][1]);
         System.out.println("Nota do quinto aluno na primeira prova: "+notas[4][0]);
        
    }
}
