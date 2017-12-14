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
public class ExFuncoes01 {
    
    int calculo(int a, int b){
        if (a > b){
            return a-b;
        }else{
            return b-a;
        }
    }
    
    public static void main(String[] args) {
        ExFuncoes01 ex = new ExFuncoes01();
        int x;
        
        x = ex.calculo(5, 10);
        System.out.println(""+x);
    }
}
