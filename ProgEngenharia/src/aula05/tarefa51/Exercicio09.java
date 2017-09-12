/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05.tarefa51;

import javax.swing.JOptionPane;

/**
 *
 * @author edimar
 */
public class Exercicio09 {

    /*
    (Página 272) Chico tem 1.50m e cresce 2 centimetros por ano, enquanto Juca tem 1.10m e
    cresce 3 centimetros por ano. Construir um algoritmo que calcule e 
    imprima quantos anos serão necessários para que Juca seja maior que Chico
     */
    public static void main(String[] args) {
        //declarando
        int alturaChico, alturaJuca;
        int crescimentoChico, crescimentoJuca;
        int anos;

        //atribuindo
        alturaChico = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura de Chico (cm): ")); 
        crescimentoChico = Integer.parseInt(JOptionPane.showInputDialog("Digite a taxa anual de crescimento de Chico (cm): ")); 
        alturaJuca = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura de Juca (cm): "));
        crescimentoJuca = Integer.parseInt(JOptionPane.showInputDialog("Digite a taxa anual de crescimento de Juca (cm): ")); ;

        //inicializando contador
        anos = 0;

        while (alturaChico > alturaJuca) {
            alturaChico = alturaChico + crescimentoChico;
            alturaJuca = alturaJuca + crescimentoJuca;
            anos = anos + 1;
        }
        JOptionPane.showMessageDialog(null, "Anos necessários para que Juca seja maior que Chico: " + anos);
    }
}
