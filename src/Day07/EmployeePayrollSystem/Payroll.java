package Day07.EmployeePayrollSystem;

public class Payroll {
    public static void main(String[] args) {
        Employee[] team = {
            new FullTime("Rahul","E01",45000),
            new PartTime("Priya","E02",500,80),
            new FullTime("Arjun","E03",52000),
            new PartTime("Sneha","E04",600,65),
        };
        double totalPayroll=0;
        for (Employee e : team)
        {
        	e.display();
        	totalPayroll+=e.getPay();
        }
        // also print total payroll
        System.out.println("Total payroll: ₹"+totalPayroll);
    }
}