import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private String formaPagamento;
    public List<String> formasPagamentos = List.of("0 - dinheiro", "1 - cheque", "2 - cartão");
    private List<ItemPedido> itens = new ArrayList<>(); // Carrinho


    public Pedido(Cliente cliente){
        this.cliente = cliente;

    }

    public void removerEstoque(){
        for(ItemPedido item : this.itens){
            item.removerEstoque();
        }
    }

    public List<ItemPedido> getItens(){
        return List.copyOf(this.itens);
    }

    public void imprimeCarrinho(){
        System.out.println("--- Carrinho ---");

        double total_pedido = this.calcularTotal();
        for(ItemPedido item : this.itens){
            System.out.printf("- Produto: %s, Quantidade: %d, Valor: %.2f%n", item.produto.nome, item.quantidade, item.calcularSubtotal());

        }
        System.out.println("---");

        System.out.printf("Total do carrinho: %.2f%n", total_pedido);
        System.out.println("--- Carrinho ---");
        System.out.println("");

    }

    public boolean adicionarFormaDePagamento(int  formaPagamento){
        switch (formaPagamento) {
            case 0:
                System.out.println("Pagando em Dinheiro");
            
                break;

            case 1:
                System.out.println("Pagando em Cheque");

                break;

            case 2:
                System.out.println("Pagando em Cartão");
                
                break;
        
            default:
                System.out.println("Erro ao selecionar forma de pagamento");
                return false;
        }
        return true;
    }

    public void adicionarItem(Produto p, int qtd) {
        itens.add(new ItemPedido(p, qtd));
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : this.itens){
            total += item.calcularSubtotal();
        }

        return total;
    }

}
