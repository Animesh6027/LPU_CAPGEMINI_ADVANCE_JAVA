/*
Abstraction: 
	showing only essential features and hiding implementation details (focus on what an object does, not how).

Interface:
	It is a keyword.
	It is used to create non primitive data types.
	It is used to achieve 100% abstraction.
	It is used to achieve multiple inheritance.

	To inherit interface into class we use implements keyword.

	With the help of implements keyword we can inherit more than one interface.

	We cannot create object of interface.

	in interface we cannot create static initializer block, intance initializer block, constructor.

	in interface all the non static methods are already prefixed with abstract and public keyword, hence we can achieve 100% abstraction using interface.

	in interface all the variable are already prefixed with final and static keyword.
	if any variable is prefixed with final keyword that means we cannot re-initialize that variable.

	static method of interface can be accessed only using static way.

	If we want to inherit one class into another class, we use the extends keyword.
	If we want to inherit (inplement) an interface into a class, we use the implements keyword.
	If we want to inherit one interface into another interface, we use the extends keyword.
	If we try to inherit a class into an interface, it is not possible in Java.

	Types of interface:
		1. Regular or normal interface
		2. Marker interface
		3. Functional Interface

*/

// interface Father {
// 	abstract public void test();
// 	abstract public int add(int a, int b);
// }

// class Son implements Father {
// 	@Override
// 	public void test(){
// 		System.out.println("Abstract method Override");
// 	}
// 	@Override
// 	public int add(int a, int b){
// 		return a+b;
// 	}
// }

// public class Abstraction {
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		// Father ref = new Father(); Compile time error.  Cannot instantiate  the type father
// 		Father ref = new Son();
// 		ref.test();
// 		System.out.println(ref.add(50,20));
// 		System.out.println("Main End");
// 	}
// }


// interface Father {
// 	static int a = 10; // final static int a = 10;
// 	int b=20; // final static int b = 20;
// 	public static void test(){
// 		System.out.println("Static method");
// 	}
// 	abstract public void abs();

// }

// class Son implements Father {
// 	@Override
// 	public void abs(){
// 		System.out.println("abstract method");
// 	}
// }

// public class Abstraction {
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		// Father ref = new Father(); Compile time error.  Cannot instantiate  the type father
// 		Father ref = new Son();
// 		ref.abs();
// 		System.out.println(Father.a);
// 		System.out.println(Father.b); 
// 		// ref.test()  -> Compile time error 
// 		// System.out.println(ref.add(50,20));
// 		System.out.println("Main End");
// 	}
// }

//marker interface
interface I1 {

}

// normal or regular interface
interface I2 {
	void test1();
	void test2();
}

// functional interface
@FunctionalInterface
interface I3 {
	void demo();
}

public class Abstraction {
	public static void main(String[] args) {
		
	}
}