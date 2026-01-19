/*2. Write a Java program that performs the following tasks:
Create a class Employee with three attributes: id, name, and sal (salary).
Implement a parameterized constructor to initialize these attributes.
Create a non-static method printDetails() to display employee details.
In the main() method:
Create an 4 Employee object

---------------------------------------------------------------------*/
class Employee{
	int id;
	String name;
	double sal;

	Employee(int id, String name, double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void printDetails(){
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("sal: " + sal);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "WXY", 45200.0);
		Employee emp2 = new Employee(102, "ABC", 71000.0);
		Employee emp3 = new Employee(103, "DEF", 25000.0);
		Employee emp4 = new Employee(104, "XYZ", 45000.0);

		emp1.printDetails();
		emp2.printDetails();
		emp3.printDetails();
		emp4.printDetails();
	}
}