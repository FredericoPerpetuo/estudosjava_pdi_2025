package entities;

public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int soda;

    public Bill(char gender, int beer, int barbecue, int soda){
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.soda = soda;
    }

    public Double cover(){
        Double value = 4.0;
        if(totalFeeding() > 30.0){
            value = 0.0;
        }
        return value;
    }

    public Double totalBeer(){
        return beer * 5.0;
    }

    public Double totalSoda(){
        return soda * 3.0;
    }

    public Double totalBarbecue(){
        return barbecue * 7.0;
    }

    public Double ticket(){
        if(gender == 'M' || gender == 'm'){
            return 10.0;
        }else{
            return 8.0;
        }
    }

    public Double totalFeeding(){
        return totalBeer() + totalSoda() + totalBarbecue();
    }

    public Double total(){
        return cover() + totalFeeding() + ticket();
    }

    @Override
    public String toString() {
        return "Ingresso -----------------------" + String.format("R$%.2f", ticket()) + "\n" +
                "Cover---------------------------" + String.format("R$%.2f", cover()) + "\n" +
                beer + " cervejas ---------------------" + String.format("R$%.2f", totalBeer()) + "\n" +
                soda + " Refris------------------------" + String.format("R$%.2f", totalSoda()) + "\n" +
                barbecue + " Espetinhos--------------------" + String.format("R$%.2f", totalBarbecue()) + "\n" +
                "TOTAL---------------------------" + String.format("R$%.2f", total()) + "\n";

    }
}
