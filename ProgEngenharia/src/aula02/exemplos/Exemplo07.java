/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 *
 * Objetivo: ler dois números inteiros e mostrar a soma deles
 */
public class Exemplo07 {

    public static void main(String[] args) {
        //declarando as variáveis
        int parcela01, parcela02, soma;

        //lendo o valor da primeira parcela
        parcela01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira parcela:"));

        //lendo o valor da segunda parcela
        parcela02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segunda parcela:"));

        //somando os valores lidos e atribuindo para a variável soma
        soma = parcela01 + parcela02;

        //mostrando o valor da soma
        JOptionPane.showMessageDialog(null, "Soma: " + soma);
    }
}
