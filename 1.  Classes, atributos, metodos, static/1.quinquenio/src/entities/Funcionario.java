package entities;

public class Funcionario {

    private String nome;
    private Double slrBase;
    private int tempoDeCasa;

    public Funcionario(String nome, Double slrBase, int tempoDeCasa) {
        this.nome = nome;
        this.slrBase = slrBase;
        this.tempoDeCasa = tempoDeCasa;
    }

    public Double calculaQuinquenio() {
        return (tempoDeCasa / 5) * 0.03 * slrBase;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "\n" +
                "Salário base: R$" + slrBase + "\n" +
                "Tempo de casa: " + tempoDeCasa + "\n" +
                "Quiquênio: " + calculaQuinquenio() + "\n";
    }
}
