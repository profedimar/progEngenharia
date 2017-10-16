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
public class Q6 {

    public static void main(String[] args) {
        int x, i, j, p;

        x = 1;

        p = 1;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    p = p + i + j;
                }
            }
        }

        p = p + x;
        System.out.println("" + p);//NOVO 22
    }
}
