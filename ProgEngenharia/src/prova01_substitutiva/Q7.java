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
public class Q7 {
    public static void main(String[] args) {
        int x, a, b, c;
        
        x = 1;
        
        a = 5;
        b = 15;
        c = 0;
        
        while(a < b){
            c = c + a + b;
            a = a +1;
            b = b - 1;
        }
        
        b = c;
        c = a;
        a = b;
        
        c = c + x;
        
        System.out.println(""+c); //NOVO 11
        
    }
}
