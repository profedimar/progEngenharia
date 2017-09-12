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
public class Exercicio08 {

    /*
    Ler a sigla do estado de uma pessoa e imprimir seu gentílico. Por exemplo, se ler RS deve informar gaúcho.
     */
    public static void main(String[] args) {
        //declarando
        String sigla;

        sigla = JOptionPane.showInputDialog("Digite a sigla do seu estado");

        if (sigla.equals("RJ") || sigla.equals("rj")) {
            JOptionPane.showMessageDialog(null, "Carioca");
        } else if (sigla.equals("SP") || sigla.equals("sp")) {
            JOptionPane.showMessageDialog(null, "Paulista");
        } else if (sigla.equals("MG") || sigla.equals("mg")) {
            JOptionPane.showMessageDialog(null, "Mineiro");
        } else if (sigla.equals("RS") || sigla.equals("rs")) {
            JOptionPane.showMessageDialog(null, "Gaucho");
        } else if (sigla.equals("AC") || sigla.equals("ac")) {
            JOptionPane.showMessageDialog(null, "Acreano");
        } else if (sigla.equals("AL") || sigla.equals("al")) {
            JOptionPane.showMessageDialog(null, "Acreano");
        } else if (sigla.equals("AP") || sigla.equals("ap")) {
            JOptionPane.showMessageDialog(null, "Amapaense");
        } else if (sigla.equals("AM") || sigla.equals("am")) {
            JOptionPane.showMessageDialog(null, "Amazonense");
        } else if (sigla.equals("BA") || sigla.equals("ba")) {
            JOptionPane.showMessageDialog(null, "Baiano");
        } else if (sigla.equals("CE") || sigla.equals("ce")) {
            JOptionPane.showMessageDialog(null, "Cearense");
        } else if (sigla.equals("DF") || sigla.equals("df")) {
            JOptionPane.showMessageDialog(null, "brasiliense");
        } else if (sigla.equals("ES") || sigla.equals("es")) {
            JOptionPane.showMessageDialog(null, "capixaba");
        } else if (sigla.equals("GO") || sigla.equals("go")) {
            JOptionPane.showMessageDialog(null, "Goiano");
        } else if (sigla.equals("MA") || sigla.equals("ma")) {
            JOptionPane.showMessageDialog(null, "Maranhense");
        } else if (sigla.equals("MT") || sigla.equals("mt")) {
            JOptionPane.showMessageDialog(null, "Sul - mato-grosense");
        } else if (sigla.equals("MS") || sigla.equals("ms")) {
            JOptionPane.showMessageDialog(null, "(mato-grossense");
        } else if (sigla.equals("PA") || sigla.equals("pa")) {
            JOptionPane.showMessageDialog(null, "Paraense");
        } else if (sigla.equals("PB") || sigla.equals("pb")) {
            JOptionPane.showMessageDialog(null, "Pernambucano");
        } else if (sigla.equals("PR") || sigla.equals("pr")) {
            JOptionPane.showMessageDialog(null, "Paranaense");
        } else if (sigla.equals("PE") || sigla.equals("pe")) {
            JOptionPane.showMessageDialog(null, "alagoano)");
        } else if (sigla.equals("PI") || sigla.equals("pi")) {
            JOptionPane.showMessageDialog(null, "Piauiense");
        } else if (sigla.equals("RN") || sigla.equals("rn")) {
            JOptionPane.showMessageDialog(null, "Potiguar");
        } else if (sigla.equals("RO") || sigla.equals("ro")) {
            JOptionPane.showMessageDialog(null, "Rondoniano");
        } else if (sigla.equals("RR") || sigla.equals("rr")) {
            JOptionPane.showMessageDialog(null, "Roraimense");
        } else if (sigla.equals("SC") || sigla.equals("sc")) {
            JOptionPane.showMessageDialog(null, "Bariga verde");
        } else if (sigla.equals("SE") || sigla.equals("se")) {
            JOptionPane.showMessageDialog(null, "Sergipano");
        } else if (sigla.equals("TO") || sigla.equals("to")) {
            JOptionPane.showMessageDialog(null, "Tocantinense");
        } else {
            JOptionPane.showMessageDialog(null, "Estado Inválido!");
        }
    }
}
