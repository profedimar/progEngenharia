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
public class Exercicio08 {

    /*
     Ler vários números até que usuário informar o valor -1. 
    Mostrar a soma dos valores informados antes do -1
     */
    public static void main(String[] args) {
        //declarando
        int nr, soma;

        //inicializando acumulador
        soma = 0;

        //repetindo
        do {
            //lendo
            nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (nr!= -1){
                soma = soma + nr; //acumulando
            }
        } while (nr != -1);
        
        //mostrando
        JOptionPane.showMessageDialog(null, "Soma: "+soma);
    }
}
