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
public class Exercicio02 {
    /*
    Crie um algoritmo que lê um número inteiro x e 
    mostra na tela o texto "Fresar a peça de acordo com o projeto CAD nr 5" x vezes.
    Por exemplo, se o usuário informar o número 10, então o texto acima deve ser impresso 10 vezes.
     */
    public static void main(String[] args) {
        //declarando
        int i, x;
        
        //lendo x
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de peças a serem fresadas:"));
        
        //repetindo
        for(i=0; i<x; i++){
            System.out.println("Fresar a peça de acordo com o projeto CAD nr 5");
        }
                
    }
}
