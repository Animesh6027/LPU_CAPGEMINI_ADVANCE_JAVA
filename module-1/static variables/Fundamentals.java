/*
Fundamentals of OOPS: 
	Types of global members:
		1. static members: 
			1.Static variable: A variable which is declared inside class area or global area with static variable.
							   It is a type of global variable;
							   We can use without initialization because it can store default values.
							   We can use global variables inside global area as well as local area.

							   default values:
							    byte = 0
							    short = 0
							    int = 0
							    long = 0
							    float = 0.0
							    double float = 0.0
							    char = 
							    boolean = false
							    String = null

							   When we have static var and local var with same name, if we use directly inside static context
							   the high priority is given to local variable, 
							   to use static variable we have to consider class name.
							   eg: ClassName.member  -> Fundamentals.a

					for execution program JVM have some memory areas:
						1. Class static area: 
							Every class will have a dedicated memory to store all static members is known as Class Static area.
							The name of class static area is same as ClassName.
							Every static context is directly pointing towards class static area.

						2. Stack area:
							It is used for execution.

						3. Heap area:
							 The heap area stores the actual objects


					Note:  for execution JVM first calls main method.


				Ques: How to use static members inside static context?
				Ans: Directly, With the help of ClassName, & With the help of object reference class.

				Note: Every obj is directly pointing towards Class static area.


		2. Non-static members: // we require object to store non static variable
								we cannot use non static members inside static context directly as well as with the help of ClassName.
								To use/store non static members we have to create object.

				Object: It is an Instance of a class.
						we create object using new keyword.
						new ClassName();

					It  is a block of memory created inside heap area during runtime to store all non static members.

						What is new? - new is a keyword and an unary operator.
									   With the help of new keyword we can create n numbers of object for one class.
									   It will return address of an object.
									   Whenever we are using new keyword new object will be created.

						ClassName is a non primitive datatype which is used to store address of an object.

				Ques: How to use non static members inside static context?
				Ans: With the help of object reference variable.

				Whenever we have non static variable and local variable with same name,
				if we use directly inside non static context the high priority is given for local variable.
				to use non static variable we have to use 'this'.

				this:
					this is a keyword
					it is a non static reference variable
					it is used to store address of current object
					it can be used only inside non static context.

				Ques: How to use non-static members inside non static context?
				Ans: 1. Directly
					 2. With the help of this keyword.


				Ques: How to use static members inside non-static context?
				Ans: 1. Directly
					 2. With the help of ClassName
					 3. With the help of this keyword.


			Non Static block: 
					A block which is declared inside class area or global area without static keyword is known as non static block.
					It is also known as instance initializer block.
					It gets executed whenever we are creating an object.


				Note: Static and non-static block does not have access modifiers, return type, name and formal arguments.


*/



/*
// diff b/w static and non static block
Static:  req static keyword
		 Runs even before the main method
		 can only access static variable and methods
Non static:  does not require any keyword
			 runs after static block but before constructor
			 can access both static and non static variable and methods


// diff b/w Constructor and method
Constructor:  has no return type
			  same name as class
			  automatically called when create the object.
			  invoked using new keyword
Method: has return type
 		perform specific task
 		invoked using ObjectName.method();
 */


// class Fundamentals{
// 	// class area or global area
// 	// static int a = 10;
// 	// static int b = a;
// 	// public static void main(String[] args) {
//  
// 	// 	// local area or static context
// 	// 	System.out.println("Main Start");
// 	// 	System.out.println(a);
// 	// 	System.out.println(b);
// 	// 	System.out.println("Main end");
// 	// }
// }


// class Fundamentals{
// 	// class area or global area
// 	static int a = 10; // static variable

// 	// static method
// 	public static void main(String[] args) {
// 		// static context
// 		System.out.println("Main start");
// 		System.out.println(a);
// 		test();
// 		System.out.println("Main end");
// 	}

// 	public static void test(){
// 		//static context
// 		System.out.println("test start");
// 		int a = 25; // local variable
// 		System.out.println(a);
// 		System.out.println(Fundamentals.a);
// 		System.out.println("Test end");
// 	}
// }


// public class Fundamentals {  // class having main method is called driver class
// 	// class area or global area
// 	// creating static block: 

// 	static {
// 		System.out.println("Welcome to LPU");
// 	}

// 	public static void main(String[] args) {
// 		System.out.println("Main start");
// 		A.test();
// 		System.out.println("Main end");
// 	}

// 	static {
// 		System.out.println("Welcome to JAVA");
// 	}

// 	class A {
// 		static {
// 			System.out.println("Welcome to class A");
// 		}
// 		public static void test(){
// 			System.out.println("Test Start");
// 			System.out.println("Test End");
// 		}
// 	}
// }

// class Fundamentals {

//     // Static block
//     static {
//         System.out.println("Static block executed");
//     }

//     // Static method
//     static void show() {
//         System.out.println("Static method called");
//     }

//     public static void main(String[] args) {
//         Fundamentals.show();   // calling static method
//     }
// }

//WAJP to overload main method

// class Fundamentals {
// 	public static void main(int a) {
// 		System.out.println("Overload with int " + a);
// 	}
// 	public static void main(String msg) {
// 		System.out.println("Overload with string: " + msg);
// 	}
// 	public static void main(String[] args) {
// 		System.out.println("Main method start");
// 		main(10);
// 		main("Hello");
// 		System.out.println("Main method end");
// 	}
// }

// public class Fundamentals{
// 	//class area or global area
// 	int a = 10; // non static variable

// 	public static void main(String[] args) {
// 		// static context
// 		System.out.println("Main start");
// 		// System.out.println(a); // Compile time error
// 		// System.out.println("Fundamentals.a"); // Compile time error
// 		// we require object to store non static variable

// 		Fundamentals obj = new Fundamentals();
// 		System.out.println(obj.a);
// 		System.out.println(obj);
// 		System.out.println("Main end");
// 	}
// }

// public class Fundamentals{
// 	// How to use static members inside static context?

// 	//class area or global area
// 	static int a = 10; //static variable

// 	public static void main(String[] args) {

// 		// static context
// 		System.out.println("Main start");
// 		System.out.println(a);
// 		System.out.println("With the help of ClassName " + Fundamentals.a);
// 		Fundamentals ref = new Fundamentals();
// 		System.out.println("With the help of object ref: " + ref.a);
// 		System.out.println("Main end");
// 	}
// }

// public class Fundamentals{

// 	//class area or global area
// 	static String user_name; //static variable

// 	public static void main(String[] args) {

// 		// static context
// 		System.out.println("Main start");
// 		Fundamentals ref1 = new Fundamentals();
// 		ref1.user_name = "abc";
// 		Fundamentals ref2 = new Fundamentals();
// 		ref2.user_name = "def";
// 		Fundamentals ref3 = new Fundamentals();
// 		ref3.user_name = "ijk";
// 		System.out.println("user name: " + ref1.user_name);
// 		System.out.println("user name: " + ref2.user_name);
// 		System.out.println("user name: " + ref3.user_name);

// 		// we will always get ans ijk, because everytime user_name will get updated and ijk will come, but we will get name as ans
// 		// when we do not initalize user_name outside main method
// 		System.out.println("Main end");
// 	}
// }


// public class Fundamentals{
// 	//class area or global area
// 	// int a = 10;
// 	public void test(){
// 		System.out.println("Test Start");
// 		// System.out.println(a);
// 		// int a=25;
// 		// System.out.println(a);
// 		// Fundamentals obj = new Fundamentals();
// 		// System.out.println(obj.a);

// 		System.out.println("this: " + this);

// 		System.out.println("Test End");
// 	}
// 	public static void main(String[] args) {

// 		// static context
// 		System.out.println("Main start");
// 		Fundamentals ref1 = new Fundamentals();
// 		System.out.println("ref1 = " + ref1);
// 		Fundamentals ref2 = new Fundamentals();
// 		System.out.println("ref2 = " + ref2);
// 		Fundamentals ref3 = new Fundamentals();
// 		System.out.println("ref3 = " + ref3);
// 		ref2.test();
// 		// System.out.println("this:" + this);  // Compile time error - cannot use 'this' in a static context.
// 		System.out.println("Main end");
// 	}
// }


// public class Fundamentals{
// 	//class area or global area
// 	int a = 10; // non static variable
// 	// non static method
// 	public void test(){
// 		// non static context -> object -> class static area
// 		System.out.println("Test Start");
// 		System.out.println("Directly: " + a);
// 		System.out.println("with the help of this: " + this.a);
// 		System.out.println("Test End");
// 	}
// 	public static void main(String[] args) {

// 		// static context
// 		System.out.println("Main Start");
// 		Fundamentals ref = new Fundamentals();
// 		ref.test();
// 		// System.out.println("this:" + this);  // Compile time error - cannot use 'this' in a static context.
// 		System.out.println("Main end");
// 	}
// }

// public class Fundamentals{
// 	//class area or global area
// 	static int a = 10; // non static variable
// 	// non static method
// 	public void test(){
// 		// non static context -> object -> class static area
// 		System.out.println("Test Start");
// 		System.out.println("Directly: " + a);
// 		System.out.println("With the help of ClassName: " + Fundamentals.a);
// 		System.out.println("with the help of this: " + this.a);
// 		System.out.println("Test End");
// 	}
// 	public static void main(String[] args) {

// 		// static context -> class static area
// 		System.out.println("Main Start");
// 		Fundamentals ref = new Fundamentals();
// 		ref.test();
// 		System.out.println("Main end");
// 	}
// }


public class Fundamentals{
	//class area or global area
	{
		// non static block or Instance Initializer block
		System.out.println("--New object created for Fundamentals class--");
	}
	public static void main(String[] args) {

		// static context -> class static area
		System.out.println("Main Start");
		Fundamentals ref1 = new Fundamentals();
		Fundamentals ref2 = new Fundamentals();
		System.out.println("Main end");
	}
}


