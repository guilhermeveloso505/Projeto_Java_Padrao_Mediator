package Mediator;

public class Transportadora implements Setor {

    private static Transportadora instancia = new Transportadora();
    private Transportadora() {};

    public static Transportadora getInstancia() { return instancia; }

    public String receberReclamacao(String mensagem) {
        return "A transportadora irá procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A transportadora agradece a mensagem: " + mensagem;
    }

    public String receberCritica(String mensagem) {
        return "A transportadora irá analisar a crítica: " + mensagem;
    }

}
