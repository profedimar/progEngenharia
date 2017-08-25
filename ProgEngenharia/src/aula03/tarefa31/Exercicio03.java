/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.tarefa31;

import javax.swing.JOptionPane;

/**
 *
 * @author labin
 */
public class Exercicio03 {
    /*
     Criar um algoritmo que permita ao aluno responder qual a capital do Brasil.
     As seguintes possibilidades devem ser aceitas como resposta correta: 
     BRASÍLIA, Brasília, brasília e Brazília e brazília
     */

    public static void main(String[] args) {
        //declarando as variáveis
        String capital;

        //lendo
        capital = JOptionPane.showInputDialog("Qual a capital do Brasil?");

        //verificando se a resposta está correta
        if (capital.equals("BRASÍLIA") || capital.equals("Brasília")) {
            JOptionPane.showMessageDialog(null, "Resposta correta!");
        } else {
            if (capital.equals("brasília") || capital.equals("Brazília") || capital.equals("brazília")) {
                JOptionPane.showMessageDialog(null, "Resposta correta, mas fique atento a grafia!");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!");
            }
        }
    }
}
