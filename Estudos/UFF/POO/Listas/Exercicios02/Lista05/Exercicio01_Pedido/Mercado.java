import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado {

    private List<Produto> produtos = new ArrayList<>();

    private void init_products(){

        Produto produto_01 = new Produto("Arroz", 25.00f, 160);
        Produto produto_02 = new Produto("Feijao", 15.00f, 123);
        produtos.add(produto_01);
        produtos.add(produto_02);
    }

    private int calculateQuantidadeDisponivelProduto(Produto produto, Pedido pedido){
        List<ItemPedido> itens = pedido.getItens();
        int quantidade_no_carrinho = 0;
        for (ItemPedido item : itens) {
            Produto produto_carrinho = item.produto;
            if(produto_carrinho.nome == produto.nome){
                quantidade_no_carrinho += item.quantidade;
            }
        }

        int quantidade_disponivel = produto.quantidadeEstoque - quantidade_no_carrinho; 

        return quantidade_disponivel;
    }

    private void listProducts(Pedido pedido){
        System.out.println("---");
        System.out.println("Produtos Disponiveis:");
        
        for (int id = 0; id < produtos.size() ; ++id){
            Produto produto = produtos.get(id);
            int quantidade_disponivel = calculateQuantidadeDisponivelProduto(produto, pedido);
            System.out.printf("Code: %d, Produto: %s, Valor: %.2f, Estoque: %d%n", id+1, produto.nome, produto.preco, quantidade_disponivel);
        }
        System.out.println("---");


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


    public Cliente setCliente(Scanner sc){

        System.out.println("Digite o nome do Cliente que vai realizar a compra: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o CPF do Cliente: ");
        String cpfCliente = sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        return cliente;
    }

    public Pedido createPedido(Cliente cliente){
        Pedido pedido = new Pedido(cliente);
        return pedido;
    }

    


    private Produto getProdutoDoEstoque(Pedido pedido, Scanner sc){
        Produto produto_to_add_carrinho = null;
        do {    
            System.out.println("---");
            this.listProducts(pedido);
            System.out.println("");
            System.out.println("Digite o Codigo do produto que deseja comprar: ");
            int code = sc.nextInt();
            if (code > 0 && code <= this.produtos.size()) {
                produto_to_add_carrinho = this.produtos.get(code - 1);
            } else {
                System.out.println("Código inválido! Por favor, digite um código entre 1 e " + produtos.size());
            }
        } while (produto_to_add_carrinho == null);

        return produto_to_add_carrinho;
    }

    private boolean verificaProdutoEstoque(Pedido pedido, Produto produto, int quantidade){
        int quantidadeDisponivel = calculateQuantidadeDisponivelProduto(produto, pedido);
        return quantidadeDisponivel >= quantidade && quantidade > 0;
    }


    public void adicionarItemPedido(Pedido pedido, Scanner sc){

        Produto produto = getProdutoDoEstoque(pedido, sc);

        boolean temEstoque = false;
        int quantidade;
        do {
            System.out.println("Digite a quantidade do produto que deseja comprar: "); // Verificar Se a quantidade esta disponivel

            quantidade = sc.nextInt();
            temEstoque = this.verificaProdutoEstoque(pedido, produto, quantidade);
            if(!temEstoque){
                System.out.println("Quantidade Invalida ou Fora de Estoque!"); // Verificar Se a quantidade esta disponivel
                
            }

        } while (!temEstoque);


        pedido.adicionarItem(produto, quantidade);
        pedido.imprimeCarrinho();
    }

    public void fecharCarrinho(Pedido pedido, Cliente cliente, Scanner sc){

        pedido.imprimeCarrinho();
        
        this.selecionarFormaPagamento(pedido, sc);

        System.out.println("Compra Finalizada Obrigado " + cliente.nome);
        pedido.removerEstoque();
        Pedido pedido_clear = new Pedido(cliente);
        
        System.out.println("");
        System.out.println("Estoque Atualizado: ");
        System.out.println("");
        this.listProducts(pedido_clear);

    }



    public Mercado(){
        this.init_products();
    }

}



