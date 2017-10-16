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
public class Q2 {
    public static void main(String[] args) {
        int x;
        int a, b, c;
        
        x = 1;
        
        a = 10;
        b = -5;
        
        c = a;
        a = b;
        b = c;
        
        b = b + x;
        
        System.out.println(""+b); //NOVO 11
    }
   
}
