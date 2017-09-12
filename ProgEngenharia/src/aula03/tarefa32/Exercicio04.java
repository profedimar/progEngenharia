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
public class Exercicio04 {
    /*
    Ler dois números inteiros, que referem-se respectivamente a um dia e mês de 2017. 
    Imprimir se a data formada pelos números é válida. 
    Por exemplo, 11/12/2017 é válido. 31/06/2017 não é válido.
    */
    public static void main(String[] args) {
        //declarando
        int dia, mes;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
        
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12){
            JOptionPane.showMessageDialog(null, "Data inválida!");
        }else{
            if (mes == 2 && dia > 28){
                JOptionPane.showMessageDialog(null, "Data inválida!");    
            }else{
                if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
                    JOptionPane.showMessageDialog(null, "Data inválida!");    
                }else{
                    JOptionPane.showMessageDialog(null, "Data válida!");    
                }
            }
        }
    }
}
