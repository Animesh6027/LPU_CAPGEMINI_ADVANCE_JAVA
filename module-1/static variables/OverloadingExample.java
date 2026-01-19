/*3. Write a Java program to demonstrate method overloading by defining both static and non-static methods with the same name but different parameter lists. Your program should include the following:

A class named OverloadingExample containing:

A static method named display() that takes an int parameter and prints a message.
A static method named display() that takes a String parameter and prints a message.
A non-static method named display() that takes two parameters: an int and a double, and prints a message.
A non-static method named display() that takes no parameters and prints a default message. 

---------------------------------------------------------------------------------------*/

class OverloadingExample{
	public static void display(int a){
		System.out.println("Int a: " + a);
	}

	public static void display(String msg){
		System.out.println("String b: " + msg);
	}

	public void display(int a, double b){
		System.out.println("Two parameters: " + a + " " + b);
	}
	public void display(){
		System.out.println("No arguments");
	}

	public static void main(String[] args) {
		OverloadingExample.display(10);
		OverloadingExample.display("Hello");

		OverloadingExample obj = new OverloadingExample();
		obj.display();
		obj.display(5, 3.14);
	}
}