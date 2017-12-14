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
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vetorx = new int[5];
        int a, b, i;
        a = 3;
        b = 4;
        
        for(i=0; i< 5; i++){
            if (i%2 == 0){
                vetorx[i]=a;
            }else{
                vetorx[i]=b;
            }
        }
        for(i=0; i< 5; i++){
            System.out.println(""+vetorx[i]);
        }
        
    }
    
}
