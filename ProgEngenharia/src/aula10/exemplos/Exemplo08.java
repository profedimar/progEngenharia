/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exemplos;

/**
 *
 * @author edimar
 */
public class Exemplo08 {
    
    int func01(int b){
        b = b+3;
        return b;
    }
    
    int func02(int b){
        b = b+5;
        return b;
    }
    
    public static void main(String[] args) {
        int b;
        Exemplo08 ex = new Exemplo08();
        b = 35;
        System.out.println("O valor de B no \"main\" é: "+b);
        b = ex.func01(b);
        System.out.println("O valor de B no \"main\" é: "+b);
        b = ex.func02(b);
        System.out.println("O valor de B no \"main\" é: "+b);
        
    }
}
