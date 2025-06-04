package entities;

public class Product {
    private String name;
    private Double price;
    private int quantity;


    public Product (String name, Double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Produto: " + name + "\n" +
                "Preço: R$" + String.format("%.2f", price) + "\n" +
                "Quantidade em estoque: " + quantity + "\n" +
                "Valor total em estoque: " + String.format("%.2f",totalValueInStock()) + "\n";
    }
}
