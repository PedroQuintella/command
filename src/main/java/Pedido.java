public class Pedido {

    private Integer id;
    private Double valor;
    private String situacao;

    public Pedido(Integer id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public void fazerPedido() {
        this.situacao = "Pedido feito.";
    }

    public void cancelarPedido() {
        this.situacao = "Pedido cancelado.";
    }

    public String getSituacao() {
        return situacao;
    }
}
