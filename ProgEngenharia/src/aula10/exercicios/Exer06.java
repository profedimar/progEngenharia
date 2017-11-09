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
public class Exer06 {

    /*
    Faça uma classe chamada Temperatura que contenha os seguintes dois métodos:
a. Celcius2Fahrenheit: recebe como parâmetro uma temperatura em graus célsius e
retorna a temperatura em graus Fahrenheit
b. Fahrenheit2Celcius: recebe como parâmetro uma temperatura em graus
Fahrenheit e retorna a temperatura em graus célcius
c. main: possui um menu com as seguintes opções: (1) converte temperatura de
Célcius para Fahrenheit; (2) converte temperatura de Fahrenheit para Célcius; (3)
sair. Utilize os métodos criados para fazer as conversões
     */

    double celcius2Fahrenheit(double celcius) {
        return celcius * 1.8 + 32;
    }

    double fahrenheit2Celcius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Exer06 ex = new Exer06();
        int nr;
        double temperatura;

        do {
            nr = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n 1 - Converte temperatura de Célcius para Fahrenheit \n"
                    + "2 - Converte temperatura de Fahrenheit para Célcius \n"
                    + "3 - Sair \n Digite a sua opção:"));

            if (nr == 1) {
                temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celcius"));
                JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + ex.celcius2Fahrenheit(temperatura));
            } else if (nr == 2) {
                temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit"));
                JOptionPane.showMessageDialog(null, "Temperatura em Celcius: " + ex.fahrenheit2Celcius(temperatura));
            } else if (nr != 3) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (nr != 3);
    }
}
