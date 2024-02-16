public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    //Get method
    public double getWeeklySalary() { 
        return weeklySalary; 
    }

    //Set method
    public void setWeeklySalary(double weeklySalary) { 
        this.weeklySalary = weeklySalary; 
    }
}
