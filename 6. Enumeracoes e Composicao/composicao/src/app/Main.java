package app;

import Utils.DevDataUtils;
import entities.Contrato;
import entities.Departamento;
import entities.Trabalhador;
import entities.enumeracao.Nivel;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Departamento: ");
        String nomeDepto = sc.nextLine();
        Departamento depto = new Departamento(nomeDepto.toUpperCase());

        System.out.println("Dados do trabalhador");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nível: ");
        String nivel = sc.nextLine();
        System.out.print("Salario base: ");
        Double slrBase = sc.nextDouble();

        Trabalhador trabalhador =  new Trabalhador(nome, Nivel.valueOf(nivel), slrBase, depto);

        System.out.print("Quantos contratos esse trabalhador possui? ");
        int contratos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < contratos; i++){
            System.out.println("DADOS DO " + (i + 1) + "º CONTRATO: ");
            System.out.print("DATA (DD/MM/YYYY): ");
            String dataStr = sc.nextLine();
            Date data = DevDataUtils.buildDtdiaMesAno(dataStr);
            System.out.print("Valor da hora: ");
            Double vlrHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            sc.nextLine();
            Contrato contrato = new Contrato(data, vlrHora, horas);
            trabalhador.adicionaContrato(contrato);

        }

        System.out.print("Mês e ano para o calculo (MM/YYYY):  ");
        String mesAno = sc.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + depto.getNome());
        System.out.printf("Ganhos para " + mesAno + ": %.2f", trabalhador.vlrRecebidoNoMes(ano, mes));

    }
}