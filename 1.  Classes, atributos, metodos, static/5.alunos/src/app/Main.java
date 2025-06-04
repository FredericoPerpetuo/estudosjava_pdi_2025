package app;

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nota 1: ");
        Double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        Double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        Double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        Double notaFinal = aluno.getNotaFinal();

        System.out.println(aluno);

        if(notaFinal >= 60){
            System.out.println("Aprovado");
        }else{
            System.out.print("Reprovado");
        }

        sc.close();

    }
}