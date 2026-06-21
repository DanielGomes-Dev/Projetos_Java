package src.mercado;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import src.cliente;
// import src.cliente.Cliente;
import src.mercado.produto.Produto;

import java.util.List;
import java.util.Scanner;

import src.cliente.Cliente;
import src.mercado.estoque.Estoque;
import src.mercado.estoque.produto_estoque.ProdutoEstoque;
import src.mercado.pedido.Pedido;

// import src.mercado.pedido.item.ItemPedido;


public class Mercado {

    private Estoque estoque;

    public Mercado(){
        System.out.println("\n-----------\n");
        System.out.println("Abrindo Novo Mercado");
        System.out.println("\n-----------\n");

        Produto produto_01 = new Produto("Arroz", 25.00f);
        Produto produto_02 = new Produto("Feijao", 15.00f);

        this.estoque = new Estoque();

        estoque.setProdutosEstoque(produto_01, 10);
        estoque.setProdutosEstoque(produto_02, 20);

        
    }


    public Cliente setCliente(Scanner sc){

        System.out.println("Digite o nome do Cliente que vai realizar a compra: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o CPF do Cliente: ");
        String cpfCliente = sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        return cliente;
    }




    private void selecionarFormaPagamento(Pedido pedido, Scanner sc){


        boolean formaPagamentoSelecionada = false;

        while (!formaPagamentoSelecionada){
            System.out.println("---");
            System.out.println("Escolha a forma de pagamento: ");

            for (String formasPagamento : pedido.formasPagamentos){
                System.out.println(formasPagamento);
            }
            System.out.println("---");

            int formaPagamento = sc.nextInt();
            formaPagamentoSelecionada = pedido.adicionarFormaDePagamento(formaPagamento);

        }

    }




    public Pedido setPedido(Cliente cliente){
        Pedido pedido = new Pedido(cliente);
        return pedido;
    }

    
    public void listProdutosEstoque(){
        List<ProdutoEstoque> produtosEstoque = this.getProdutosDoEstoque();

        System.out.println("--- Estoque Produtos ---");
        System.out.println();
        int count = 1;
        for (ProdutoEstoque produtoEstoque : produtosEstoque) {
            System.out.printf("Code: %d - Nome: %s - Preço: %.2f - Quantidade: %d \n", 
            count,
            produtoEstoque.produto.getNomeProduto(), 
            produtoEstoque.produto.getPrecoProduto(),
            produtoEstoque.quantidade
        );

        count++;
        }

            System.out.println();
            System.out.println("--- Fim Estoque Produtos ---");
            System.out.println();

    }

    private List<ProdutoEstoque> getProdutosDoEstoque(){
        return this.estoque.getProdutosEstoque();
    }

    public ProdutoEstoque getProdutoDoEstoqueByCode(int code){
        return this.getProdutosDoEstoque().get(code - 1);
    }
    

    public void setItemPedido(Pedido pedido, ProdutoEstoque produtoEstoque, int quantidade, Scanner sc){

        if(produtoEstoque.quantidade < quantidade){
            System.out.println("Erro: produtos insuficiente");
        }
        else{
            produtoEstoque.quantidade = produtoEstoque.quantidade - quantidade;
            pedido.setItemPedido(produtoEstoque.produto, quantidade);
        }
    }

    public void fecharCarrinho(Pedido pedido, Cliente cliente, Scanner sc){

        pedido.imprimeCarrinho();
        
        this.selecionarFormaPagamento(pedido, sc);

        System.out.println("Compra Finalizada Obrigado " + cliente.nome);
        
    }



}



