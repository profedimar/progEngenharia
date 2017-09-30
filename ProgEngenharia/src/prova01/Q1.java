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
public class Q1 {
    public static void main(String[] args) {
        int x, n1, n2, n3, nf;
        
        x = 1;
        
        n1 = 2;
        n2 = 3;
        n3 = 5;
        
        nf = (n1+n2+n3) / 3; //int / int = int
        
        nf = nf + x;
        System.out.println(""+nf); //4
        
    }
}
