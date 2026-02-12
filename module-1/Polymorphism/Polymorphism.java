/*
Polymorphism: 
	An ability of an object to exhibit more than one form is known as polymorphism.
	one name but different behaviours.

Types of Polymorphism:
	1. Compile time polymorphism:
		the binding happens during compile time 
		it is also known as static binding.
		we can achieve compile time polymorphism:
			1. Using method overloading
			2. Using constructor overloading
			3. Using variable shadowing
					A sub class and superclass is static variable or non static var with same is known as variable shadowing.
					Which var to be called is decided during complile time based on ref var type.
			4. Method shadowing
					A sub class and super class is having static method with same name, same access modifier, same return type and same formal argumemt.
					Which method to be called is decide during compile time based on reference variable type.

	2. Run time polymorphism: 
		The binding happens during run time
		it is also known as dynamic binding
		we can achieve run time polymorphism using method overriding.
				A sub class and super class is having non static method with same name, same access modifier, same return type and same formal argumemt.
				Which method to be called is decided during runtime based on object creation.

		Annotation:  Extra validation provided by programmer.
					 eg: @override
					 		: which means method override from superclass.
					 		  if we are not giving same access modifier, name, return type, or formal argument then it will give compile time error.

		
*/

// class Father{
// 	int a = 10;
// 	static int b = 100;
// }
// class Son extends Father{
// 	int a = 20;
// 	static int b = 200;
// }

// public class Polymorphism {
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
		
// 		System.out.println("Father class object storing father class variable");
// 		Father ref1 = new Father();
// 		System.out.println(ref1.a);
// 		System.out.println(ref1.b);
// 		Son ref2 = new Son();
// 		System.out.println(ref2.a);
// 		System.out.println(ref2.b);

// 		System.out.println("Upcasting");
// 		Father ref3 = new Son();
// 		System.out.println(ref3.a);
// 		System.out.println(ref3.b);

// 		System.out.println("Downcasting");
// 		Son ref4 =  (Son)ref3;
// 		System.out.println(ref4.a);
// 		System.out.println(ref4.b);
// 		System.out.println("Main End");
// 	}
// }


class Father{
	public void test(){
		System.out.println("Father class test method");
	}
	public void demo(int a){
		System.out.println("Father class demo method");
	}
}
class Son extends Father{
	@Override
	public void test(){
		System.out.println("Son class test method");
	}
	@Override
	public void demo(int a){
		System.out.println("Son class demo method");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("Object of father store inside father class ref var");
		Father ref1 = new Father();
		ref1.test();
		ref1.demo(0);
		System.out.println();

		System.out.println("Object of son store inside son class ref var");
		Son ref2 = new Son();
		ref2.test();
		ref2.demo(0);
		System.out.println();

		System.out.println("Upcasting");
		Father ref3 = new Son();
		ref3.test();
		ref3.demo(0);
		System.out.println();

		System.out.println("Downcasting");
		Son ref4 = (Son) ref3;
		ref4.test();
		ref4.demo(0);
		System.out.println();

		System.out.println("Main End");
	}
}