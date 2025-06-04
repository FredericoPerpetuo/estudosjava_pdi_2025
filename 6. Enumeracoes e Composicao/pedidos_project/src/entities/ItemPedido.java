package entities;

import java.text.DecimalFormat;

public class ItemPedido {

    private static DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private Integer quantidade;
    private Produto produto;


    public ItemPedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Double subtotal(){
        return quantidade * produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append(produto.getNome() + ", ");
        sd.append(df.format(produto.getPreco()) + ", ");
        sd.append("Quantidade: "+ quantidade + ", ");
        sd.append("Subtotal: " + df.format(subtotal()) + "\n");
        return sd.toString();
    }
}
