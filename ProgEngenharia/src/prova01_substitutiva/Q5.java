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
public class Q5 {
    public static void main(String[] args) {
        int x, i, p, a, b;
        
        x = 1;
        
        p = 0;
        a = 5;
        b = 3;
        
        
        for(i=0; i<a;i++){
            p = b + p;
        }
        
        p = p + x;
        System.out.println(""+p);//NOVO 16
    }
}
