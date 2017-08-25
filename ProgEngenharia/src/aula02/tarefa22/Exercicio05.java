/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa22;

import javax.swing.JOptionPane;

/**
 *
 * @author labin
 */
public class Exercicio05 {
    /*
    Ler um número real e imprimir (mostrar na tela) a terça parte deste número
    */
    public static void main(String[] args) {
        //declarando as variáveis
        double numero;
        
        //lendo
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        //calculando a terça parte e armazenando na própria variável
        numero = numero / 3;
        
        //mostrando
        JOptionPane.showMessageDialog(null, "A terça parte é: "+numero);
    }
}
