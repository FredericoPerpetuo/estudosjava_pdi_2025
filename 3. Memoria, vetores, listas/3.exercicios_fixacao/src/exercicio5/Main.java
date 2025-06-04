package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();

        double[] numeros = new double[qtd];

        for(int i = 0; i < numeros.length; i++){
            sc.nextLine();
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double num = sc.nextDouble();
            numeros[i] = num;
         }

        double maior = 0;
        int indexMaior = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
                indexMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", indexMaior);

        sc.close();
    }
}
