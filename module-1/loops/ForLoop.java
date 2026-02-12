/*
for loop:
	for(initialization ; condition ; updation)
		{
			//for block
			statements
		}

// When we use while loop?
Ans: - When the number of iterations is not known in advance.
- When you want to repeat a block of code as long as a condition is true.
- Useful for input validation or waiting for a condition to become false.

// When we use do while loop?
Ans: - When you want the loop to execute at least once, regardless of the condition.
- Useful for menu-driven programs or user input prompts.

// When we use for loop?
Ans: - When the number of iterations is known or predetermined.
- Ideal for count-controlled loops like iterating over arrays or ranges.


*/

class ForLoop{
	public static void main(String[] args) {
		System.out.println("1111 to 1121");
		int a = 1121;
		for(int i=1111;i<=a;i++){
			System.out.println(i);
		}

		System.out.println();
		System.out.println("1234 to 1223");
		int b = 1223;
		for(int i=1234; i>=b;i--){
			System.out.println(i);
		}

		System.out.println();
		System.out.println("-1111 to -1121");
		for(int i=-1111;i>=-1121;i--){
			System.out.println(i);
		}

		System.out.println();
		System.out.println("-1234 to -1223");
		for(int i=-1234; i<=-1223;i++){
			System.out.println(i);
		}

		System.out.println();
		System.out.println("d to j");
		for(char ch='d';ch<='j';ch++){
			System.out.println(ch);
		}

		System.out.println();
		System.out.println("m to e");
		for(char ch='m';ch>='e';ch--){
			System.out.println(ch);
		}

		System.out.println();
		System.out.println("z to t");
		for(char ch='z';ch>='t';ch--){
			System.out.println(ch);
		}

		System.out.println();
		System.out.println("r to x");
		for(char ch='r';ch<='z';ch++){
			System.out.println(ch);
		}

	}
}