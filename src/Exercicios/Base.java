package Exercicios;

import java.util.Scanner;

/**
 * Classe usada como base para todos os exercícios.
 * Tem uma série de métodos comuns a vários.
 */

public class Base {

    /** Lê uma string dada pelo usuário */
    public static String lerString(){
        System.out.print("> ");
        return new Scanner(System.in).nextLine();
    }

    /** Lê um inteiro dado pelo usuário */
    public static int lerInt(){
        Integer leitura = null;
        while(leitura == null){
            try{
                leitura = Integer.parseInt(lerString());
            }catch(NumberFormatException e){
                escreverMsgAtencao("Digite um número inteiro");
            }
        }
        return leitura;
    }

    /** Lê um inteiro positivo dado pelo usuário */
    public static int lerIntPositivo(boolean seZeroIncluso){
        int leitura = lerInt();
        if(seZeroIncluso){
            while(leitura < 0){
                escreverMsgAtencao("Digite um número positivo ou zero");
                leitura = lerInt();
            }
        }
        else{
            while(leitura <= 0){
                escreverMsgAtencao("Digite um número positivo");
                leitura = lerInt();
            }
        }
        return leitura;
    }

    /** Lê um valor decimal dado pelo usuário */
    public static double lerDouble(){
        Double leitura = null;
        while(leitura == null){
            try{
                leitura = Double.parseDouble(lerString());
            }catch(NumberFormatException e){
                escreverMsgAtencao("Digite um valor numérico");
            }
        }
        return leitura;
    }

    /** Imprime na tela uma mensagem no formato de Atenção */
    public static void escreverMsgAtencao(String texto){
        System.out.println("* " + texto + "!");
    }

    /** Imprime na tela uma mensagem no formato de Erro */
    public static void escreverMsgErro(String texto){
        System.out.println("ERRO: " + texto);
    }

    /** Imprime na tela uma mensagem no formato de Título */
    public static void escreverTitulo(String texto){
        System.out.println("\n--- " + texto.toUpperCase() + " ---");
    }

    /** Imprime na tela uma mensagem sem formatação */
    public static void escreverLinha(String texto){
        System.out.println(texto);
    }

    /** Lê do usuário se ele deseja repetir o programa e retorna a opção escolhida */
    public static boolean repetir(){
        escreverLinha("\nDeseja repetir o código? Enter para sim, 0 para não");
        String opcao = lerString();
        if(opcao.isBlank() || opcao.isEmpty()){
            return true;
        }
        escreverTitulo("Programa finalizado");
       return false;
    }

}
