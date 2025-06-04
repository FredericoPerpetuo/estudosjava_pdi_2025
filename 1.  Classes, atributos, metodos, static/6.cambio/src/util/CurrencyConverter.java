package util;

public class CurrencyConverter {

    public static final Double IOF = 0.06;

    public static Double corvertToReais(Double amount, Double dollarPrice){

        return amount * dollarPrice * (1.0 + IOF);
    }
}
