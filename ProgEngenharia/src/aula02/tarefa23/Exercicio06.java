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
public class Exercicio06 {

    /*
    Entrar com um número e imprimir: número, quadrado e raiz quadrada
     */
    public static void main(String[] args) {
        //declarando as variáveis
        double numero,potencia,raiz;
        
        //lendo
        numero=Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        
        //calculando
        potencia=Math.pow(numero,2);
        raiz=Math.sqrt(numero);
        
        //mostrando
        JOptionPane.showMessageDialog(null,"O número é "+numero);
        JOptionPane.showMessageDialog(null,"O quadrado desse número é "+potencia);
        JOptionPane.showMessageDialog(null,"A raíz quadrada desse número é "+raiz);
    }

}
