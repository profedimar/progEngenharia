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
public class Exercicio05 {
    /*
     Ler cinco números e imprimir a soma
    */
    public static void main(String[] args) {
        //declarando
        int i, nr, soma;
        
        //inicializando acumulador
        soma = 0;
        
        //repetindo
        for(i=0; i<5; i++){
            //lendo
            nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            //acumulando
            soma = soma + nr;
        }
        
        //mostrando
        JOptionPane.showMessageDialog(null, "Soma: "+soma);
    }
}
