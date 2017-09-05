/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa23;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio10 {

    /*
    Entrar com a base e a altura de um retângulo e imprimir a seguinte saída: perímetro, área e diagonal
     */
    public static void main(String[] args) {
        //declarando
        int base, altura;

        //lendo
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a base do retângulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a altura do retângulo"));

        //calculando e mostrando 
        JOptionPane.showMessageDialog(null, "Perímetro: " + (base * 2 + altura * 2));
        JOptionPane.showMessageDialog(null, "Área: " + base * altura);
        JOptionPane.showMessageDialog(null, "Diagonal: " + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));

    }
}
