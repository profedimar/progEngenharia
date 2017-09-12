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
public class Exercicio06 {

    /*
    Felipe Massa está no km 30 da BR 386 a uma velocidade constante de 100 km/hora.
    Lewis Hamilton está no km 40 a uma velocidade constante de 99 km/hora. 
    Construir um algoritmo que calcule e imprima quantas horas leva para Felipe Massa ultrapassar Lewis Hamilton
        
     */

    public static void main(String[] args) {
        //declarando as variáveis
        int kmFelipe, kmLewis, velocidadeFelipe, velocidadeLewis, horas;

        //atribuindo
        kmFelipe = 30;
        velocidadeFelipe = 100;
        kmLewis = 40;
        velocidadeLewis = 99;

        //inicializando contador
        horas = 0;

        while (kmFelipe <= kmLewis) {
            kmFelipe = kmFelipe + velocidadeFelipe;
            kmLewis = kmLewis+velocidadeLewis;
            horas = horas + 1;
        }
        
        JOptionPane.showMessageDialog(null, "Horas necessárias para Felipe Massa ultrapassar Lewis Hamilton: "+horas);
    }
}
