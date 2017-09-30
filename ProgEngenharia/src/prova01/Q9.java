/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01;

/**
 *
 * @author edimar
 */
public class Q9 {
    public static void main(String[] args) {
        int a, b, c, x;
        
        x = 1;
        
        a = 5;
        b = 10;
        c = 25;
        
        do{
            a = a +2;
        }while(a > b);
        
        do {
            b = b + a;
        }while(c > b);
        
        c = a + b + x;
        
        System.out.println(""+c); //39
    }
}
