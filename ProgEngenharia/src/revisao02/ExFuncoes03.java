/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao02;

/**
 *
 * @author edimar
 */
public class ExFuncoes03 {
    
    int calculo(int b, int a){
        return a-b;
    }
    
    public static void main(String[] args) {
        ExFuncoes03 ex = new ExFuncoes03();
        int a, b,x;
        a=7;
        b=9;
        x = ex.calculo(a, b);
        System.out.println(""+x);
    }
}
