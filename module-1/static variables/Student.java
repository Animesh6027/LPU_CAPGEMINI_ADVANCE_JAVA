/*WAJP to create student class consist of 4 data such as: id, name, percentage, college name
create parameterized constructor to initialize only id
create parameterized constructor to initialize only name
create parameterized constructor to initialize only percentage
create parameterized constructor to initialize id and name
create parameterized constructor to initialize id and percentage
create parameterized constructor to initialize name and percentage
create parameterized constructor to initialize id, name, and percentage
create default/no argument constructor to assign default values.
create one static method called printDetails to print all the details of student
in main method create objects using all constructor

*/
public class Student{
	int id;
	String name;
	double percentage;
	String college_name;

	public Student(int id){
		this.id=id;
	}

	public Student(String name){
		this.name=name;
	}
	public Student(double percentage){
		this.percentage=percentage;
	}
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public Student(int id, double percentage){
		this.id=id;
		this.percentage=percentage;
	}
	public Student(String name, double percentage){
		this.name=name;
		this.percentage=percentage;
	}
	public Student(int id, String name, double percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	public Student(){
		this.id = 1;
		this.name="rohit";
		this.percentage = 80;
		this.college_name = "LPU";
	}
	public static void printDetails(Student s){
		System.out.println("Student ID: " + s.id);
		System.out.println("Student Name: " + s.name);
		System.out.println("Student percentage: " + s.percentage);
		System.out.println("Student college_name: " + s.college_name);
		System.out.println(" --- ");
	}

	public static void main(String[] args) {
		Student c1 = new Student();
		printDetails(c1);
		Student c2 = new Student("ABC");
		printDetails(c2);
		Student c3 = new Student(95);
		printDetails(c3);
		Student c4 = new Student(105, "DEF");
		printDetails(c4);
		Student c5 = new Student(106, 92);
		printDetails(c5);
		Student c6 = new Student("IJK", 89);
		printDetails(c6);
		Student c7 = new Student(109, "XYZ", 90);
		printDetails(c7);

	}

}