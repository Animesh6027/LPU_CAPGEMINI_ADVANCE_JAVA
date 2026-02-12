/*4. Write a Java program that defines a class named DemoClass with the following specifications:

The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
The class should contain one non-static method named displayMessage(), which prints a message when called.
The class should contain two static methods:
staticMethodOne(): Prints a message when called.
staticMethodTwo(): Prints a different message when called.

Inside the main() method, perform the following actions:
Call both static methods directly using the class name.
Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor.
Call the non-static method using the object reference.

-------------------------------------------------------------------------------------*/


class DemoClass{
	static {
		System.out.println("SIB1");
	}
	static{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB");
	}

	void displayMessage(){
		System.out.println("Display Message called");
	}

	static void staticMethodOne(){
		System.out.println("Static method one");
	}

	static void staticMethodTwo(){
		System.out.println("Static method two");
	}

	public static void main(String[] args) {
		DemoClass.staticMethodOne();
		DemoClass.staticMethodTwo();

		DemoClass obj = new DemoClass();
		obj.displayMessage();
	}
}