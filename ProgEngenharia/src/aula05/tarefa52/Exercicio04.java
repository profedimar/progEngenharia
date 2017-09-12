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
public class Exercicio04 {

    /*
    Crie um algoritmo que tenha um menu contendo as seguintes opções:
    1 - Imprime o texto "Ligar fresadora"; 2 - imprime o texto "Desligar fresadora";
    3 -  imprime o texto "Ligar torno"; 4 - imprime o texto "Desligar torno";
    5 - termina o programa. Enquanto, o usuário não digitar a opção 5. o programa deve continuar no menu.
     */
    public static void main(String[] args) {
        //declarando
        int opcao;

        //repetindo
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1: Ligar fresadora \n 2: Desligar fresadora \n 3: Ligar torno \n 4: Desligar torno \n 5: Fechar programa\n\nDigite a opção desejada:"));

            //testando 
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Ligando a fresadora");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Desligando a fresadora");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ligando o torno");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Desligando o torno");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Fechando o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        } while (opcao != 5);
    }
}
