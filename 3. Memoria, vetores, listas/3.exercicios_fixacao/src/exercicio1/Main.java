package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        do {
            System.out.print("Quantos números você vai digitar? ");
            qtd = sc.nextInt();

            if(qtd <= 0){
                System.out.println("A quantidade de números deve ser maior que zero");
            }
            if(qtd > 0) {
                System.out.println("A quantidade de números deve ser menor ou igual a 10");
            }
        }while(qtd <= 0 || qtd > 10);

        int[] numeros = new int[qtd];

        for(int i = 0; i < numeros.length; i++){
            sc.nextLine();
            System.out.print("Digite " + (i + 1) + "º número: ");
            int num = sc.nextInt();
            numeros[i] = num;
        }

        System.out.print("Números negativos: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < 1){
                System.out.print(numeros[i] + "  ");
            }
        }

        sc.close();
    }
}