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
public class Exercicio09 {
    /*
    Crie um programa que leia seis números inteiros x_inicial, x_final, y_inicial, y_final,
    z_inicial e z_final. Mostre na tela o texto "Avance x" n vezes, 
    onde n = x_final - x_inicial. 
    Mostre na tela o texto "Avance y" m vezes, onde m = y_final - y_inicial. 
    Mostre na tela o texto "Avance z" p vezes, onde p = z_final - z_inicial. 
    Aceite apenas valores válidos.
    Valores válidos para todos os eixos:  0 <= inicial <= 100 e inicial < final <= 200.
    */
    
    public static void main(String[] args) {
        //declarando
        int x_inicial, x_final, y_inicial, y_final, z_inicial, z_final, diff, i;
        
        /********************** 
         ******** X *********** 
         **********************/
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
        
        /********************** 
         ******** Y *********** 
         **********************/
        //lendo e verificando y_inicial
        do{
            y_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do y_inicial:"));
            
            if (y_inicial < 0 || y_inicial > 100){
                JOptionPane.showMessageDialog(null, "Valor de y_inicial inválido!");
            }
        }while(y_inicial < 0 || y_inicial > 100);
        
        //lendo e verificando y_final
        do{
            y_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do y_final:"));
            
            if (y_final <= y_inicial || y_final > 200){
                JOptionPane.showMessageDialog(null, "Valor de y_final inválido!");
            }
        }while(y_final <= y_inicial || y_final > 200);
        
        //calculando
        diff = y_final - y_inicial;
        
        //repetindo
        for(i=0; i<diff; i++){
            System.out.println("Avance y");
        }
        
        /********************** 
         ******** Z *********** 
         **********************/
        //lendo e verificando z_inicial
        do{
            z_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do z_inicial:"));
            
            if (z_inicial < 0 || z_inicial > 100){
                JOptionPane.showMessageDialog(null, "Valor de z_inicial inválido!");
            }
        }while(z_inicial < 0 || z_inicial > 100);
        
        //lendo e verificando z_final
        do{
            z_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do z_final:"));
            
            if (z_final <= z_inicial || z_final > 200){
                JOptionPane.showMessageDialog(null, "Valor de z_final inválido!");
            }
        }while(z_final <= z_inicial || z_final > 200);
        
        //calculando
        diff = z_final - z_inicial;
        
        //repetindo
        for(i=0; i<diff; i++){
            System.out.println("Avance z");
        }
    }
}
