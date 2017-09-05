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
public class Exercicio09 {

    /*
    Entrar com um nome e imprimir: todo o nome, o primeiro caractere, 
    o último caractere, do primeiro ao terceiro caractere, o quarto caractere,
    todos os caracteres menos o último, os dois últimos caracteres
     */
    public static void main(String[] args) {
        //declarando
        String nome;
        
        //lendo
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        
        //mostrando
        JOptionPane.showMessageDialog(null, "Nome: "+nome);
        JOptionPane.showMessageDialog(null, "Primeiro caractere: "+nome.substring(0, 1));
        JOptionPane.showMessageDialog(null, "Último caractere: "+nome.substring(nome.length()-1));
        JOptionPane.showMessageDialog(null, "Do primeiro ao terceiro caractere: "+nome.substring(0, 3));
        JOptionPane.showMessageDialog(null, "Quarto caractere: "+nome.substring(3, 4));
        JOptionPane.showMessageDialog(null, "Todos menos o último: "+nome.substring(0, nome.length()-1));
        JOptionPane.showMessageDialog(null, "Os dois últimos caracteres: "+nome.substring(nome.length()-2));
        
        
    }
}
