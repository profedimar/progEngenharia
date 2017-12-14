/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.exemplos;

/**
 *
 * @author Administrador
 */
public class Exemplo07 {

    int mostraSoma(int a, int b) {
        int soma;
        soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        Exemplo07 ex = new Exemplo07();
        int retorno;

        retorno = ex.mostraSoma(3, 0);

        System.out.println("Soma: " + retorno);
    }
}
