/*
Constructor: 
	It is a special type of non static member.
		Because: The name of constructor is as same as ClassName.
				 It is similar to method but it does not have a return type.

			Note: If method is returning any data we need to specify what type of data the method is returning.

	Every Constructor will have:
		1. Constructor chaining statement: One constructor calling another constructor is known as constructor chaining.
										   How to achieve:
												1. Super calling statement.
												2. this() calling statement: - It is a constructor calling statement.
																			 - whenever we want to call same class constructor
																			 - If we have n numbers of constructors then we can 
																			   use n-1 this() calling statement.
																			 - If any constructor will have this() calling 
																			   statement then that constructor does not have PLI and IIB

												Note: Constructor recursion is not possible because it will not create an object.
													  If we try to achieve constructor recursion so it will give compile time error.
													  In constructor we can use only one "this" calling statement.
													  Contractor calling statement must be the first statement in any constructor
Ques: Why constructor recursion is not possible?
Ans:  Beacause it will not create an object properly

Ques: What is the use of constructor overloading?
Ans:  It lets a class have multiple constructor with same name but different parameter list.

Ques: Write a diff b/w constructor overloading and method overloading?
Ans:  Constructor overloading: Must have exact same name as the class they belong to.
							  Does not have a return type.
							  It is called automatically when an object is created.
	  Method overloading: Can have any valid name.
	 					  Must have a return type.
	 					  It is called explicitly using an object or class reference.
	 					  

Ques: When we use parametrized constructor?
Ans:  We use parametized constructor to initialize non static variable during object creation.

Ques: What is the use of copy constructor?
Ans:  Used to create new object by copying the data of existing object.


		2. PLI: Pre Loading Instructions.
		3. IIB: Instance Initializer Block.
		4. UWS: User Written Statements.
Types of Constructor:
	Default Constructor: 
		If the programmer has not written any constructor then by default JVM will add no argument constructor during compile time is known as default Constructor.

	Parameterized Constructor: 
		A constructor which has formal arguments is known as Parameterized constructor.
		We use parameterized constructor to initialize non static variable during object creation.

	Copy Constructor: 


		

*/

// public class Constructor {
// 	//class area or global area

// 	public Constructor(){
// 		System.out.println("-- I am Constructor --"); // constructor will get executed 4th.
// 	}

// 	{
// 		System.out.println("-- Non Static block --"); // non static block will get executed 3rd.
// 	}
// 	public static void main(String[] args) {
// 		System.out.println("Main Start"); // main will get executed 2nd.
// 		new Constructor();
// 		System.out.println("Main End"); // this will be printed at last.
// 	}
// 	static {
// 		System.out.println("-- Static Block --");  // static block will get executed 1st.
// 	}

// 	/* Output: 
// 			-- Static Block --
// 			Main Start
// 			-- Non Static block --
// 			-- I am Constructor --
// 			Main End
// 	*/
// }


// public class Constructor{
// 	int id;
// 	String name;
// 	public Constructor(int id, String name){
// 		this.id = id;
// 		this.name = name;
// 	}
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		Constructor ref = new Constructor(1,"Rohit");
// 		System.out.println(ref.id());
// 		System.out.println(ref.name());
// 		System.out.println("Main End");
// 	}
// }


// public class Constructor{
// 	// non static variable
// 	int id;
// 	String name;
// 	// Parameterized Constructor
// 	public Constructor(int id, String name){
// 		this.id = id;
// 		this.name = name;
// 	}

// 	// Copy Constructor
// 	public Constructor(Constructor obj){
// 		this.id=obj.id;
// 		this.name=obj.name;
// 	}

// 	//main method
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		Constructor ref1 = new Constructor(1,"Rohit");
// 		System.out.println(ref1.id);
// 		System.out.println(ref1.name);

// 		System.out.println("After copy Constructor");
// 		Constructor ref2 = new Constructor(ref1);
// 		System.out.println(ref2.id);
// 		System.out.println(ref2.name);
// 		System.out.println("Main End");
// 	}
// }


public class Constructor{
	// non static variable
	int id;
	String name;
	double sal;
	// Parameterized Constructor
	public Constructor(){
		this.id = 101;
		this.name = "unknown";
		this.sal=50000.0;
	}

	// Copy Constructor
	public Constructor(int id){
		this();
		this.id=id;
	}
	
	
	public Constructor(String name){
		this();
		this.name=name;
	}

	//main method
	public static void main(String[] args) {
		System.out.println("Main Start");
		Constructor ref1 = new Constructor(1);
		System.out.println(ref1.id);
		System.out.println(ref1.name);
		System.out.println(ref1.sal);

		System.out.println("After copy Constructor");
		Constructor ref2 = new Constructor("Vishnu");
		System.out.println(ref2.id);
		System.out.println(ref2.name);
		System.out.println(ref2.sal);
		System.out.println("Main End");
	}
}