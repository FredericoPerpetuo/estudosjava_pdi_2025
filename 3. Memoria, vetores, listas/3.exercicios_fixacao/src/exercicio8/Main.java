package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor? ");
        int tam = sc.nextInt();

        int[] numeros = new int[tam];
        int contaPares = 0;
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            int num = sc.nextInt();
            numeros[i] = num;
            if(num % 2 == 0){
                soma += num;
                contaPares++;
            }
        }



        if(contaPares == 0){
            System.out.println("NENHUM NÚMERO PAR FOI INSERIDO!!!");
        } else{
            double media = soma / contaPares;
            System.out.printf("MÉDIA PARES = %.1f", media);
        }

        sc.close();
    }
}
