package entities;

import entities.enumeracao.Nivel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private Nivel nivel;
    private Double slrBase;
    private Departamento depto;
    private List<Contrato> contratos = new ArrayList<>();

    public Trabalhador(String nome, Nivel nivel, Double slrBase, Departamento depto) {
        this.nome = nome;
        this.nivel = nivel;
        this.slrBase = slrBase;
        this.depto = depto;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato){
        contratos.remove(contrato);
    }

    public Double vlrRecebidoNoMes(int year, int mes){
        Double sum = slrBase;
        Calendar calendar = Calendar.getInstance();
        for(Contrato contrato : contratos){
            calendar.setTime(contrato.getData());
            if( (1 + calendar.get(Calendar.MONTH)) == mes && calendar.get(Calendar.YEAR) == year){
                sum += contrato.valorTotal();
            }
        }
        return sum;
    }
}
