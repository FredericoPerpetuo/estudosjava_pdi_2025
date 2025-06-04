package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 0;
        do {
            System.out.print("Ordem da matriz: ");
            tam = sc.nextInt();
            if (tam > 10) {
                System.out.println("O tamanho máximo permitido é 10");
            }
        } while (tam > 10);

        int[][] matriz =  new int[tam][tam];
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print("Elemento [" + linha + "," + coluna + "]: ");
                int elemento = sc.nextInt();
                matriz[linha][coluna] = elemento;
            }
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i = 0; i < tam; i++){
            System.out.print(matriz[i][i] + "  ");
        }

        int countNegativos = 0;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna] < 0){
                    countNegativos++;
                }
            }
        }

        System.out.printf("\nQuantidade de negativos: %d", countNegativos);

        sc.close();
    }
}
