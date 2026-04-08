package Decorator;

public class EntregaExpressa extends PedidoDecorator {

    public EntregaExpressa(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 20.0f;
    }

    public String getNomeDescricao() {
        return "Entrega Expressa";
    }
}