/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.tarefa51;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio06 {
    /*
    Ler 10 números e imprimir a média
    */
    public static void main(String[] args) {
        //declarando
        int i, nr, soma;
        
        //inicializando acumulador
        soma = 0;
        
        //repetindo
        for(i=0; i<10; i++){
            //lendo
            nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            //acumulando
            soma = soma + nr;
        }
        
        //mostrando
        JOptionPane.showMessageDialog(null, "Média inteira: "+soma/i); //int/int = int
        JOptionPane.showMessageDialog(null, "Média real: "+ (double)soma/i); //double/int=double
    }
}
