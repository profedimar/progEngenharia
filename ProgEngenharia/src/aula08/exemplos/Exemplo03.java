/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.exemplos;

/**
 *
 * @author edimar
 */
public class Exemplo03 {
    
    double soma(double a, int b){ //definindo a função "soma"
        double result;
        
        result = a + b;
        return result;
    }
    
    public static void main(String[] args) {
        int y;
        double x, result;
        
        
        Exemplo03 ex = new Exemplo03(); //instanciando a classe "Exemplo02"
        
        result = ex.soma(3.5, 9);  //chamada da função "soma" com literais como parâmetros
        System.out.println("A soma é: "+result);
        
        x = 2.5;
        y = 4;
        
        result = ex.soma(x, y); //chamada da função "soma" com variáveis como parâmetros
        System.out.println("A soma é: "+result);
    }
}
