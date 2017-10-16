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
public class Q3 {
    public static void main(String[] args) {
        int a, b, c, x;
        
        x = 1;
        
        a = 5;
        b = 10;
        c = 7;
        
        if (a < b && c > b){
            if (a < b || c > b){
                c = a * b;
            }else{
                c = a / b;
            }
        }else{
            if (a < b || c > b){
                c = a + b;
            }else{
                c = a - b;
            }
        }
        
        c = c + x;
        System.out.println(""+c);//NOVO 16
        
    }
}
