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
public class Exercicio02 {

    /*
     Imprimir todos os números pares no intervalo 1-1000
     */
    public static void main(String[] args) {
        //declarando
        int i;

        //repetindo
        for (i = 1; i <= 1000; i++) {
            //testando se é par
            if (i % 2 == 0) {
                //mostrando
                System.out.println("" + i);
            }
        }
    }
}
