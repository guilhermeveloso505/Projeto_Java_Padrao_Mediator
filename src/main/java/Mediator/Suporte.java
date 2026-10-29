package Mediator;

public class Suporte {

    private static Suporte instancia = new Suporte();
    private Suporte() {}

    public static Suporte getInstancia() { return instancia; }

    public String receberElogioTransportadora(String mensagem) {
        return "O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n"+
                ">>>" + Transportadora.getInstancia().receberElogio(mensagem);
    }

    public String receberCriticaTransportadora(String mensagem) {
        return "O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n"+
                ">>>" + Transportadora.getInstancia().receberCritica(mensagem);
    }

    public String receberReclamacaoTransportadora(String mensagem) {
        return "O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n"+
                ">>>" + Transportadora.getInstancia().receberReclamacao(mensagem);
    }
}
