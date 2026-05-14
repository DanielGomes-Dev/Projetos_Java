import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado {

    public List<Produto> produtos = new ArrayList<>();

    public Mercado(){

        Produto produto_01 = new Produto("Arroz", 25.00f, 160);
        Produto produto_02 = new Produto("Feijao", 15.00f, 123);

        produtos.add(produto_01);
        produtos.add(produto_02);


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do Cliente que vai realizar a compra: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o cpf do Cliente que vai realizar a compra: ");
        String cpfCliente = sc.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        Pedido pedido = new Pedido(cliente);

        boolean comprando = true;

        System.out.println("Produtos Disponiveis:");
        while (comprando){
        
            System.out.println("");

            for (int id = 0; id < produtos.size() ; ++id){
                Produto produto = produtos.get(id);
                System.out.printf("Code: %d, Produto: %s, Valor: %.2f, Estoque: %d%n", id+1, produto.nome, produto.preco, produto.quantidadeEstoque);
            }

            System.out.println("Digite o Codigo do produto que deseja comprar e a quantidade: ");
            System.out.println("ou digite 0 0 para sair e fechar a compra: ");

            int code = sc.nextInt();
            int quantidade = sc.nextInt();

            if (code == 0){
                comprando = false;
                break;
            }
            

            Produto produto_to_add_carrinho = produtos.get(code-1);
            pedido.adicionarItem(produto_to_add_carrinho, quantidade);
            double total_pedido = pedido.calcularTotal();
            System.out.printf("Total do carrinho: %.2f%n", total_pedido);

            for(ItemPedido item : pedido.itens){
                System.out.printf("Produto: %s, Quantidade: %d%n", item.produto.nome, item.quantidade);
            }


        }

        System.out.println("Escolha a forma de pagamento: ");
        for (String formasPagamento : pedido.formasPagamentos){
            System.out.println(formasPagamento);
        }
        System.out.println("");


        boolean formaPagamentoSelecionada = false;
        while (!formaPagamentoSelecionada){
            String formaPagamento = sc.nextLine();
            formaPagamentoSelecionada = pedido.adicionarFormaDePagamento(formaPagamento);
        }

        pedido.fecharPedido();
        
        System.out.println("Compra Finalizada Obrigado " + cliente.nome);
        System.out.printf("Total pedido: %.2f%n", pedido.calcularTotal());

        for (int id = 0; id < produtos.size() ; ++id){
                Produto produto = produtos.get(id);
                System.out.printf("Code: %d, Produto: %s, Valor: %.2f, Estoque: %d%n", id+1, produto.nome, produto.preco, produto.quantidadeEstoque);
        }


    }

    public static void main(String[] args){
        Mercado mercado = new Mercado();
    }

}



