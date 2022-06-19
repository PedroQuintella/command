public class CancelarPedidoTarefa implements Tarefa {

    private Pedido pedido;

    public CancelarPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.cancelarPedido();
    }

    public void cancelar() {
        this.pedido.fazerPedido();
    }
}
