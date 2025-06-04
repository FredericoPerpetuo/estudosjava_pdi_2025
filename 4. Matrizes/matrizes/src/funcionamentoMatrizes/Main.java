package funcionamentoMatrizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o elemento da linha " + linha + " coluna " + coluna);
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.print("\n");
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "  ");

        }


        int qtdNegativos = 0;
        for (int linha = 0; linha < matriz.length ; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (matriz[linha][coluna] < 0) {
                    qtdNegativos++;
                }
            }

        }

        System.out.println("\nQUANTIDADE DE NEGATIVOS : " + qtdNegativos);

        sc.close();
    }
}
