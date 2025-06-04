package app;

import entities.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário base: ");
        Double slrBase = sc.nextDouble();

        System.out.print("Tempo de casa: ");
        int tempoDeCasa = sc.nextInt();

        Funcionario funcionario = new Funcionario(nome, slrBase, tempoDeCasa);

        System.out.println(funcionario);
        
		sc.close();

    }
}