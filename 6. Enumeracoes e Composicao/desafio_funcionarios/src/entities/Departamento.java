package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private int diaPgto;
    private Endereco endereco;
    private List<Colaborador> colaboradores = new ArrayList<>();


    public Departamento(String nome, int diaPgto, Endereco endereco) {
        this.nome = nome;
        this.diaPgto = diaPgto;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaPgto() {
        return diaPgto;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void addColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
    }

    public Double totalPgtos(List<Colaborador> colaboradores){
        Double total = 0.0;
        for(Colaborador colaborador : colaboradores){
            total += colaborador.getSalario();
        }
        return total;
    }
}
