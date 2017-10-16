/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.exemplos;

/**
 *
 * @author edimar
 */
public class Exemplo05 {
    
    void func01(int b){
        b = -100;
        System.out.println("O valor de B dentro da função \"func01\" é: "+b);
    }
    
    void func02(int b){
        b = 155;
        System.out.println("O valor de B dentro da função \"func01\" é: "+b);
    }
    
    public static void main(String[] args) {
        int b;
        
        Exemplo05 ex = new Exemplo05();
        
        b = 35;
        
        System.out.println("O valor de B no \"main\" é: "+b);
        ex.func01(b);
        System.out.println("O valor de B no \"main\" é: "+b);
        ex.func02(b);
        System.out.println("O valor de B no \"main\" é: "+b);
        
    }
}
