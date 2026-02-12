/*
What is exception?
	The problem that occurs during run time due to which the flow of program gets disturbed and program get terminated.

Checked Exception:
		Compiler Aware Exception
Unchecked Exception: 
		Compiler UnAware Exception

Throwable:
    UnChecked Exceptions:
	    Error: 
		    VirtualMachineError ->
							    StackOverFlowError
							    OutOfMemoryError
    
	    Exception:
		    Runtime Exception:
							    ArithmeticException
							    InputMismatchException
							    NullPointerException
							    ClassCaseException
							    IndexOutOfBoundsException:
							    						ArrayIndexOutOfBoundsException
							    						StringIndexOutOfBoundsException
    Checked Exceptions:
    		SQLException
    		IOException
    		FileNotFoundException
    		CloneNotSupportedException
    		InterruptedException
    		ClassNotFoundException



What Will happen when exception occurs?
1. The flow of the program is disturbed or stopped.
2. Exception object will be created which contains :
													1. Type of exception
													2. Error message(description of exception)
													3. Line number and method details
3.JVM search for Exception handler -> If it is present it will handle the exception and program continues after try catch block.
									  If it is not present program gets terminated.

			Types of Exception handler:
										1. try catch
										2. try with multiple catch
										3. try finally
										4. try catch finally

			Main keywords of exception -> try, catch, finally, throw, throws.

Try:
What it does:
	It contains code that might cause an error.
Why it is useful:
	To prevent your program from crashing if something goes wrong.

Catch:
What it does:
	It catches the error that happens in the try block and handles it.
Why it is useful:
	Instead of crashing, your program can show a message or do something else.

Finally:
What it does:
	It always runs wheather or not there was an error.
Why it is useful:
	To do cleanup work like closing files, releasing memory, etc.

Throw:
What it does:
	You use it to manually create an error (exception) when you detect a problem.
Why it is useful:
	You want to stop the program on purpose if something is wrong.

Throws:
What it does:
	It tells java that a method might cause an exception, and it should be handled when called.
Why it is useful:
	To warn whoever calls the method that it might throw and exception.


*/
import java.util.*;
// public class Fundamentals{
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		Scanner sc = new Scanner(System.in);

// 		try{
			
// 		System.out.println("A: ");
// 		int a = sc.nextInt();
// 		System.out.println("B: ");
// 		int b = sc.nextInt();
// 			int ans = a/b;
// 			System.out.println("Ans: " + ans);
// 		}
// 		catch (Exception e) {
// 			e.printStackTrace();
// 			System.out.println("Handled...");
// 		}
// 		// catch(ArithmeticException ae){  //-> Arithmetic Exception
// 		// 	ae.printStackTrace();
// 		// 	System.out.println("Handled...");
// 		// }
// 		// catch (InputMismatchException ie) {  //-> InputMismatch Exception
// 		// 	ie.printStackTrace();
// 		// 	System.out.println("Handled...");
// 		// }
// 		finally {
// 			System.out.println("Finally block executed");
// 			sc.close();
// 		}
		

// 		System.out.println("Main End");
// 	}
// }




class NotEligibleException extends Exception {
	public NotEligibleException(String msg){
	System.out.println(msg);
}
}
public class Fundamentals {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
		eligibleForVoting(age);
	}
	catch(NotEligibleException e){
		e.printStackTrace();
	}
		System.out.println("Main End");
	}


	public static void eligibleForVoting(int age) throws NotEligibleException {
		if(age>=18){
			System.out.println("Eligible for voting");
		}else{
			throw new NotEligibleException("Your age is below 18");
		}
	}
}