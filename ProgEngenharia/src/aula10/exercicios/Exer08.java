/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Exer08 {

    void adicao() {
        double parcela01, parcela02, soma; //declarando as variáveis

        parcela01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira parcela:"));
        parcela02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda parcela:"));
        soma = parcela01 + parcela02;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
    }

    void subtracao() {
        JOptionPane.showMessageDialog(null, "Falta fazer. Não vai querer tudo mastigado também, neh!");
    }

    void multiplicacao() {
        JOptionPane.showMessageDialog(null, "Falta fazer. Não vai querer tudo mastigado também, neh!");
    }

    void divisao() {
        JOptionPane.showMessageDialog(null, "Falta fazer. Não vai querer tudo mastigado também, neh!");
    }

    int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Calculadora. Opções possíveis: \n 1. Adição\n 2.Subtração\n 3. Multiplicação\n 4. Divisão\n 5. Sair\n Entre com a sua opção:"));
    }

    public static void main(String[] args) {
        Exer08 ex = new Exer08();
        int opcao;

        do {
            opcao = ex.menu();
            switch (opcao) {
                case 1:
                    ex.adicao();
                    break;
                case 2:
                    ex.subtracao();
                    break;
                case 3:
                    ex.multiplicacao();
                    break;
                case 4:
                    ex.divisao();
                    break;
                case 5:
                    //nao faz nada
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 5);
    }
}
