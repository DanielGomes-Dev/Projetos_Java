package src.mercado.pedido;
import java.util.ArrayList;
import java.util.List;

import src.cliente.Cliente;
import src.mercado.produto.Produto;
import src.mercado.pedido.item.Item;


public class Pedido {

    private Cliente cliente;
    private String formaPagamento;
    public List<String> formasPagamentos = List.of("0 - dinheiro", "1 - cheque", "2 - cartão");
    private List<Item> carrinho = new ArrayList<>(); // Carrinho


    public Pedido(Cliente cliente){
        System.out.println("\n-----------\n");
        System.out.println("Iniciando novo pedido.");
        System.out.println("\n-----------\n");
        
        this.cliente = cliente;

    }

    public void setItemPedido(Produto produto, int quantidade){

        Item item = new Item(produto, quantidade);
        carrinho.add(item);
    }


    public void imprimeCarrinho(){
        System.out.println("--- Carrinho ---");

        double total_pedido = 0;
        for(Item item : this.carrinho){
            total_pedido += item.getTotalPrice();
            System.out.printf("- Produto: %s, Quantidade: %d, Valor: %.2f%n", 
            item.getProduct().getNomeProduto(), 
            item.getQuantidade(), 
            item.getTotalPrice());

        }
        System.out.println("");


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


}
