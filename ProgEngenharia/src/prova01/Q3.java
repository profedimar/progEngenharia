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
public class Q3 {
    public static void main(String[] args) {
        int y, x;
        
        x = 1;
        
        y = 5;
        
        if (y % 2 == 0){
            y = y+2;
        }else{
            y = y+3;
        }
        
        y = y + x;
        System.out.println(""+y);//9
        
    }
}
