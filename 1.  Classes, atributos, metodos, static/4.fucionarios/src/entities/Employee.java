package entities;

public class Employee {
    private String name;
    private Double grossSalary;
    private Double tax;

    public Employee(String name, Double grossSalary, Double tax){
        this.name = name;
        this. grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(Double percentage){
        grossSalary += (percentage/100) * grossSalary;
    }

    @Override
    public String toString() {
        return "NOME: " +  name + "\n" +
                "SALÁRIO: " + String.format("%.2f", netSalary());
    }
}
