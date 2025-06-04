package exercicio6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 0;
        do {
            System.out.printf("Número de linhas: ");
            tam = sc.nextInt();
            if (tam > 10) {
                System.out.println("O número máximo de linhas permitido é 10");
            }
        } while (tam > 10);

        int[][] mat = new int[tam][tam];

        for (int linha = 0; linha < mat.length; linha++) {
            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
                System.out.printf("Elemento [%d][%d] = ", linha, coluna);
                mat[linha][coluna] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i < j){
                    soma += mat[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL =  %d", soma);


        sc.close();
    }
}

