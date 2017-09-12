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
public class Exercicio05 {

    /*
    Crie um programa que leia três valores reais x, y e z. 
    Depois apresente um menu contendo as seguintes opções: 1 - avançar; 2 - recuar; 3 - sair. 
    Quando o usuário escolhe a opção 1, o programa solicita qual eixo avançar (x, y ou z), 
    avança 1 posição no eixo escolhido e mostra as novas posições x, y e z. 
    Quando o usuário escolhe a opção 2, o programa solicita qual eixo recuar (x, y ou z),
    recua 1 posição no eixo escolhido e mostra as novas posições x, y e z. 
    Quando o usuário escolhe a opção 3, o programa é finalizado. 
    Enquanto, o usuário não digitar a opção 3. o programa deve continuar no menu.
     */
    public static void main(String[] args) {
        //declarando
        double x, y, z;
        int opcao;
        String eixo;

        //lendo
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de z: "));

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1: Avançar \n 2: Recuar \n 3: Sair\n\nDigite a opção desejada:"));

            //testando 
            switch (opcao) {
                case 1:
                    eixo = JOptionPane.showInputDialog("Informe o eixo a avançar:");
                    switch (eixo) {
                        case "x":
                            x = x + 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        case "y":
                            y = y + 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        case "z":
                            z = z + 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");

                    }
                    break;
                case 2:
                    eixo = JOptionPane.showInputDialog("Informe o eixo a recuar:");
                    switch (eixo) {
                        case "x":
                            x = x - 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        case "y":
                            y = y - 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        case "z":
                            z = z - 1;
                            JOptionPane.showMessageDialog(null, "Novas posições: (x, y, z) = (" + x + "," + y + "," + z + ")");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fechando o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");

            }
        } while (opcao != 3);

    }
}
