package exercicio3.entities;

public class Pessoa {
    private String nome;
    private byte idade;
    private double altura;

    public Pessoa(String nome, byte idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public byte getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
