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
public class Q10 {

    public static void main(String[] args) {
        int n, p, x, w;

        x = 1;

        n = 1;
        w = 4;

        do {

            for (p = 0; p < 2; p++) {
                w = w + 2;
            }
            n = n + 1;

        } while (n <= 3);

        w = w + x;
        System.out.println("" + w); //NOVO 17
    }
}
