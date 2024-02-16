public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    //Get method
    public double getWage() { 
        return wage; 
    }
    public double getHoursWorked() { 
        return hoursWorked; 
    }

    //Set method
    public void setWage(double wage) { 
        this.wage = wage; 
    }
    public void setHoursWorked(double hoursWorked) { 
        this.hoursWorked = hoursWorked; 
    }
}