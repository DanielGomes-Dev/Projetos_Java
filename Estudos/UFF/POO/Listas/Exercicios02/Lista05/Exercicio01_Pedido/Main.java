import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;

import src.mercado.Mercado;
import src.mercado.pedido.Pedido;
import src.cliente.Cliente;
// import src.mercado.pedido.Pedido;

public class Main {    

    public static void main(String[] args){
        System.out.println("Oi");
        Scanner sc = new Scanner(System.in);
        Mercado mercado = new Mercado();
        Cliente cliente = mercado.setCliente(sc);
        Pedido pedido = mercado.setPedido(cliente);
        
        int comprando = 1;
        do {
            mercado.adicionarItemPedido(pedido, sc);
            System.out.printf("Continuar comprando ? %n1-Sim%n0-Não%n");
            comprando = sc.nextInt();
        } while (comprando != 0);

        // mercado.fecharCarrinho(pedido, cliente, sc);

        sc.close();

    }


}
