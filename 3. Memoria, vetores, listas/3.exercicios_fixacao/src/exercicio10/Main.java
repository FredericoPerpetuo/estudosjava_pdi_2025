package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int tam = sc.nextInt();

        String[] nomes = new String[tam];
        double[] notasPrimeiroSemestre = new double[tam];
        double[] notasSegundoSemestre = new double[tam];


        for(int i = 0; i < tam; i++){
            sc.nextLine();
            System.out.println("Digite o nome e as notas do " + (i  + 1)+ "º aluno: ");
            String nome = sc.nextLine();
            nomes[i] = nome;
            double nota1 = sc.nextDouble();
            notasPrimeiroSemestre[i] = nota1;
            double nota2 = sc.nextDouble();
            notasSegundoSemestre[i] = nota2;
        }

        for(int i = 0; i < tam; i++){
            double media = (notasPrimeiroSemestre[i] + notasSegundoSemestre[i])/ 2;
            if(media >= 6){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
