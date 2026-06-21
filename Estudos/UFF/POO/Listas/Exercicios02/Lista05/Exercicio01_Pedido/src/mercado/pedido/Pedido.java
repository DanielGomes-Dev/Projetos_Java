package src.mercado.pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.cliente.Cliente;
import src.mercado.produto.Produto;
import src.mercado.pedido.item.Item;


// import java.util.ArrayList;
// import java.util.List;


public class Pedido {

    private Cliente cliente;
    // private String formaPagamento;
    // public List<String> formasPagamentos = List.of("0 - dinheiro", "1 - cheque", "2 - cartão");
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

        // boolean temEstoque = false;
        // int quantidade;
        // do {
        //     System.out.println("Digite a quantidade do produto que deseja comprar: "); // Verificar Se a quantidade esta disponivel

        //     quantidade = sc.nextInt();
        //     temEstoque = this.verificaProdutoEstoque(pedido, produto, quantidade);
        //     if(!temEstoque){
        //         System.out.println("Quantidade Invalida ou Fora de Estoque!"); // Verificar Se a quantidade esta disponivel
                
        //     }

        // } while (!temEstoque);


        // pedido.adicionarItem(produto, quantidade);
        // pedido.imprimeCarrinho();
    }

    // public void removerEstoque(){
    //     for(ItemPedido item : this.itens){
    //         item.removerEstoque();
    //     }
    // }

    // public List<ItemPedido> getItens(){
    //     return List.copyOf(this.itens);
    // }

    // public void imprimeCarrinho(){
    //     System.out.println("--- Carrinho ---");

    //     double total_pedido = this.calcularTotal();
    //     for(ItemPedido item : this.itens){
    //         System.out.printf("- Produto: %s, Quantidade: %d, Valor: %.2f%n", item.produto.nome, item.quantidade, item.calcularSubtotal());

    //     }
    //     System.out.println("---");

    //     System.out.printf("Total do carrinho: %.2f%n", total_pedido);
    //     System.out.println("--- Carrinho ---");
    //     System.out.println("");

    // }

    // public boolean adicionarFormaDePagamento(int  formaPagamento){
    //     switch (formaPagamento) {
    //         case 0:
    //             System.out.println("Pagando em Dinheiro");
            
    //             break;

    //         case 1:
    //             System.out.println("Pagando em Cheque");

    //             break;

    //         case 2:
    //             System.out.println("Pagando em Cartão");
                
    //             break;
        
    //         default:
    //             System.out.println("Erro ao selecionar forma de pagamento");
    //             return false;
    //     }
    //     return true;
    // }

    // public void setItem(Produto p, int qtd) {
    //     itens.add(new ItemPedido(p, qtd));
    // }

    // public double calcularTotal(){
    //     double total = 0;
    //     for(ItemPedido item : this.itens){
    //         total += item.calcularSubtotal();
    //     }

    //     return total;
    // }

}
