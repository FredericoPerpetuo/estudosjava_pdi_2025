package exercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serão cadastrados? ");
        int qtdProdutos = sc.nextInt();

        String[] nomes = new String[qtdProdutos];
        double[] precosCompra = new double[qtdProdutos];
        double[] precosVenda = new double[qtdProdutos];


        double totalCompra = 0.0;
        double totalVenda = 0.0;
        for(int i = 0; i < qtdProdutos; i++){
            sc.nextLine();
            System.out.println("PRODUTO " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            nomes[i] = nome;

            System.out.print("Preço compra: ");
            double precoCompra = sc.nextDouble();
            precosCompra[i] = precoCompra;
            totalCompra += precoCompra;

            System.out.print("Preço venda: ");
            double precoVenda = sc.nextDouble();
            precosVenda[i] = precoVenda;
            totalVenda += precoVenda;
        }

        double totalLucro = 0;
        int abaixoDe10PorCento = 0;
        int entre10e20PorCento = 0;
        int acimaDe20Porcento = 0;

        for(int i = 0; i < qtdProdutos; i++){
            double lucro = (precosVenda[i] - precosCompra[i]);
            if(lucro < precosCompra[i] * 0.1){
                abaixoDe10PorCento++;
            }else if(lucro < precosCompra[i] * 0.2){
                entre10e20PorCento++;
            }else{
                acimaDe20Porcento++;
            }
            totalLucro += lucro;
        }

        System.out.println("RELATÓRIO");
        System.out.println("Lucro abaixo de 10%: " + abaixoDe10PorCento);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20PorCento);
        System.out.println("Lucro acima de 20%: " + acimaDe20Porcento);
        System.out.printf("Valor total compra = %.2f\n", totalCompra);
        System.out.printf("Valor total venda = %.2f\n", totalVenda);
        System.out.printf("Valor total lucro = %.2f\n", totalLucro);



        sc.close();
    }
}
