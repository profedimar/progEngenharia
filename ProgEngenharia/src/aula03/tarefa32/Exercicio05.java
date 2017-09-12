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
public class Exercicio05 {

    /*
    Ler a temperatura de uma pessoa e informar se ela está com
    hipotermia leve, moderada, grave ou não está com hipotermia. 
     */

    public static void main(String[] args) {
        //declarando
        double temperatura;

        //lendo
        temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura: "));

        if (temperatura >= 33 && temperatura <= 35) {
            JOptionPane.showMessageDialog(null, "Hipotermia leve!");
        } else {
            if (temperatura >= 30 && temperatura < 33){
                JOptionPane.showMessageDialog(null, "Hipotermia moderada!");    
            }else{
                if (temperatura < 30){
                    JOptionPane.showMessageDialog(null, "Hipotermia grave!");        
                }else{
                    JOptionPane.showMessageDialog(null, "Não possui hipotermia!");    
                }
            }
        }
    }
}
