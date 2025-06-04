package exercicio2;

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

        double[][] mat = new double[linhas][colunas];

        for(int linha = 0; linha < mat.length; linha++){
            System.out.printf("Digite os elementos da %dª linha\n", (linha + 1));
            for(int coluna = 0; coluna < mat[linha].length; coluna++){
                System.out.printf("Elemento[%d][%d] = ", linha , coluna);
                mat[linha][coluna] = sc.nextDouble();
            }
        }

       double[] vet = new double[linhas];

        for(int linha = 0; linha < mat.length; linha++){
            int soma = 0;
            for(int coluna = 0; coluna < mat[linha].length; coluna++){
                soma += mat[linha][coluna];
            }
            vet[linha] = soma;
        }

        for(int i = 0; i < vet.length; i++){
            System.out.printf("%.1f  ", vet[i]);
        }


        sc.close();
    }
}
