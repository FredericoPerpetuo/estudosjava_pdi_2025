package entities;

public class Conta {
    private String titular;
    private String numConta;
    private double saldo;

    public Conta(String titular, String numConta, double depositoInicial){
        this.titular = titular;
        this.numConta = numConta;
        deposista(depositoInicial);
    }

    public Conta(String titular, String numConta){
        this.titular = titular;
        this.numConta = numConta;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public String getNumConta(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposista(double vlr){
        saldo += vlr;
    }

    public void saca(double vlr){
        saldo -= (vlr + 5.0);
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\n" +
                "Conta: " + numConta + "\n" +
                "Saldo: R$" + String.format("%.2f", saldo) + "\n";
    }
}
