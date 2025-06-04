package exercicio9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas serão inseridas? ");
        int tam = sc.nextInt();

        String[] nomes = new String[tam];
        int[] idades = new int[tam];


        for(int i = 0; i < tam; i++ ){
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "ª pessoa:" );
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            nomes[i] = nome;
            idades[i] = idade;
        }

        int maisVelho = 0;
        for(int i = 0; i < tam; i++){
            if(idades[i] > maisVelho){
                maisVelho = idades[i];
            }
        }

        String nome = null;
        for(int i = 0; i < tam; i++){
            if(idades[i] == maisVelho){
                nome = nomes[i];
            }
        }

        System.out.print("Pessoa mais velha: " + nome);

        sc.close();

    }
}
