/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exemplo01 {

    void dadosDoAutor(String nome) {  //definição da função "dadosDoAutor"
        System.out.println("Autor: "+nome);
    }

    public static void main(String[] args) {
        Exemplo01 ex = new Exemplo01(); //instanciando a classe "Exemplo01"

        ex.dadosDoAutor("Ciclano"); //chamada da função definida antes

        ex.dadosDoAutor("Beltrano");  //chamada da função definida antes
                
        
        ex.dadosDoAutor("Fulano");  //chamada da função definida antes
    }

}
