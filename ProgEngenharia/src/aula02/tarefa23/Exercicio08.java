/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.tarefa23;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio08 {

    /*
    Entrar com um número no formato CDU (centena, dezena, unidade) e imprimir invertido: UDC (por exemplo, 123 sairá 321). O número deverá ser armazenado em outra variável antes de ser impresso
     */
    public static void main(String[] args) {
        //declarando
        int numero, a, b, c, d, e;

        //lendo
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de três algarismos: "));

        //calculando
        a = numero / 100;
        b = numero - (a * 100);
        c = b / 10;
        d = b - (c * 10);
        e = (d * 100) + (c * 10) + a;

        //mostrar
        JOptionPane.showMessageDialog(null, " O número com os algarismos invertidos é " + e);

    }
}
