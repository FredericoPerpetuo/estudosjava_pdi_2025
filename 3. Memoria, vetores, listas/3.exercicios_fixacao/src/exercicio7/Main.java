package exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int tam = sc.nextInt();
        double[] numeros = new double[tam];

        double soma = 0.0;
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: " );
            double num = sc.nextDouble();
            numeros[i] = num;
            soma += num;
        }

        double media = soma/numeros.length;
        System.out.printf("MÉDIA = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < media){
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
