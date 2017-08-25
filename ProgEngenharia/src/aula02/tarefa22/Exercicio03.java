/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa22;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exercicio03 {

    /**
     * Ler o nome, endereço e telefone de uma pessoa e mostrar na tela
     */
    public static void main(String[] args) {
        String nome, endereco, telefone;

        //lendo
        nome = JOptionPane.showInputDialog("Digite o nome:");

        endereco = JOptionPane.showInputDialog("Digite o endereco:");

        telefone = JOptionPane.showInputDialog("Digite o telefone:");

        //mostrando
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Endereço: " + endereco + "\nTelefone: " + telefone);
    }
}
