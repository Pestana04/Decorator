package Test;

import Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    void deveRetornarValorPedidoSimples() {
        Pedido pedido = new PedidoSimples(100.0f);
        assertEquals(100.0f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoSimples() {
        Pedido pedido = new PedidoSimples(100.0f);
        assertEquals("Pedido Simples", pedido.getDescricao());
    }

    @Test
    void deveRetornarValorPedidoComBebida() {
        Pedido pedido = new Bebida(new PedidoSimples(100.0f));
        assertEquals(110.0f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoComBebida() {
        Pedido pedido = new Bebida(new PedidoSimples(100.0f));
        assertEquals("Pedido Simples/Bebida", pedido.getDescricao());
    }

    @Test
    void deveRetornarValorPedidoComSobremesa() {
        Pedido pedido = new Sobremesa(new PedidoSimples(100.0f));
        assertEquals(115.0f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoComSobremesa() {
        Pedido pedido = new Sobremesa(new PedidoSimples(100.0f));
        assertEquals("Pedido Simples/Sobremesa", pedido.getDescricao());
    }

    @Test
    void deveRetornarValorPedidoComEntregaExpressa() {
        Pedido pedido = new EntregaExpressa(new PedidoSimples(100.0f));
        assertEquals(120.0f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoComEntregaExpressa() {
        Pedido pedido = new EntregaExpressa(new PedidoSimples(100.0f));
        assertEquals("Pedido Simples/Entrega Expressa", pedido.getDescricao());
    }

    @Test
    void deveRetornarValorPedidoComBebidaESobremesa() {
        Pedido pedido = new Sobremesa(new Bebida(new PedidoSimples(100.0f)));
        assertEquals(126.5f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoComBebidaESobremesa() {
        Pedido pedido = new Sobremesa(new Bebida(new PedidoSimples(100.0f)));
        assertEquals("Pedido Simples/Bebida/Sobremesa", pedido.getDescricao());
    }

    @Test
    void deveRetornarValorPedidoCompleto() {
        Pedido pedido = new EntregaExpressa(new Sobremesa(new Bebida(new PedidoSimples(100.0f))));
        assertEquals(151.8f, pedido.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPedidoCompleto() {
        Pedido pedido = new EntregaExpressa(new Sobremesa(new Bebida(new PedidoSimples(100.0f))));
        assertEquals("Pedido Simples/Bebida/Sobremesa/Entrega Expressa", pedido.getDescricao());
    }
}