package app;

import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário bruto: ");
        Double grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        Double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        System.out.println(employee);

        System.out.print("Porcentagem de aumento: ");
        Double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);
		
		sc.close();

    }
}