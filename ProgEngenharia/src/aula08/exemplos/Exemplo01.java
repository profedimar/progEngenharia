/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exemplo01 {

    void dadosDoAutor() {  //definição da função "dadosDoAutor"
        System.out.println("Autor: Edimar Manica");
    }

    public static void main(String[] args) {
        Exemplo01 ex = new Exemplo01(); //instanciando a classe "Exemplo01"

        ex.dadosDoAutor(); //chamada da função definida antes

        ex.dadosDoAutor();  //chamada da função definida antes
        
        ex.dadosDoAutor();  //chamada da função definida antes
    }

}
