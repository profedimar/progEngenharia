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
public class Exercicio07 {

    /*
    Entrar com o nome, sexo e idade de uma pessoa. 
    Se a pessoa for do sexo feminino e tiver mais que 18 anos, 
    imprimir o nome e a mensagem: ACEITA. 
    Caso contrário, imprimir nome e a mensagem: NÃO ACEITA. 
    Considerar tanto F quando f para o sexo.
     */

    public static void main(String[] args) {
        //declarando
        String nome, sexo;
        int idade;
        
        //lendo
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        sexo = JOptionPane.showInputDialog("Digite o sexo: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        
        //avaliando
        if ((sexo.equals("F") || sexo.equals("F")) && idade > 18){
            JOptionPane.showMessageDialog(null, "ACEITA!");
        }else{
            JOptionPane.showMessageDialog(null, "NÃO ACEITA!");
        }
    }
}
