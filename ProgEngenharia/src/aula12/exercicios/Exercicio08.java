/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.exercicios;


/**
 *
 * @author Administrador
 */
public class Exercicio08 {

    /*
    Faça um algoritmo para simular o cálculo do resultado da Mega Sena. Em um vetor de tamanho 6, será armazenado o resultado da Mega Sena. 
    Em outros três vetores de tamanho 6, serão armazenados os jogos do João, Maria e Pedro, respectivamente. Os valores dos quatro vetores devem ser lidos.
    O programa deve informar o número de acertos de cada apostador. Se alguém tiver 6 acertos, acrescentar a mensagem: “Ganhador, parabéns!”
     */

    public static void main(String[] args) {
        // declarando variáveis e vetores
        final int TAMANHO = 6;
        int[] resultado = {1, 2, 3, 4, 5, 6};
        int[] joao = {1, 3, 4, 5, 7, 8};
        int[] maria = {1, 2, 3, 4, 5, 6};
        int[] pedro = {2, 9, 15, 25, 36, 40};
        int acertos, i, j;
        
        //verificando o nr de acertos de joao
        acertos=0;
        for(i=0; i<TAMANHO; i++){ //percorrendo a aposta de joão
            for(j=0; j<TAMANHO; j++){//percorrendo o gabarito
                if (joao[i] == resultado[j]){ //a posição i em joão tem no resultado
                    acertos++;
                    break;
                }
            }
        }
        System.out.println("Acertos João: "+acertos);
        if (acertos == 6){
            System.out.println("\tJoão Ganhou, parabéns!");
        }
        
        //verificando o nr de acertos de maria
        acertos=0;
        for(i=0; i<TAMANHO; i++){ //percorrendo a aposta de maria
            for(j=0; j<TAMANHO; j++){//percorrendo o gabarito
                if (maria[i] == resultado[j]){ //a posição i em maria tem no resultado
                    acertos++;
                    break;
                }
            }
        }
        System.out.println("Acertos maria: "+acertos);
        if (acertos == 6){
            System.out.println("\t Maria Ganhou, parabéns!");
        }
        
          //verificando o nr de acertos de pedro
        acertos=0;
        for(i=0; i<TAMANHO; i++){ //percorrendo a aposta de pedro
            for(j=0; j<TAMANHO; j++){//percorrendo o gabarito
                if (pedro[i] == resultado[j]){ //a posição i em pedro tem no resultado
                    acertos++;
                    break;
                }
            }
        }
        System.out.println("Acertos pedro: "+acertos);
        if (acertos == 6){
            System.out.println("\t Pedro Ganhou, parabéns!");
        }
        

        
    }
}
