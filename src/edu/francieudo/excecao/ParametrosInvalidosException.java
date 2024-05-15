package edu.francieudo.excecao;

public class ParametrosInvalidosException extends Exception{


    private String textoParametroUm;
    private String textoParametroDois;

    public ParametrosInvalidosException(String textoParametroUm, String textoParametroDois) {

        this.textoParametroUm = textoParametroUm;
        this.textoParametroDois = textoParametroDois;
    }

    @Override
    public String getMessage() {
        
        return String.format("%s maior que %s", textoParametroUm, textoParametroDois);
    }
}
