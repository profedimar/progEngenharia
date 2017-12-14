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
public class Exer02 {
    /*
    Faça uma classe que tenha um método que recebe um número inteiro por parâmetro e 
retorna “Positivo” se o número é positivo, “Negativo” se o número é negativo e “Nulo” se
o número for nulo. No método main, leia três números e mostre se eles são positivos,
negativos ou nulos. Utilize o método criado para obter tal informação.
     */
    
    String positivoNegativoNulo(int nr){
        if (nr > 0){
            return "Positivo";
        }else{
            if (nr < 0){
                return "Negativo";
            }else{
                return "Nulo";
            }
        }
    }
    
    public static void main(String[] args) {
        Exer02 ex = new Exer02();//instanciando a classe para utilizar o método positivoNegativoNulo
        int nr; //declarando a variável
        //lendo o primeiro número
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        //mostrando se o primeiro número é positivo, negativo ou nulo
        JOptionPane.showMessageDialog(null, ex.positivoNegativoNulo(nr));
        //lendo o segundo número
        nr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        //mostrando se o segundo número é positivo, negativo ou nulo
        JOptionPane.showMessageDialog(null, ex.positivoNegativoNulo(nr));
    }
}
