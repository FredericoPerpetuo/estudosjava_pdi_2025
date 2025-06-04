package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();
        double[] numeros =  new double[qtd];
        double soma = 0.0;

        StringBuilder stringBuilder =  new StringBuilder();

        for(int i = 0; i < numeros.length; i++){
            sc.nextLine();
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double num = sc.nextDouble();
            numeros[i] = num;
            soma += num;
            stringBuilder.append(numeros[i] + ", ");
        }

        String vetor = stringBuilder.toString();

        System.out.print("Vetor: [" + vetor.substring(0, (vetor.length()-2)) + "]");
        System.out.printf("\nSoma =  %.2f", soma );
        System.out.printf("\nMédia =  %.2f", soma / numeros.length );
        sc.close();
    }
}