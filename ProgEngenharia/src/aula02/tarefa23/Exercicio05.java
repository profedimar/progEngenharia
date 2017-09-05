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
public class Exercicio05 {

    /*
    Entrar com o número e a base em que deseja-se calcular o logaritmo desse número e imprimi-lo
     */
    public static void main(String[] args) {
        //declarando as variáveis
        double logaritmando, base, logaritmo1, logaritmo2, logaritmo;
        
        //lendo
        logaritmando = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o logaritmando"));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para a base do logarítmo"));
        
        //calculando
        logaritmo = Math.log10(logaritmando) / Math.log10(base);
        
        //Mostrando
        JOptionPane.showMessageDialog(null, "O resultado é:" + logaritmo);

    }
}
