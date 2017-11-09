/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exemplos;

/**
 *
 * @author edimar
 */
public class Exemplo02 {
    
    void soma(double a, int b){ //definindo a função "soma"
        double result;
        result = a + b;
        System.out.println("A soma de "+a+" com "+b+" é "+result);
    }
    public static void main(String[] args) {
        int y;
        double x;
        
        Exemplo02 ex = new Exemplo02(); //instanciando a classe "Exemplo02"   
        ex.soma(3.5, 9);  //chamada da função "soma" com literais como parâmetros
        x = 2.5;
        y = 4;
        ex.soma(x, y); //chamada da função "soma" com variáveis como parâmetros
    }
}
