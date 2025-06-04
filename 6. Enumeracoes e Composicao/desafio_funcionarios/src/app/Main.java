package app;


import entities.Colaborador;
import entities.Departamento;
import entities.Endereco;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.print("Departamento: ");
        String nomeDepto = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int diaPgto = sc.nextInt();
        sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telDepto = sc.nextLine();

        Endereco endereco = new Endereco(email,telDepto);
        Departamento depto = new Departamento(nomeDepto,diaPgto,endereco);

        System.out.print("Quantidade de funcionários: ");
        int qtdFunc = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < qtdFunc; i++){
            System.out.print("Nome: ");
            String nomeColaborador = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            sc.nextLine();
            Colaborador colaborador =  new Colaborador(nomeColaborador,salario);
            depto.addColaborador(colaborador);

        }

        mostrarRelatorio(depto);

        sc.close();
    }

    private static void mostrarRelatorio(Departamento depto){
        StringBuilder sb = new StringBuilder();
        sb.append("FOLHA DE PAGAMENTO: \n");
        sb.append("Departamento " + depto.getNome());
        sb.append(" = " + df.format(depto.totalPgtos(depto.getColaboradores())) + "\n");
        sb.append("Pagamento realizado no dia: " + depto.getDiaPgto() + "\n");
        sb.append("Funcionarios: \n" );
        for(Colaborador colaborador : depto.getColaboradores() ){
            sb.append("* " + colaborador.getNome() +  "\n");
        }
        sb.append("Em caso de dúvidas entre em contato: " + depto.getEndereco().getEmail());
        sb.append(" ou " + depto.getEndereco().getTelefone());
        System.out.println(sb.toString());
    }
}