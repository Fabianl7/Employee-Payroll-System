# Employee-Payroll-System

This Java program, named EmployeeManagement, provides a simple employee management system. It includes a class, `Employee`, to represent an employee and perform various payroll-related operations.

## How it Works

### Employee Class

The program defines an `Employee` class with private fields for the employee's full name, employee number, pay rate, and hours worked. The class includes methods for getting and setting these attributes, calculating net pay, and generating a string representation of the employee.

### Payroll Simulation

In the `Main` class, the program simulates an employee named Erika T. Jones with a predefined employee number, pay rate, and hours worked. It creates an `Employee` object with these initial values and then prints information about the employee, including the total gross pay, deductions, and net pay.

## Classes and Methods

### Employee Class

- `Employee(String fullName, String employeeNumber, double payRate, double hoursWorked)`: Constructor to initialize the employee.
- `String getFullName()`: Gets the full name of the employee.
- `String getEmployeeNumber()`: Gets the employee number.
- `double getPayRate()`: Gets the pay rate per hour.
- `double getHoursWorked()`: Gets the number of hours worked.
- `void setFullName(String fullName)`: Sets the full name of the employee.
- `void setEmployeeNumber(String employeeNumber)`: Sets the employee number.
- `void setPayRate(double payRate)`: Sets the pay rate per hour.
- `void setHoursWorked(double hoursWorked)`: Sets the number of hours worked.
- `String toString()`: Generates a string representation of the employee.
- `double netPay()`: Calculates the net pay after deductions.
- `void printCheck()`: Prints a detailed check, including gross pay, deductions, and net pay.

### Main Class

- `public static void main(String[] args)`: The main method to run the program. It creates an `Employee` object, prints employee information, and displays a paycheck.

## Usage

1. **Compile the Program:**
   - Open a terminal and navigate to the directory containing the program files.
   - Compile the program using the following command:
     ```bash
     javac Main.java
     ```

2. **Run the Program:**
   - After compilation, run the program with the following command:
     ```bash
     java Main
     ```

3. **View Output:**
   - The program will simulate an employee payroll scenario, printing information about the employee's pay.

## Example

```bash
javac Main.java
java Main
