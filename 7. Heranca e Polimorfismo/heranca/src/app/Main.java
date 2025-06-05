package app;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Fulano", 0.0);
        ContaComercial contaComercial = new ContaComercial(1002, "Ciclano", 0.0, 500.0);
        ContaPoupanca contaPoupanca =  new ContaPoupanca(1003, "Beltrano", 0.0, 0.01);


       /*UPCASTING
       * Fazer cast da classe filha para a classe mãe
       * Exemplo: atribuir um objeto ContaComercial ou ContaPoupança a um objeto Conta
       * Funciona perfeitamente e inclusive é a base do polimorfismo
       * */
        Conta c1 = contaComercial;
        Conta c2 = contaPoupanca;

        /*DOWNCASTING
        * Fazer casting da classe mãe para a classe filha
        * O casting deverá ser forçado, não poderá ser uma simples atribuição.
        * Pode gerar uma ClassCastException
        * */

        //ContaComercial contaComercialTeste = (ContaComercial) conta; irá gerar um ClassCastException

        Conta cc1 = new ContaComercial(1005, "Empresa XPTO", 0.0, 200.0);
        ContaComercial cc2 = (ContaComercial) cc1;//é necessário forçar o casting

        //Para checar a instância de um objeto, usamos o métoso instanceOf
        System.out.println("cc2 é uma instância de ContaComercial: " + (cc2 instanceof ContaComercial));
        System.out.println("c1 é uma instância de ContaPoupança: " + (cc1 instanceof ContaPoupanca));

    }
}