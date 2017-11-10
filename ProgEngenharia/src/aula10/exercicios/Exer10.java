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
public class Exer10 {
    /*
    Faça uma classe que contenha os seguintes métodos:
a. mediaN: recebe como parâmetro um número inteiro n, lê n números reais e
retorna a média dos números lidos.
b. main: ler 5 números reais e mostrar a média. Utilize o método criado.
     */
    
    double mediaN(int n){
        int i;
        double nr, soma;
        
        soma = 0;
        for(i=0; i<n; i++){
            nr = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + nr;
        }
        return soma/n;
    }
    
    public static void main(String[] args) {
        Exer10 ex = new Exer10();
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
        JOptionPane.showMessageDialog(null, "Média: "+ex.mediaN(n));
    }
}
