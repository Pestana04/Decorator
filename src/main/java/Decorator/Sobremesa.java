package Decorator;

public class Sobremesa extends PedidoDecorator {

    public Sobremesa(Pedido pedido) {
        super(pedido);
    }

    public float getPercentualValor() {
        return 15.0f;
    }

    public String getNomeDescricao() {
        return "Sobremesa";
    }
}