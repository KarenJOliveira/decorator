public class Frete extends PedidoDecorator{
    public Frete(Pedido pedido)
    {
        super(pedido);
    }

    @Override
    public float getPercentualPreco() {
        return 10.0f;
    }
}
