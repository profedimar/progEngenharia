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
public class Exercicio01 {
    /*
    A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários
    estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
    Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e
    informar se o empréstimo pode ou não ser concedido
    */
    public static void main(String[] args) {
        //declarando
        double salario, prestacao, percentual;
        
        //lendo
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto: "));
        prestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));
        
        //calculando
        percentual = 100 * prestacao / salario;
        if (percentual <= 30){
            JOptionPane.showMessageDialog(null, "Empréstimo aprovado!");
        }else{
            JOptionPane.showMessageDialog(null, "Empréstimo negado!");
        }
    }
}
