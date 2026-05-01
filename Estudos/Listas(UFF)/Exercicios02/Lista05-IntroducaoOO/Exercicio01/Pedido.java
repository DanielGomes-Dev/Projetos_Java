import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public Cliente cliente;
    public String formaPagamento;
    public List<String> formasPagamentos = List.of("dinheiro", "cheque", "cartão");
    public List<ItemPedido> itens = new ArrayList<>();


    public Pedido(Cliente cliente){
        this.cliente = cliente;

    }

    public boolean adicionarFormaDePagamento(String formaPagamento){
        if(!formasPagamentos.contains(formaPagamento)) return false;
        this.formaPagamento = formaPagamento;
        return true;
    }

    public void adicionarItem(Produto p, int qtd) {
        itens.add(new ItemPedido(p, qtd));
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : itens){
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void fecharPedido(){
        for(ItemPedido item : itens){
            item.removerEstoque();
        }
    }
}
