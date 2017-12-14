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
public class Exer09 {
    /*
    Faça uma classe que contenha os seguintes métodos:
a. lerInteiro: lê um número inteiro e o retorna
b. lerDouble: lê um número real e o retorna
c. lerString: lê um texto e o retorna
d. mostrar: recebe como parâmetro uma String e mostra o valor na tela
e. main: utilizar todas os métodos anteriores
    */
    
    int lerInteiro(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    
    double lerDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }
    
    String lerString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
    
    void mostrar(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void main(String[] args) {
        Exer09 ex = new Exer09();
        int nrInteiro; //declarando a variável
        double nrReal; //declarando a variável
        String texto; //declarando a variável
        
        nrInteiro = ex.lerInteiro("Digite um número inteiro");
        ex.mostrar("Número lido: "+nrInteiro);
        
        nrReal = ex.lerDouble("Digite um número real");
        ex.mostrar("Número lido: "+nrReal);
        
        texto = ex.lerString("Digite um texto");
        ex.mostrar("Texto lido: "+texto);
    }
}
