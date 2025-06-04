package entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    private Date data = new Date();
    private Cliente cliente;
    private StatusPedido status;
    private List<ItemPedido> itensPedido = new ArrayList<>();


    public Pedido(Cliente cliente, StatusPedido status) {
        this.cliente = cliente;
        this.status = status;
    }

    public void addItem(ItemPedido itemPedido){
        itensPedido.add(itemPedido);
    }

    public Double total(List<ItemPedido> itensPedido){
        Double total = 0.0;

        for(ItemPedido item : itensPedido){
            total += item.subtotal();
        }

        return total;
    }

    public void itens (StringBuilder sd, List<ItemPedido> itensPedido){
        for(ItemPedido itemPedido : itensPedido){
            sd.append(itemPedido);
        }
    }


    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append("DETALHAMENTO DO PEDIDO: " + "\n");
        sd.append("Data: " + sdf.format(data) + "\n");
        sd.append("Status: " + status + "\n");
        sd.append("Cliente: " + cliente);
        sd.append("Itens do Pedido: " + "\n");
        itens(sd, itensPedido);
        sd.append("Total: " + df.format(total(itensPedido)));
        return sd.toString();
    }
}
