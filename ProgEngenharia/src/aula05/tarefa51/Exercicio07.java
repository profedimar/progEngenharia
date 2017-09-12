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
public class Exercicio07 {

    /*
    Ler um valor para o sexo. Repetir a leitura enquanto o usuário informar um sexo inválido
     */
    public static void main(String[] args) {
        //declarando
        String sexo;

        //lendo e repetindo a leitura enquanto condição for verdadeira
        do {
            sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa: ");
            
            if (!sexo.equals("F") && !sexo.equals("M")){
                JOptionPane.showMessageDialog(null, "Sexo inválido!");        
            }
        } while (!sexo.equals("F") && !sexo.equals("M"));

        JOptionPane.showMessageDialog(null, "O valor do sexo é: " + sexo);
    }
}
