/*A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
*/



	

	class Address {
		String city;
		public Address(String city){
			this.city = city;
		}
		
	}
	class Employee{
		int id; 
		Address address;
		public Employee(int id, Address address){
			this.id=id;
			this.address=address;
		}
		public Employee(Employee emp){
			this.id=emp.id;
			this.address=emp.address;
		}
	}
public class Store{
	public static void main(String[] args) {
		Address add = new Address("Delhi");
		Employee emp1 = new Employee(1, add);

		Employee emp2 = new Employee(emp1);
		emp2.address.city = "Mumbai";
		System.out.println("City of Emp1: " + emp1.address.city);
		System.out.println("City of Emp2: " + emp2.address.city);

	}
}