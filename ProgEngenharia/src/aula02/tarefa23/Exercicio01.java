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
public class Exercicio01 {

    /*
    
    Entrar (ler) com dois números inteiros e imprimir (mostrar na tela) a seguinte saída:
    dividendo, divisor, quociente e resto
     */
    public static void main(String[] args) {
        //declarando as variáveis
        int dividendo, divisor, quociente, resto;
        
        
        //lendo
        dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));
        
        //calculando
        quociente = dividendo/divisor;
        resto = dividendo % divisor;
        
        //mostrando
        JOptionPane.showMessageDialog(null, "Dividendo: "+dividendo+" \nDivisor: "+divisor+"\nQuociente: "+quociente+"\nResto: "+resto);
        
    }
}
