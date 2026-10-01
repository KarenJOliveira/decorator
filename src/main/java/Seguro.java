public class Seguro extends PedidoDecorator{
    public Seguro(Pedido pedido)
    {
        super(pedido);
    }

    @Override
    public float getPercentualPreco() {
        return 20.0f;
    }
}
