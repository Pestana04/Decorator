package Decorator;

public class Bebida extends PedidoDecorator {

    public Bebida(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 10.0f;
    }

    public String getNomeDescricao() {
        return "Bebida";
    }
}