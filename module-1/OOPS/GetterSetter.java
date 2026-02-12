/*Q2. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
------------------------------------------------------------------------------------------*/


class Employee{
	private int employee_id;
	private String employee_name;
	private double employee_salary;

	// public Employee(int employee_id, String employee_name, double employee_salary){
	// 	this.employee_id=employee_id;
	// 	this.employee_name=employee_name;
	// 	this.employee_salary=employee_salary;
	// }

	public int getID(){
		return employee_id;
	}

	public String getName(){
		return employee_name;
	}

	public double getSalary(){
		return employee_salary;
	}

	public void setID(int employee_id){
		this.employee_id=employee_id;
	}

	public void setName(String employee_name){
		this.employee_name=employee_name;
	}

	public void setSalary(double employee_salary){
		this.employee_salary = employee_salary;
	}

}

public class GetterSetter{
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setID(101);
		emp.setName("ABC");
		emp.setSalary(45000.0);

		System.out.println(emp.getID());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}