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
public class Exer07 {

    /*
    Faça uma Classe que leia a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa. Depois faça um método chamado pesoideal que receba a
altura e o sexo via parâmetro e que calcule e retorne seu peso ideal, utilizando as
seguintes fórmulas:
a. para homens : (72.7 * h) – 58
b. para mulheres : (62.1 * h) – 44.7
c. Observação: Altura = h (na fórmula acima).
     */

    double pesoIdeal(double altura, int sexo) {
        if (sexo == 2) {
            return (72.7 * altura) - 58;
        } else {
            return (62.1 * altura) - 44.7;
        }
    }
    
    public static void main(String[] args) {
        Exer07 ex = new Exer07();//instanciando a classe para utilizar os métodos criados
        int sexo;//declarando a variável
        double altura;//declarando a variável
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros):"));
        sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n (1) para feminino \n (2) para masculino"));
        JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+ex.pesoIdeal(altura, sexo));
    }
}
