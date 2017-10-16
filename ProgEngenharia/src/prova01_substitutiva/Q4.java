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
public class Q4 {

    public static void main(String[] args) {
        int a, b, c, x;

        x = 1;

        a = 6;
        b = 5;
        c = 2;

        if (a > b) {
            c = c + a - b;
        }

        if (a < b) {
            c = c - a + b;
        } else {
            c = c + 2;
        }

        c = c + x;

        System.out.println("" + c);//NOVO 6
    }
}
