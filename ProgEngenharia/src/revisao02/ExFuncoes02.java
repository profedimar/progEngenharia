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
public class ExFuncoes02 {
    
    int calculo(int ini, int fim){
        int i, aux;
        
        aux = 0;
        for(i=ini; i<fim; i++){
            aux = aux+1;
        }
        return aux;
           
    }
    
    public static void main(String[] args) {
        ExFuncoes02 ex = new ExFuncoes02();
        int x, a, b;
        a=5;
        b=8;
        x = ex.calculo(a, b);
        System.out.println(""+x);
    }
}
