package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        do{
            System.out.printf("Ordem: ");
            linhas = sc.nextInt();
            if(linhas > 10){
                System.out.println("A ordem máxima aceita é 10");
            }
        }while(linhas > 10);

        int colunas = 0;
        do{
            System.out.printf("Número de colunas: ");
            colunas = sc.nextInt();
            if(linhas > 10){
                System.out.println("O número máximo de colunas permitido é 10");
            }
        }while(colunas > 10);

        int[][] matA = new int[linhas][colunas];
        int[][] matB = new int[linhas][colunas];
        int[][] matC = new int[linhas][colunas];

        System.out.println("ELMENTOS DA MATRIZ A");
        for(int linha = 0; linha < matA.length; linha++){
            for(int coluna = 0; coluna < matA[linha].length; coluna++){
                System.out.printf("Elemento [%d][%d] = ", linha, coluna);
                matA[linha][coluna] = sc.nextInt();
            }
        }


        System.out.println("\nELMENTOS DA MATRIZ B");
        for(int linha = 0; linha < matB.length; linha++){
            for(int coluna = 0; coluna < matB[linha].length; coluna++){
                System.out.printf("Elemento [%d][%d] = ", linha, coluna);
                matB[linha][coluna] = sc.nextInt();
            }
        }


        for(int linha = 0; linha < matC.length; linha++){
            for(int coluna = 0; coluna < matC[linha].length; coluna++){
                matC[linha][coluna] = (matA[linha][coluna]) + (matB[linha][coluna]);
            }
        }

        System.out.println("MATRIZ SOMA");
        for(int linha = 0; linha < matC.length; linha++){
            for(int coluna = 0; coluna < matC[linha].length; coluna++){
                System.out.printf("%d  ", matC[linha][coluna]);
            }
            System.out.print("\n");
        }

        sc.close();
    }
}

