package desafio.main;

import desafio.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayersList = new ArrayList<>();

        System.out.print("Quantos contribuintes serão cadastrados? ");
        int taxPayers = sc.nextInt();

        for(int i = 0; i < taxPayers; i++){
            System.out.println("DADOS DO " + ( i + 1) + "º CONTRIBUINTE");
            System.out.print("Salário anual: ");
            double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviços: ");
            double servicesIncome = sc.nextDouble();
            System.out.print("Rendas anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            TaxPayer taxPayer = new TaxPayer(salary, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayersList.add(taxPayer);
        }

        for(int i = 0; i < taxPayers; i++){
            System.out.println("Resumo " + (i + 1) + "º contribuinte");
            System.out.println(taxPayersList.get(i).toString());
        }

        sc.close();
    }
}
