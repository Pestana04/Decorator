package Decorator;

public class PedidoSimples implements Pedido {

    public float valor;

    public PedidoSimples() {
    }

    public PedidoSimples(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return "Pedido Simples";
    }
}