package app;


import entities.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        System.out.print("Quantidade de produtos: ");
        int qtdProdutos = sc.nextInt();


        Produto[] produtos = new Produto[qtdProdutos];

        for(int i = 0; i < produtos.length; i++){
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: R$");
            double preco = sc.nextDouble();
            Produto produto = new Produto(nome, preco);
            produtos[i] = produto;
            soma += produto.getPreco();
        }

        System.out.printf("Média = R$%.2f", soma/produtos.length);
        sc.close();
    }
}