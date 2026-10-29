package Mediator;

public abstract class Pessoa {

    public String elogiarTransportadora(String mensagem) {
        return Suporte.getInstancia().receberElogioTransportadora(mensagem);
    }

    public String criticarTransportadora(String mensagem) {
        return Suporte.getInstancia().receberCriticaTransportadora(mensagem);
    }

    public String reclamarTransportadora(String mensagem) {
        return Suporte.getInstancia().receberReclamacaoTransportadora(mensagem);
    }

}