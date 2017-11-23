/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13.exemplos;

/**
 *
 * @author Administrador
 */
public class Exemplo02 {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int L, C, a, b, e;
        a=5;
        b=2;
        e = 8;
        for (L = 0; L < 2; L++) {
            for (C = 0; C < 3; C++) {
                if (L == C){
                    matriz[L][C] = a;
                }else{
                    if (L > C){
                        matriz[L][C] = b;
                    }else{
                        matriz[L][C] = e;
                    }
                }
            }
        }
        for (L = 0; L < 2; L++) {
            for (C = 0; C < 3; C++) {
                System.out.print("" + matriz[L][C] + "\t");
            }
            System.out.print("\n");
        }
    }
}
