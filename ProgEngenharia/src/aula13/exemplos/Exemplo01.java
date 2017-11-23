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
public class Exemplo01 {

    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        int L, C;
        for (L = 0; L < 2; L++) {
            for (C = 0; C < 3; C++) {
                matriz[L][C] = L + C;
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
