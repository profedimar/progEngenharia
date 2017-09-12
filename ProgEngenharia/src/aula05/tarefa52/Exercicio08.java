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
public class Exercicio08 {

    /*
    Crie um programa que leia dois números inteiros x_inicial e x_final. Mostre na tela o texto "Avance x" n vezes, onde n = x_final - x_inicial. No entanto, faça o programa repetir a leitura se o usuário informar um x_inicial ou um x_final inválido.
    Valores válidos: 0 <= x_inicial <= 100 e x_inicial < x_final <= 200.
     */
    public static void main(String[] args) {
        //declarando
        int x_inicial, x_final, diff, i;
        
        //lendo e verificando x_inicial
        do{
            x_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do x_inicial:"));
            
            if (x_inicial < 0 || x_inicial > 100){
                JOptionPane.showMessageDialog(null, "Valor de x_inicial inválido!");
            }
        }while(x_inicial < 0 || x_inicial > 100);
        
        //lendo e verificando x_final
        do{
            x_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do x_final:"));
            
            if (x_final <= x_inicial || x_final > 200){
                JOptionPane.showMessageDialog(null, "Valor de x_final inválido!");
            }
        }while(x_final <= x_inicial || x_final > 200);
        
        //calculando
        diff = x_final - x_inicial;
        
        //repetindo
        for(i=0; i<diff; i++){
            System.out.println("Avance x");
        }
        
    }
}
