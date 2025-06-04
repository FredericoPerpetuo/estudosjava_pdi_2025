package exercicio11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int tam = sc.nextInt();

        double[] alturas = new double[tam];
        char[] generos = new char[tam];
        for(int i = 0; i < tam; i++){
            sc.nextLine();
            System.out.println("DADOS DA " + ( i + 1) + "ª PESSOA:" );
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            alturas[i] = altura;
            System.out.print("Gênero: ");
            char genero = sc.next().charAt(0);
            generos[i] = genero;
        }


        double menor = alturas[0];
        for(int i = 0; i < tam; i++){
            if(alturas[i] < menor){
                menor = alturas[i];
            }
        }
        System.out.printf("MENOR ALTURA = %.2f\n", menor );

        double maior = 0.0;
        for(int i = 0; i < tam; i++){
            if(alturas[i] > maior){
                maior = alturas[i];
            }
        }
        System.out.printf("MAIOR ALTURA = %.2f\n", maior );

        double soma = 0.0;
        int qtdMulheres = 0;
        for(int i = 0; i < tam; i++){
            if(generos[i] == 'M'){
                soma += alturas[i];
                qtdMulheres++;
            }
        }

        if(qtdMulheres != 0){
            System.out.printf("MÉDIA DA ALTURA DAS MULHERES = %.2f\n", soma / qtdMulheres);
        }

        int qtdHomens = 0;
        for(int i = 0; i < tam; i++){
            if(generos[i] == 'M'){
                qtdHomens++;
            }
        }
        System.out.printf("NÚMERO DE HOMENS =  %d", qtdHomens);

    }
}
