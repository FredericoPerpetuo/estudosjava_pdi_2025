package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão cadastrados? ");
        int qtd = sc.nextInt();

        int[] numeros = new int[qtd];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "ª número: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        System.out.print("NÚMEROS PARES: ");
        int qtdNumerosPares = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                qtdNumerosPares++;
                System.out.print(numeros[i] + "   ");
            }
        }

        System.out.printf("\nQUANDADE DE PARES = %d", qtdNumerosPares);

        sc.close();
    }
}