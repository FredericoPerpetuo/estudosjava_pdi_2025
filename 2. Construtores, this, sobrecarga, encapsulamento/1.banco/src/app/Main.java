package app;

import entities.Conta;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        System.out.print("Conta: ");
        String numConta = sc.nextLine();
        System.out.print("Haverá depósito inicial? ");
        char depositoInicial = sc.next().charAt(0);

        if(depositoInicial == 's'){
            System.out.print("Valor do depósito R$ ");
            double vlrDeposito = sc.nextDouble();
            conta = new Conta(titular, numConta, vlrDeposito);
        }else{
            conta = new Conta(titular, numConta);
        }

        System.out.println(conta);

        System.out.print("Valor deposito R$ ");
        double vlrDeposito = sc.nextDouble();
        conta.deposista(vlrDeposito);
        System.out.println(conta);

        System.out.print("Valor saque R$ ");
        double vlrSaque = sc.nextDouble();
        conta.saca(vlrSaque);
        System.out.println(conta);

        sc.close();

    }
}