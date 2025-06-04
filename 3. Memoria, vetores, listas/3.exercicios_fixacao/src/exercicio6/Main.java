package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores teremos em cada vetor? ");
        int qtd = sc.nextInt();

        int[] vetorA = new int[qtd];
        int[] vetorB = new int[qtd];
        int[] vetorSomaAB = new int[qtd];


        System.out.println("DIGITE OS VALORES DO VETOR A: ");
        for(int i = 0; i < vetorA.length; i++){
            sc.nextLine();
            System.out.print("vetorA[" + i + "]: ");
            int num = sc.nextInt();
            vetorA[i] = num;
        }

        System.out.println("DIGITE OS VALORES DO VETOR B: ");
        for(int i = 0; i < vetorB.length; i++){
            sc.nextLine();
            System.out.print("vetorB[" + i + "]: ");
            int num = sc.nextInt();
            vetorB[i] = num;
        }

        for(int i = 0; i < vetorB.length; i++){
            vetorSomaAB[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR SOMA: ");
        for(int i = 0; i < vetorSomaAB.length; i++){
            System.out.printf("vetorSoma[" + i + "] = %d\n", vetorSomaAB[i]);
        }

    }
}
