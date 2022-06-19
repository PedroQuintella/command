public class RealizarPedidoTarefa implements Tarefa {

    private Pedido pedido;

    public RealizarPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        this.pedido.fazerPedido();
    }

    public void cancelar() {
        this.pedido.cancelarPedido();
    }
}
