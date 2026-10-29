package Mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveElogiarTransportadora() {
        Usuario usuario = new Usuario();
        assertEquals("O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>>A transportadora agradece a mensagem: Entrega rápida, produto chegou bem lacrado e sem nenhum dano.",
                usuario.elogiarTransportadora("Entrega rápida, produto chegou bem lacrado e sem nenhum dano."));
    }

    @Test
    void deveCriticarTransportadora() {
        Usuario usuario = new Usuario();
        assertEquals("O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>>A transportadora irá analisar a crítica: Demora para entrega de mercadoria.",
                usuario.criticarTransportadora("Demora para entrega de mercadoria."));
    }

    @Test
    void deveReclamarTransportadora() {
        Usuario usuario = new Usuario();
        assertEquals("O Suporte agradece seu contato. \n"+
                "A transportadora respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>>A transportadora irá procurar melhorar o serviço da reclamação: Mercadoria chegou avariada e com produtos faltando.",
                usuario.reclamarTransportadora("Mercadoria chegou avariada e com produtos faltando."));
    }

}