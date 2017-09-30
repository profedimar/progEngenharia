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
public class Q10 {

    public static void main(String[] args) {
        int n, x;

        x = 1;

        n = 10;

        do {
            if (n % 2 == 0 && n % 7 == 0) {
                n = n + 2;
            } else{
                if (n % 2 == 0 || n > 10) {
                    n = n + 3;
                }else{
                    n = n + 1;
                }
            }
        } while (n <= 20);
        
        n = n + x;
        System.out.println(""+n); //23
    }
}
