package entities;

import java.util.Date;

public class Contrato {
    private Date data;
    private Double vlrHora;
    private Integer horas;


    public Contrato(Date data, Double vlrHora, Integer horas) {
        this.data = data;
        this.vlrHora = vlrHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public Double valorTotal(){
        return horas * vlrHora;
    }

}
