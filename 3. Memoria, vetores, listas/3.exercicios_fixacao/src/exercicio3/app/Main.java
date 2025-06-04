package exercicio3.app;

import exercicio3.entities.Pessoa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão cadastradas? ");
        int qtd = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[qtd];


        for(int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.println("DADOS DA " + (i + 1) + "ª PESSOA: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            byte idade = sc.nextByte();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            pessoas[i] = pessoa;
            System.out.println("--------------------------------");
        }

        double somaAlturas = 0.0;
        int menores16 = 0;

        for(int i = 0; i < pessoas.length; i++){
            somaAlturas += pessoas[i].getAltura();
        }

        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                menores16++;
            }
        }

        System.out.printf("Altura média = %.2f\n", somaAlturas / pessoas.length);
        System.out.printf("Menos de 16 anos = %.2f%%\n", (menores16 * 100.0) / pessoas.length);

        for(int i = 0; i <pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }
        sc.close();
    }
}