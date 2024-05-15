package edu.francieudo.excecao;

public class Validar {

    private Validar() {}

    public static void verifcarParametros(int entradaUm, int entradaDois) throws ParametrosInvalidosException{

        if(entradaUm > entradaDois){
            throw new ParametrosInvalidosException("A primeira entrada: " + entradaUm, "A segunda entrada: " + entradaDois);
        }
    }
}
