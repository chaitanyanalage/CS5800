public class CommisionEmployee extends Employee {
    private double commissionRate;

    
    private double grossSalary; 

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;

        //grossSales converted into grossSalary
        this.grossSalary = grossSalary;
    }

    //Get method
    public double getCommissionRate() { 
        return commissionRate; 
    }
    public double getGrossSalary() { 
        //grossSales converted into grossSalary
        return grossSalary; 
    } 

    //Set method
    public void setCommissionRate(double commissionRate) { 
        this.commissionRate = commissionRate; 
    }
    public void setGrossSalary(double grossSalary) { 
        //grossSales converted into grossSalary
        this.grossSalary = grossSalary; 
    }
}