package desafio.entities;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending){
        this.salaryIncome = salaryIncome;
        this.servicesIncome =servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax(){
       double tax = 0.0;
       if(salaryIncome >= (36000.00 + 12) && salaryIncome < (60000.00)){
           tax = salaryIncome * 0.1;
       }else{
           tax = salaryIncome * 0.2;
       }
       return tax;
    }

    public double servicesTax(){
        return servicesIncome * 0.15;
    }

    public double capitalTax(){
        return capitalIncome * 0.2;
    }

    public double grossTax(){
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate(){
        double expenses = healthSpending + educationSpending;
        if(expenses >= grossTax() * 0.3){
            return grossTax() * 0.3;
        }
        return expenses;
    }

    public double netTax(){
        return grossTax() - taxRebate();
    }

    @Override
    public String toString() {
        return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" +
                "Abatimento: " + String.format("%.2f", taxRebate()) + "\n" +
                "Imposto devido: " + String.format("%.2f", netTax())+ "\n";
    }
}
