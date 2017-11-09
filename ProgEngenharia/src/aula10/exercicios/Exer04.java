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
public class Exer04 {

    /*
    Faça uma classe que tenha um método que recebe três números reais por parâmetro e
retorna o maior valor. No método main, leia três números e mostre o maior valor. Utilize o
método criado para obter tal informação.
     */
    double maior(double n1, double n2, double n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void main(String[] args) {
        Exer04 ex = new Exer04();//instanciando a classe para utilizar o método criado
        double a, b, c;//declarando a variável
        //lendo o primeiro número
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        //lendo o segundo número
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
        //lendo o terceiro número
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
        //mostrando o maior
        JOptionPane.showMessageDialog(null, "O maior é: "+ex.maior(a, b, c));
    }

}
