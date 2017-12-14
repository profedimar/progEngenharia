/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exer01 {
    /*Faça uma classe que tenha um método que recebe um número inteiro por parâmetro e
retorna a String “Par” se ele for par e a String “Ímpar” se for ímpar. No método main, leia
dois números e mostre se eles são pares ou ímpares. Utilize o método criado para obter
tal informação.*/
    
    String parOuImpar(int nr){
        if (nr % 2 == 0){
            return "Par";
        }else{
            return "Ímpar";
        }
    }
    
    public static void main(String[] args) {
        Exer01 ex = new Exer01(); //instanciando a classe para utilizar o método parOuImpar
        int nr1, nr2; //declarando variáveis
        
        //lendo o primeiro número
        nr1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        //mostrando se o primeiro número é par ou impar
        JOptionPane.showMessageDialog(null, ex.parOuImpar(nr1));
        
        //lendo o segundo número
        nr2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        //mostrando se o segundo número é par ou impar
        JOptionPane.showMessageDialog(null, ex.parOuImpar(nr2));
    }
}
