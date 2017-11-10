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
public class Exer05 {
    /*
    Faça uma classe chamada Circulo que contenha os seguintes dois métodos:
a. obtemArea: recebe como parâmetro o raio de um circulo e retorna a área
i. Área = π * r2
b. obtemPerimetro: recebe o raio de um círculo e retorna o perímetro
i. P = π * 2 * r
c. main: leia o raio de dois círculos e mostre suas áreas e perímetros. Utilize os
métodos criados para obter essas informações
    */
    
    double obtemArea(double raio){
        return Math.PI * raio * raio;
    }
    
    double obtemPerimetro(double raio){
        return Math.PI * 2 * raio;
    }
    
    public static void main(String[] args) {
        Exer05 ex = new Exer05();//instanciando a classe para utilizar os métodos criados
        double raio; //declarando a variável
        
        //lendo o primeiro número
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio"));
        
        JOptionPane.showMessageDialog(null, "Área: "+ex.obtemArea(raio));
        JOptionPane.showMessageDialog(null, "Perímetro: "+ex.obtemPerimetro(raio));
    }
}
