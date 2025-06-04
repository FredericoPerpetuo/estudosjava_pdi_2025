package app;


import entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cliente:  ");
        String nomeCliente = sc.nextLine();
        System.out.print("E-mail:  ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento:  ");
        String dtNasc = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente, email, dtNasc);


        System.out.println("DADOS DO PEDIDO: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Pedido pedido = new Pedido(cliente, StatusPedido.valueOf("PROCESSANDO"));

        System.out.print("Quantidade de itens no pedido: ");
        int qtdItens = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < qtdItens; i++) {
            System.out.println("Dados do " + (i + 1) + "º item: ");
            System.out.print("Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, preco);
            ItemPedido itemPedido = new ItemPedido(quantidade, produto);
            pedido.addItem(itemPedido);
        }

        System.out.println(pedido);

        sc.close();

    }
}