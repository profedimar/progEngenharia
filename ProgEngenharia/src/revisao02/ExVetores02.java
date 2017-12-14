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
public class ExVetores02 {

    public static void main(String[] args) {
        String[] nomes = {"Estẽvão", "Bernardo", "Annemarie", "Ciclano", "Nataly", 
                          "Sharon", "Eduardo"};
        String[] sexo = {"M", "M", "F", "F", "F", "F", "M"};
        int i;

        for (i = 0; i < 7; i++) {
            if (sexo[i].equals("F")) {
                System.out.println(nomes[i]);
            }
        }
    }
}
