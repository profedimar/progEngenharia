/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.exemplos;

/**
 *
 * @author Administrador
 */
public class Exemplo06 {
    
    void mostraSoma(int a, int b){
        int soma;
        soma = a+b;
        System.out.println("Soma: "+soma);
    }
    
    public static void main(String[] args) {
        Exemplo06 ex = new Exemplo06();
        
        ex.mostraSoma(3, 0);
    }
}
