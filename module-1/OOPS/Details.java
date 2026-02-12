/*Q1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
------------------------------------------------------------------------------------------*/

class Person {
	private String name;
	private int age;
	private String country;

	public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getCountry(){
		return country;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public void setCountry(String country){
		this.country=country;
	}
}

public class Details {
	public static void main(String[] args) {
		Person ref = new Person("Amit", 21, "India");
		System.out.println(ref.getName());
		System.out.println(ref.getAge());
		System.out.println(ref.getCountry());

		ref.setName("Ajay");
		ref.setAge(25);
		ref.setCountry("Canada");

		System.out.println(ref.getName());
		System.out.println(ref.getAge());
		System.out.println(ref.getCountry());

	}
}