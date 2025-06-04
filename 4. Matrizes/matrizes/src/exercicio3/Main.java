package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        do{
            System.out.printf("Número de linhas: ");
            linhas = sc.nextInt();
            if(linhas > 10){
                System.out.println("O número máximo de linhas permitido é 10");
            }
        }while(linhas >10);

        int colunas = 0;
        do{
            System.out.printf("Número de colunas: ");
            colunas = sc.nextInt();
            if(linhas > 10){
                System.out.println("O número máximo de colunas permitido é 10");
            }
        }while(colunas >10);

        int[][] mat = new int[linhas][colunas];


        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna < mat[linha].length; coluna++){
                System.out.printf("Elemento [%d][%d] = ", linha, coluna);
                mat[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS: ");
        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna < mat[linha].length; coluna++){
               if(mat[linha][coluna] < 0){
                   System.out.printf("%d  ", mat[linha][coluna]);
               }
            }
        }



        sc.close();
    }
}
