package entities;

/*
* Final na classe impedia que a classe seja herdada
* Final no método, impede que o método seja sobrescrito
* */

public  class ContaPoupanca extends Conta {
    private Double taxaJuros;


    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaJuros ;
    }

    @Override
    public final void sacar(Double vlr){
        saldo -= vlr;
    }
}
