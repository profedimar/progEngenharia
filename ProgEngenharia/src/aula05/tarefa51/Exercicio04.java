/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.tarefa51;

/**
 *
 * @author edimar
 */
public class Exercicio04 {
    /*
     Imprimir os números múltiplos de 5, no intervalo de 1 até 500
    */
    public static void main(String[] args) {
        //declarando
        int i=0;
        
        //repetindo
        for(i=1; i<=500; i++){
            //testando se é múltiplo de 5
            if (i%5 == 0){
                //mostrando
                System.out.println(""+i);
            }
        }
        
    }
}
