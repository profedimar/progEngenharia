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
public class ExVetores01 {

    public static void main(String[] args) {
        String[] nomes = {"Estẽvão", "Bernardo", "Annemarie", "Nataly", 
                          "Sharon", "Josiane"};
        int i;

        for (i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println(nomes[i]);
            }
        }
    }
}
