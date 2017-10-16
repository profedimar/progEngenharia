/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01_substitutiva;

/**
 *
 * @author edimar
 */
public class Q9 {
    public static void main(String[] args) {
        int a, b, c, x;
        
        x = 1;
        
        a = 5;
        b = 20;
        c = 0;
        
        do {
            b = b - a;
        }while(c < b);
        
        c = a + b + x;
        
        System.out.println(""+c); //NOVO 6
    }
}
