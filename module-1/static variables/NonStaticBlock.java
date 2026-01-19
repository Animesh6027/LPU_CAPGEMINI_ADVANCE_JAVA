//WAJP to execute instance initializer block and execute non static method before the execution of main method

public class NonStaticBlock{

	// Non static block
	{
		System.out.println("Instance initializer block");
	}

	// Non static method
	public void test(){
		System.out.println("Test start");
		System.out.println("Test End");
	}

	//static block
	static{
		NonStaticBlock ref = new NonStaticBlock();
		ref.test();
		System.out.println("Static executed");
	}

	//main method
	public static void main(String[] args) {
		// static context -> class static area
		System.out.println("Main Start");
		System.out.println("Main End");
	}
}