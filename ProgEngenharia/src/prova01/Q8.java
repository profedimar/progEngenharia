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
public class Q8 {
    public static void main(String[] args) {
        int x, n1, n2, n3, t;
        
        x = 1;
        t = 10;
        
        n1 = 10;
        n2 = 95;
        n3 = 200;
        
        while(n1 < n2 && n3 > n2){
            n1 = n1 + 10;
            n3 = n3 - n1;
        }
        
        n3 = n3 + x;
        System.out.println(""+n3);//61
    }
}
