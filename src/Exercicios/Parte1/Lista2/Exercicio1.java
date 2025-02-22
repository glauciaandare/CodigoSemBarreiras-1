package Exercicios.Parte1.Lista2;

/**
 * Parte: 1
 * Lista: 2
 * Exercício: 1
 * ENUNCIADO:
 *      "Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar."
 */

public class Exercicio1 extends Exercicios.Base {
    public static void main(String[] args) {
        do{
            escreverTitulo("Programa que diz se um número é par ou ímpar");
            escreverLinha("Informe o número desejado");
            int numero = lerInt();
            if(numero % 2 == 0){
                escreverLinha("O número " + numero + " é PAR.");
            }
            else{
                escreverLinha("O número " + numero + " é ÍMPAR.");
            }
        }while(repetir());
    }
}
