public class DriverProgram {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee commissionEmployee = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee commissionEmployee2 = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        //Print out details of every employee
        printEmployeeDetails(salariedEmployee);
        printEmployeeDetails(hourlyEmployee);
        printEmployeeDetails(hourlyEmployee2);
        printEmployeeDetails(commissionEmployee);
        printEmployeeDetails(salariedEmployee2);
        printEmployeeDetails(baseEmployee);
        printEmployeeDetails(commissionEmployee2);
    }

    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSocialSecurityNumber());
        
        if (employee instanceof SalariedEmployee) {
            SalariedEmployee se = (SalariedEmployee) employee;
            System.out.println("Weekly Salary: $" + se.getWeeklySalary());
        } 
        else if (employee instanceof HourlyEmployee) {
            HourlyEmployee he = (HourlyEmployee) employee;
            System.out.println("Hourly Wage: $" + he.getWage());
            System.out.println("Hours Worked: " + he.getHoursWorked());
        } 
        else if (employee instanceof CommisionEmployee) {
            CommisionEmployee ce = (CommisionEmployee) employee;
            System.out.println("Commission Rate: " + ce.getCommissionRate());
            System.out.println("Gross Salary: $" + ce.getGrossSalary());

        } 
        else if (employee instanceof BaseEmployee) {
            BaseEmployee be = (BaseEmployee) employee;
            System.out.println("Base Salary: $" + be.getBaseSalary());
        }
        System.out.println("_________________________________________________\n");

    }
}