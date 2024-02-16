public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    //Get method
    public double getBaseSalary() { 
        return baseSalary; 
    }

    //Set method
    public void setBaseSalary(double baseSalary) { 
        this.baseSalary = baseSalary; 
    }
}