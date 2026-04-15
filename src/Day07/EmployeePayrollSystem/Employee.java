package Day07.EmployeePayrollSystem;

abstract class Employee {
	String name;
	String empId;

	Employee(String name, String empId) {
		this.name = name;
		this.empId = empId;
	}

	abstract double getPay();

	void display() {
		System.out.printf("[%s] %s — Pay: ₹%.0f%n", empId, name, getPay());
	}
}
