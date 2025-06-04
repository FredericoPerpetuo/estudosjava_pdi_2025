package exercicio7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 0;
        do {
            System.out.printf("Ordem: ");
            tam = sc.nextInt();
            if (tam > 10) {
                System.out.println("A ordem máxima permitida é 10");
            }
        } while (tam > 10);

        double[][] mat = new double[tam][tam];

        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                System.out.printf("Elemento [%d][%d] = ", linha, coluna);
                mat[linha][coluna] = sc.nextDouble();
            }
        }

        double soma = 0;
        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                if (mat[linha][coluna] > 0) {
                    soma += mat[linha][coluna];
                }
            }
        }
        System.out.printf("SOMA DE TODOS OS ELEMENTOS POSITIVOS = %.1f", soma);


        System.out.print("\n\nEscolha uma linha: ");
        int linhaEscolhida = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%.1f   ", mat[linhaEscolhida][i]);
        }

        System.out.print("\n\nEscolha uma coluna: ");
        int colunaEscolhida = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%.1f   ", mat[i][colunaEscolhida]);
        }

        System.out.print("\n\nDIAGONAL PRINCIPAL : ");
        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%.1f   ", mat[i][i]);
        }

        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                if (mat[linha][coluna] < 0) {
                    mat[linha][coluna] = Math.pow(mat[linha][coluna], 2);
                }
            }
        }

        System.out.println("\n\nMATRIZ ALTERADA: ");
        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                System.out.printf("%.1f  ", mat[linha][coluna]);
            }
            System.out.println("");
        }

        sc.close();
    }
}


