import entities.Product;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Produto: ");
    String name = sc.nextLine();
    System.out.print("Preço: ");
    Double price = sc.nextDouble();
    System.out.print("Quantidade: ");
    int quantity = sc.nextInt();

    Product produto = new Product(name, price, quantity);
    System.out.println(produto);

    System.out.print("Quantos produtos deram entrada: ");
    int qtdEntrada = sc.nextInt();
    produto.addProducts(qtdEntrada);
    System.out.println(produto);

    System.out.print("Quantos produtos deram saída: ");
    int qtdSaida = sc.nextInt();
    produto.removeProducts(qtdSaida);
    System.out.println(produto);
	
	sc.close();

}

