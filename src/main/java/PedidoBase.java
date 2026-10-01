public class PedidoBase implements Pedido {
    public float preco;

    public PedidoBase(){}

    public PedidoBase(float preco)
    {
        this.preco = preco;
    }

    public float getPreco()
    {
        return preco;
    }
}
