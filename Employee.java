package task3;

public class Employee implements Taxable{
	int empId;
	String name;
	double salary;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return salary*incomeTaxPcn;
	}

}
