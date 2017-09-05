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
public class Exercicio04 {

    /**
     * Entrar com um número e imprimir o logaritmo desse número na base 10
     */
    public static void main(String[] args) {
        //declarando as variáveis
        double numero, logaritmo;

        //lendo
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        //calculando
        logaritmo = Math.log10(numero);
        
        //mostrando
        JOptionPane.showMessageDialog(null, "O logarítmo na base dez do número é:" + logaritmo);
    }
}
