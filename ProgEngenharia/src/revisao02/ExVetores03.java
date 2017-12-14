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
public class ExVetores03 {

    public static void main(String[] args) {
        int[] v = {3, 4, 9, 8, 7, 9, 4};
        int i;

        for (i = 0; i < 7; i++) {
            if (i<6 && v[i] < v[i+1]) {
                System.out.println(v[i]+"");
            }else{
                if (i==6 && v[i] < v[0]){
                    System.out.println(v[i]+"");
                }
            }
            
        }
    }
}
