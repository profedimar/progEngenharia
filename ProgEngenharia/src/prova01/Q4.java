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
public class Q4 {
    public static void main(String[] args) {
        int p1, p2, x;
        
        x = 1;
        
        p1 = 5;
        p2 = 6;
        
        if (p1 > p2 || p1 < 4){
            p1 = p1 + p1;
            if (p1 > 10 && p2 > 4){
                p1 = p1 + 2;
            }else{
                p1 = p1 + 1;
            }
        }else{
            p2 = p2+p2;
            if (p2 > 10 && p1 > 4){
                p2 = p2 + 2;
            }else{
                p2 = p2 + 1;
            }
            
        }
        
        p1 = p1 + p2 + x;
        
        System.out.println(""+p1);//20
    }
}
