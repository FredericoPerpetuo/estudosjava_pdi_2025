package app;


import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do dólar: ");
        Double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados: ");
        Double amount = sc.nextDouble();

        Double amountPaid = CurrencyConverter.corvertToReais(amount, dollarPrice);
        System.out.println("Valor a ser pago em reais: " + String.format("%.2f", amountPaid));
    }
}