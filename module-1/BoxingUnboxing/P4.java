/*
You are given a Java program that defines two classes: Employee and Company.
- The Employee class has attributes for employee ID, name, and salary. It also 
contains a static method to create new Employee objects and a method to display 
employee details.
- The Company class maintains a list of employees and displays their details.
*/

import java.util.*;

public class P4{
	public static void main(String[] args) {
		Company c = new Company();

		Employee e = new Employee(101, "ABC", 1000.0);
		Employee e2 = new Employee(102, "IJK", 5000.0);

		c.addEmployee(e);
		c.addEmployee(e2);

		c.displayAllEmployees();
	}
}

class Employee{
	int employeeId;
	String name;
	double salary;

	Employee(int employeeId, String name, double salary){
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}

	public static Employee createEmployee(int id, String name, double salary) {
        return new Employee(id, name, salary);
    }

	public void display(){
		System.out.println("Id: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Company {
	ArrayList<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayAllEmployees() {
        for (Employee e : employees) {
            e.display();
        }
    }
}