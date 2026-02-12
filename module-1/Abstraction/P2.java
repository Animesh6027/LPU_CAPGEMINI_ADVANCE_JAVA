/*
1. Create a base class Person with method:
	showRole() → prints "I am a person"

2. Create two child classes:
	Student extends Person
	Teacher extends Person

3. Create two interfaces:
	Sports → method play()
	Cultural → method perform()

4. Create a class CollegeStudent that:
	Extends Student
	Implements both Sports and Cultural

5. In main():
	Create object of CollegeStudent
	Call all methods
*/

class Person {
	void showRole(){
		System.out.println("I am a person");
	}
}

class Student extends Person {
	public void study(){
	System.out.println("I am a student");
	}
}
class Teacher extends Person{
	public void teach(){
		System.out.println("I am a teacher.");
	}
}

interface Sports {
	void play();
}

interface Cultural {
	void perform();
}

class CollegeStudent extends Student implements Sports, Cultural {
	
	@Override
	public void play(){
		System.out.println("I play");
	}
	@Override
	public void perform(){
		System.out.println("I perform");
	}

}

public class P2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.showRole();

		Student s = new Student();
		s.showRole();
		s.study();

		Teacher t = new Teacher();
		t.showRole();
		t.teach();

		CollegeStudent c = new CollegeStudent();
		c.showRole();
		c.study();
		c.play();
		c.perform();

	}
}