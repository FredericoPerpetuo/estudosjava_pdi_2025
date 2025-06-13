package app;

import entities.Conta;
import entities.ContaPoupanca;

public class IntroducaoPolimorfismo {
    public static void main(String[] args) {
        //Essa classe foi criada apenas com finalidade didática para exemplificar o conceito de polimorfismo

        Conta c = new Conta(1111, "João", 1000.0);
        Conta cp = new ContaPoupanca(2222, "Maria", 1000.0, 0.01);

        c.sacar(50.0);
        cp.sacar(50.0);

        /*
        * Os dois objetos foram instanciados como Conta, mas receberam construtores distintos,
        * por isso, o comportamento do método saque será diferente para cada um deles
        * */

        System.out.println("Saldo c = " + c.getSaldo());
        System.out.println("Saldo cp = " + cp.getSaldo());
    }
}
