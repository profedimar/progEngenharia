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
public class Exercicio10 {

    /*
    Altere o algoritmo acima, para que o usuário informe a altura e crescimento das duas pessoas
     */
    public static void main(String[] args) {
        //declarando
        int alturaChico, alturaJuca;
        int crescimentoChico, crescimentoJuca;
        int anos;

        //lendo
        alturaChico = 150; //transformei de m para cm
        crescimentoChico = 2;
        alturaJuca = 110; //transformei de m para cm
        crescimentoJuca = 3;

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
