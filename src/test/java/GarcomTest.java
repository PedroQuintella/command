import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarcomTest {

    Garcom garcom;
    Pedido pedido;

    @BeforeEach
    void setUp() {
        garcom = new Garcom();
        pedido = new Pedido (1, 10.90);
    }

    @Test
    void deveFazerPedido() {
        Tarefa fazerPedido = new RealizarPedidoTarefa(pedido);
        garcom.executarTarefa(fazerPedido);

        assertEquals("Pedido feito.", pedido.getSituacao());
    }

    @Test
    void deveCancelarPedido() {
        Tarefa cancelarPedido = new CancelarPedidoTarefa(pedido);
        garcom.executarTarefa(cancelarPedido);

        assertEquals("Pedido cancelado.", pedido.getSituacao());
    }

    @Test
    void deveImpedirCancelamentoPedido() {
        Tarefa fazerPedido = new RealizarPedidoTarefa(pedido);
        Tarefa cancelarPedido = new CancelarPedidoTarefa(pedido);

        garcom.executarTarefa(fazerPedido);
        garcom.executarTarefa(cancelarPedido);

        garcom.cancelarUltimaTarefa();

        assertEquals("Pedido feito.", pedido.getSituacao());
    }

}