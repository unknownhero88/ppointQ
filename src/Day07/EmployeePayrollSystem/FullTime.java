package Day07.EmployeePayrollSystem;

class FullTime extends Employee {
	double monthlySalary;

	FullTime(String n, String id, double salary) {
		super(n, id);
		/* store salary */
		this.monthlySalary = salary;
	}

	double getPay() {
		return this.monthlySalary;
		/* return salary */ }
}