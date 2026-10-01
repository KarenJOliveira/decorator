import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveRetornarPrecoPedido()
    {
        Pedido pedido = new PedidoBase(1000.0f);
        assertEquals(1000.0f,pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComFrete()
    {
        Pedido pedido = new Frete(new PedidoBase(1000.0f));
        assertEquals(1100.0f,pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComSeguro()
    {
        Pedido pedido = new Seguro(new PedidoBase(1000.0f));
        assertEquals(1200.0f,pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComEmbalagemPresente()
    {
        Pedido pedido = new EmbalagemPresente(new PedidoBase(1000.0f));
        assertEquals(1050.0f,pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComFreteMaisSeguro()
    {
        Pedido pedido = new Seguro(new Frete(new PedidoBase(1000.0f)));
        assertEquals(1320.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPrecoPedidoComFreteMaisEmbalagemPresente()
    {
        Pedido pedido = new EmbalagemPresente(new Frete(new PedidoBase(1000.0f)));
        assertEquals(1155.0f,pedido.getPreco());
    }

    @Test
    void deveRetornarPedidoComSeguroMaisEmbalagemPresente()
    {
        Pedido pedido = new EmbalagemPresente(new Seguro(new PedidoBase(1000.0f)));
        assertEquals(1260.0f, pedido.getPreco());
    }

    @Test
    void deveRetornarPedidoComFreteMaisSeguroMaisEmbalagemPresente()
    {
        Pedido pedido = new EmbalagemPresente(new Seguro(new Frete(new PedidoBase(1000.0f))));
        assertEquals(1386.0f,pedido.getPreco(),0.01);
    }

}
