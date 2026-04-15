package Day07.EmployeePayrollSystem;

class PartTime extends Employee {
	double hourlyRate;
	int hoursWorked;

	PartTime(String n, String id, double rate, int hours) {
		super(n, id);
		/* store rate and hours */
		this.hourlyRate = rate;
		this.hoursWorked = hours;
	}

	double getPay() {
		return hourlyRate * hoursWorked;
		/* rate * hours */

	}
}
