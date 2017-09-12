/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.tarefa32;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio06 {

    /*
    Ler o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. 
    Não se esqueça de verificar se o ano de nascimento é um ano válido
     */

    public static void main(String[] args) {
        //declarando
        int anoNasc, anoAtual, diff;

        //lendo
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        
        if (anoNasc > anoAtual || anoNasc < 0 || anoAtual < 0){
            JOptionPane.showMessageDialog(null, "Ano inválido!");
        }
        
        diff = anoAtual - anoNasc;
        JOptionPane.showMessageDialog(null, "Idade: "+diff);
        
    }
}
