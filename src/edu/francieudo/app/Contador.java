package edu.francieudo.app;

import java.util.Scanner;

import edu.francieudo.excecao.ParametrosInvalidosException;
import edu.francieudo.excecao.Validar;

public class Contador {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite seu primeiro parametro: ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite seu segunda parametro: ");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm,parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());

        }finally{

            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        Validar.verifcarParametros(parametroUm, parametroDois);

        int contagem = parametroDois - parametroUm;
        imprimirInteracao(contagem);
    }

    static void imprimirInteracao(int contagem){

        for(int i=1; i<=contagem; i++){

            System.out.println("Imprimindo o número " + i);
        }
    }

}


