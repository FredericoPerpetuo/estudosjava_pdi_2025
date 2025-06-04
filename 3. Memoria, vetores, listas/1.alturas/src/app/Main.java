package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int qtdPessoas = sc.nextInt();
        double [] vetAlturas = new double[qtdPessoas];

        double soma = 0;

        for(int i = 0; i < qtdPessoas; i++){
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            vetAlturas[i] = altura;
            soma += altura;
        }

        double media = soma / qtdPessoas;
        System.out.printf("Media das alturas = %.2f", media);

        sc.close();



    }
}