//HW3
//Fabian Londono

public class Main {

	public static void main(String[] args) {

		String fullName = "Erika T. Jones";
		String employeeNumber = "ej789";
		double payRate = 100.0, hoursWorked = 1.0; 
		//TA will change these to test your code

		Employee e;
		e = new Employee(fullName, employeeNumber, payRate, hoursWorked);

		System.out.println(e); // To Test your toString method

		e.printCheck();

		System.out.println("Bye!");

	}

}
	
class Employee{   
	private String fullName, employeeNumber;
	private double payRate, hoursWorked;
	
	public Employee(String fullName, String employeeNumber, double payRate, double hoursWorked) {
		this.fullName = fullName;
		this.employeeNumber = employeeNumber;
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
	}
	
	public String getFullName() { return fullName; }
	public String getEmployeeNumber() { return employeeNumber; }
	public double getPayRate() { return payRate; }
	public double getHoursWorked() { return hoursWorked; }
	
	public void setFullName(String fullName) { this.fullName = fullName; }
	public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }
	public void setPayRate(double payRate) { this.payRate = payRate; }
	public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
	
	public String toString() {
		return fullName + "/" + employeeNumber + ", "  + hoursWorked + " Hours @ " + payRate + " per hour";
	}
	
	private double netPay() {
		double grossPay = hoursWorked*payRate;
		double tax = 0.06;
		return (grossPay) - (grossPay*tax);
	}
	
	public void printCheck() {
		System.out.println("\nEmployee’s name:\t" + fullName);
		System.out.println("Employee’s number:\t" + employeeNumber);
		System.out.println("Hourly rate of pay:\t" + payRate);
		System.out.println("Hours worked:\t" + hoursWorked);
		System.out.println("");
		System.out.println("Total Gross Pay:\t" + hoursWorked*payRate);
		System.out.println("");
		System.out.println("Deductions\nTax(%6):\t" + (hoursWorked*payRate)*0.06);
		System.out.println("");
		System.out.println("Net Pay:\t" + ((hoursWorked*payRate)-(hoursWorked*payRate*0.06)));
	}
}