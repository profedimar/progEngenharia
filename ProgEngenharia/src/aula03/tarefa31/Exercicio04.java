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
public class Exercicio04 {
    /*
     Ler a altura e o peso de uma pessoa, calcular seu IMC (Índice de Massa Corporal) e informar o grau de obesidade do indivíduo conforme a Tabela apresentada no seguinte link https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal
     */

    public static void main(String[] args) {
        //declarando as variáveis
        double altura, peso, imc;

        //lendo
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em Kg: "));

        //calculando o IMC
        imc = peso / (altura * altura);

        //verificando o grau de obesidade
        if (imc < 25) {
            if (imc < 17) {
                if (imc < 16) {
                    JOptionPane.showMessageDialog(null, "Magreza grave!");
                } else {
                    JOptionPane.showMessageDialog(null, "Magreza moderada!");
                }
            } else {
                if (imc < 18.5) {
                    JOptionPane.showMessageDialog(null, "Magreza leve!");
                } else {
                    JOptionPane.showMessageDialog(null, "Saudável!");
                }
            }
        } else {
            if (imc < 35) {
                if (imc < 30) {
                    JOptionPane.showMessageDialog(null, "Sobrepeso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Obesidade Grau I!");
                }
            } else {
                if (imc < 40) {
                    JOptionPane.showMessageDialog(null, "Obesidade Grau II (severa)!");
                } else {
                    JOptionPane.showMessageDialog(null, "Obesidade Grau III (mórbida)!");
                }
            }
        }
    }
}
