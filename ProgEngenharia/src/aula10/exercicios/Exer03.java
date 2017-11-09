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
public class Exer03 {
    /*
    Faça uma classe que tenha um método que recebe dois números reais por parâmetro e
retorna o maior valor. No método main, leia dois números e mostre o maior valor. Utilize
o método criado para obter tal informação.
     */
    
    double maior(double n1, double n2){
        if (n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }
    
    public static void main(String[] args) {
        Exer03 ex = new Exer03();//instanciando a classe para utilizar o método criado
        double a, b;//declarando a variável
        //lendo o primeiro número
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        //lendo o segundo número
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
        //mostrando o maior
        JOptionPane.showMessageDialog(null, ex.maior(a, b));
    }
}
