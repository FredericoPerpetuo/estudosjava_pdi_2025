package app;


import entities.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Largura: ");
        Double width = sc.nextDouble();

        System.out.print("Altura: ");
        Double height = sc.nextDouble();

        Retangulo retangulo = new Retangulo(width, height);
        System.out.println(retangulo);
		
		sc.close();

    }
}