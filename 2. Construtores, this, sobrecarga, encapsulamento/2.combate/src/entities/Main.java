package entities;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dados do primeiro campeão:");
        Champion champion1 = makeChampion();

        System.out.println("\nDados do segundo campeão:");
        Champion champion2 = makeChampion();

        System.out.print("\nQuantos turnos você deseja executar? ");
        int turnos = sc.nextInt();

        geraTurnos(turnos, champion1, champion2);

        System.out.println("FIM DO COMBATE");

        sc.close();

    }
    public static Champion makeChampion(){
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vida = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura = sc.nextInt();
        sc.nextLine();

        return new Champion(nome, vida, ataque, armadura);

    }

    public static void geraTurnos(int turnos, Champion champion1, Champion champion2){
        for(int i = 0; i < turnos; i++){
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println("Resultado turno " + (i + 1) + ":");
            System.out.println(champion1.status());
            System.out.println(champion2.status());
            System.out.print("\n");

            if(champion1.getLife() <= 0 || champion2.getLife() <= 0){
                break;
            }
        }
    }

}