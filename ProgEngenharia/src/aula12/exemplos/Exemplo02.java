/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.exemplos;

/**
 *
 * @author Administrador
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetorx = new int[4];
        int[] vetory = new int[4];
        int[] vetorz = new int[4];
        int a, b, i;
        a = 3;
        b = 4;
        for (i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                vetorx[i] = a;
                vetory[i] = a;
            } else {
                vetorx[i] = b;
                vetory[i] = b;
            }
        }
        for (i = 0; i < 4; i++) {
            vetorz[i] = vetorx[i] - vetory[3 - i];
        }
        for (i = 0; i < 4; i++) {
            System.out.println("" + vetorz[i]);
        }

    }

}
