package entities;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;

    public Aluno(String nome, Double nota1, Double nota2, Double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Double getNotaFinal(){
        return nota1 + nota2 + nota3;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Nota 1: " + String.format("%.2f", nota1) + "\n" +
                "Nota 2: " + String.format("%.2f", nota2) + "\n" +
                "Nota 3: " + String.format("%.2f", nota3) + "\n" +
                "Nota Final: " + String.format("%.2f", getNotaFinal());
    }
}
