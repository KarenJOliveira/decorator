public class EmbalagemPresente extends PedidoDecorator{
    public EmbalagemPresente(Pedido pedido)
    {
        super(pedido);
    }

    @Override
    public float getPercentualPreco() {
        return 5.0f;
    }
}
