package entities;

public class Colaborador {

    private String nome;
    private Double salario;


    public Colaborador(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
}
