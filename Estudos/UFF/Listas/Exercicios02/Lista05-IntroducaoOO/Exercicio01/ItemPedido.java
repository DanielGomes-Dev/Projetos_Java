public class ItemPedido {
    public Produto produto;
    public int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.preco * quantidade;
    }

    public void removerEstoque(){
        produto.quantidadeEstoque -= quantidade;
    }
}