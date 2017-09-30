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
public class Q5 {
    public static void main(String[] args) {
        int x, i, p;
        
        x = 1;
        
        p = 0;
        
        for(i=0; i<5;i++){
            p = p + 2;
        }
        
        p = p + x;
        System.out.println(""+p);//11
    }
}
