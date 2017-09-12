/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.tarefa52;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio10 {

    /*
    Crie um programa que leia n números reais.
    Você não sabe o valor de n, mas deve parar a leitura quando o usuário
    informar um número negativo ou nulo. 
    Após, deve mostrar a soma dos números positivos informados.
     */
    public static void main(String[] args) {
        //declarando
        double n, soma;

        //inicializando acumulador
        soma = 0;

        //repetindo
        do {
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
            if (n > 0) {
                soma = soma + n;
            }
        } while (n > 0);

        JOptionPane.showMessageDialog(null, "Soma: "+soma);
    }
}
