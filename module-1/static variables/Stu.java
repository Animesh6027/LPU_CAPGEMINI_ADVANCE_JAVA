/*
Create a Java class named Student with the following requirements:
	1.	Instance variables:
		int id
		String name
		int[] marks (size 3)
	2.	Create:
		A parameterized constructor to initialize all variables.
		A copy constructor that creates a deep copy of a Student object.
	3.	In the main method:
		Create one Student object using the parameterized constructor.
		Create another Student object using the copy constructor.
		Modify the marks of the copied object.
		Print details of both objects.
	4.	Ensure that changes made to the copied object do not affect the original 
	object.
*/


import java.util.*;
class Stu{
	int id;
	String name;
	int[] marks;

	public Stu(int id, String name, int[] marks){
		this.id = id;
		this.name=name;
		this.marks = new int[marks.length];
		for(int i = 0;i<marks.length;i++){
			this.marks[i] = marks[i];
		}
	}

	public Stu(Stu obj){
		this.id=obj.id;
		this.name=obj.name;
		this.marks = new int[obj.marks.length];
		for(int i = 0;i<marks.length;i++){
			this.marks[i] = obj.marks[i];
		}
	}

	void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
    }
	public static void main(String[] args) {
		int[] m1 = {40,45,48};
		Stu ref = new Stu(1,"ABC", m1);

		Stu ref2 = new Stu(ref);

		ref2.marks[0]=50;

		ref.printDetails();
		ref2.printDetails();



	}
}