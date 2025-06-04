package app;

import entities.Bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Cervejas: ");
        int cerveja = sc.nextInt();

        System.out.print("Refris: ");
        int refri = sc.nextInt();

        System.out.print("Espetinhos: ");
        int espetinho = sc.nextInt();

        Bill bill = new Bill(sexo, cerveja, espetinho, refri);

        System.out.println(bill);

        sc.close();

    }
}