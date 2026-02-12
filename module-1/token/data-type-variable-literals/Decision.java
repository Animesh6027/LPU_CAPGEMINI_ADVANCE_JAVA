import java.util.*;
class Decision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter Input: ");
		// int a = sc.nextInt();
		// if(a%2==0){
		// 	System.out.println("Even");
		// }
		// else{
		// 	System.out.println("odd");
		// }

		// WAJP to check wheather the given number is divisible by 7 or not.

		// if(a%7==0){
		// 	System.out.println("the num is divisible by 7");
		// }else{
		// 	System.out.println("the num is not divisible by 7");
		// }

		// WAJP to check wheather the given number is divisible by both 3 and 5 or not.

		// if(a%3==0 && a%5==0){
		// 	System.out.println("the num is divisible by both 3 and 5");
		// }else{
		// 	System.out.println("The num is not divisible by both 3 and 5");
		// }

		// WAJP to check wheather the character is vowel or consonent.

		// char ch = sc.nextChar();
		// if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
		//  ch == 'O' || ch == 'U'){
		// 	System.out.println(ch + " is a vowel");
		// }else {
		// 	System.out.println(ch + " is a consonent");
		// }

		// WAJP to check wheather the given character is digit or not.

		// char ch = sc.next().charAt(0);
		// if(ch>='0' && ch <='9'){
		// 	System.out.println("It is a digit");
		// }else {
		// 	System.out.println("Not a digit");
		// }

		//WAJP to check wheather the given character is Uppercase, lowercase, digit, or special character.

		// System.out.println("Enter Char: ");
		// char ch = sc.next().charAt(0);
		// if(ch>='A' && ch<='Z'){
		// 	System.out.println("char is in Uppercase");
		// }else if(ch>='a' && ch<='z'){
		// 	System.out.println("char is Lowercase");
		// }else if(ch>='0' && ch <='9'){
		// 	System.out.println("char is a digit");
		// }else {
		// 	System.out.println("character is a special charcter");
		// }

		// System.out.print("Enter Marks: ");
		// int marks = sc.nextInt();
		// if(marks>=90){
		// 	System.out.println("Grade A");
		// }else if (marks>=75 && marks<90){
		// 	System.out.println("Grade B");
		// }else if (marks>=60 && marks<75){
		// 	System.out.println("Grade C");
		// }else if(marks>=40 && marks<60){
		// 	System.out.println("Grade D");
		// }else if(marks<40){
		// 	System.out.println("Fail");
		// }else{
		// 	System.out.println("Invalid Marks");
		// }

		// WAJP to check the given character is uppercase vowel, uppercase consonent, lowercase vowel, or lowercase consonent.
		// System.out.print("Enter char: ");
		// char ch=sc.next().charAt(0);
		// if(ch>='A' && ch<='Z'){
		// 	if(ch == 'A' || ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		// 		System.out.println("Uppercase Vowels");
		// 	}else{
		// 		System.out.println("Uppercase Consonent");
		// 	}
		// }else if(ch>='a'&&ch<='z'){
		// 	if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		// 		System.out.println("Lowercase Vowels");
		// 	}else{
		// 		System.out.println("Lowercase Consonent");
		// 	}
		// }else{
		// 	System.out.println("Invalid Char");
		// }


		//WAJP to check if the number is negative, positive, or zero.

		// int a=sc.nextInt();
		// if(a>0){
		// 	System.out.println("Num is +");
		// }else if(a<0){
		// 	System.out.println("Num is -");
		// }else{
		// 	System.out.println("Num is 0");
		// }

		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// if(a>b && a>c){
		// 	System.out.println("A is the greatest");
		// }else if (b>a && b>c){
		// 	System.out.println("B is the greatest");
		// }else{
		// 	System.out.println("C is the greatest");
		// }

		// if(a<b && a<c){
		// 	System.out.println("A is the smallest");
		// }else if (b<a && b<c){
		// 	System.out.println("B is the smallest");
		// }else{
		// 	System.out.println("C is the smallest");
		// }

		// System.out.print("Enter day: ");
		// String s=sc.nextLine();
		// if(s.equals("Monday") || s.equals("Tuesday") || s.equals("Wednesday") || s.equals("Thursday") ||
		//  s.equals("Friday") || s.equals("Saturday") || s.equals("Sunday")){
		// 	// System.out.println("Valid Day");
		// 	if(s.equals("Saturday") || s.equals("Sunday")){
		// 		System.out.println("Weekend");
		// 	}else{
		// 		System.out.println("Weekday");
		// }
		// }else{
		// 	System.out.println("Invalid Day");
		// }
		
		// System.out.println("Enter Year: ");
		// int a = sc.nextInt();
		// if (a % 400 == 0) {
		//  System.out.println("Leap Year");
		// } else if (a % 100 == 0) {
		// 	system.out.println("Not a Leap Year");
		// } else if (a % 4 == 0) {
		// 	System.out.println("Leap Year");
		// } else {
		// 	System.out.println("Not a Leap Year");
		// }


// 	1. We cannot use long, float, boolean, double as an input of a switch
// 	2. If we want a desired output so need break statement.
// 	3. break statement is a control transfer statement
// 	4. default statement is not mandatory
//  5 .we can write default statement anywhere inside switch block

		// String f=sc.nextLine();
		// switch (f){
		// case "apple":
		// 	System.out.println("apples are rich in fibre and vitamin C.");
		// 	break;
		// case "banana":
		// 	System.out.println("bananas are a great source of potassium");
		// 	break;
		// case "mango":
		// 	System.out.println("Mangoes are the king of fruits!");
		// 	break;
		// case "oranges":
		// 	System.out.println("Oranges are packed with vitamin C.");
		// 	break;
		// default:
		// 	System.out.println("Sorry, I don't have info about that fruit.");
		// }



		// char ch = sc.next().charAt(0);
		// switch (ch) {
		// case 'A':
		// 	System.out.println("Excellent");
		// 	break;
		// case 'B':
		// 	System.out.println("Good");
		// 	break;
		// case 'C':
		// 	System.out.println("Fair");
		// 	break;
		// case 'D':
		// 	System.out.println("Pass");
		// 	break;
		// case 'F':
		// 	System.out.println("Fail");
		// 	break;
		// default:
		// 	System.out.println("Invalid input");
		// }


		//WAJP to perform Arithmetic op using switch
		//addition
		//  add 2 var
		//	add 3 var
		//	add 4 var
		//subtraction
		//	sub 2 var
		//	sub 3 var
		//	sub 4 var
		//multiplication
		//	mul 2 var
		//	mul 3 var
		//	mul 4 var
		//division
		//	div 2 var
		// all should be user input
		
	// 	int a = 0, b = 0, c = 0, d = 0;
	// 	System.out.print("Enter number of variables: ");
	// 	int numvar=sc.nextInt();
	// 	if(numvar == 2){
	// 		int a = sc.nextInt();
	// 		int b = sc.nextInt();
	// 	}else if(numvar == 3){
	// 		int a = sc.nextInt();
	// 		int b = sc.nextInt();
	// 		int c = sc.nextInt();
	// 	}else if(numvar == 4){
	// 		int a = sc.nextInt();
	// 		int b = sc.nextInt();
	// 		int c = sc.nextInt();
	// 		int d = sc.nextInt();
	// 	}
	// else{
	// System.out.println(Invalid);
	// }

	// 	System.out.print("Enter the action to perform");
	// 	char ch = sc.next().charAt(0);
	// 	switch(numvar){
	// 	case 2:
	// 		switch(ch){
	// 	case '+':
	// 		System.out.println(a + b);
	// 		break;
	// 	case '-':
	// 		System.out.println(a-b);
	// 		break;
	// 	case '*':
	// 		System.out.println(a*b);
	// 		break;
	// 	case '/':
	// 		if (b != 0)
	// 			System.out.println(a / b);
	// 		else
    //             System.out.println("Cannot divide by zero");
    //         break;
    //     default: System.out.println("Invalid operator");
	// 	}
	// case 3:
	// 	switch(ch){
	// 	case '+':
	// 		System.out.println(a+b+c);
	// 		break;
	// 	case '-':
	// 		System.out.println(+(a-b-c));
	// 		break;
	// 	case '*':
	// 		System.out.println(a*b*c);
	// 		break;
	// 	}
	// case 4:
	// 	switch(ch){
	// 	case '+':
	// 		System.out.println(a+b+c+d);
	// 		break;
	// 	case '-':
	// 		System.out.println(a-b-c-d);
	// 		break;
	// 	case '*':
	// 		System.out.println(a*b*c*d);
	// 	}
	// 	}

		// int a = 0, b = 0, c = 0, d = 0;

        // System.out.print("Enter number of variables (2/3/4): ");
        // int numvar = sc.nextInt();

        // if (numvar == 2) {
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        // } else if (numvar == 3) {
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        //     c = sc.nextInt();
        // } else if (numvar == 4) {
        //     a = sc.nextInt();
        //     b = sc.nextInt();
        //     c = sc.nextInt();
        //     d = sc.nextInt();
        // } else {
        //     System.out.println("Invalid number of variables");
        //     return;
        // }

        // System.out.print("Enter the action (+ - * /): ");
        // char ch = sc.next().charAt(0);

        // switch (numvar) {

        //     case 2:
        //         switch (ch) {
        //             case '+': 
        //             	System.out.println(a + b); 
        //             	break;
        //             case '-': 
        //             	System.out.println(a - b);
        //             	 break;
        //             case '*': 
        //             	System.out.println(a * b); 
        //             	break;
        //             case '/':
        //                 if (b != 0)
        //                     System.out.println(a / b);
        //                 else
        //                     System.out.println("Cannot divide by zero");
        //                 break;
        //             default: 
        //             	System.out.println("Invalid operator");
        //         }
        //         break;

        //     case 3:
        //         switch (ch) {
        //             case '+': 
        //             	System.out.println(a + b + c);
        //             	break;
        //             case '-': 
        //             	System.out.println(a - b - c); 
        //             	break;
        //             case '*': 
        //             	System.out.println(a * b * c); 
        //             	break;
        //             default: 
        //             	System.out.println("Invalid operator");
        //         }
        //         break;

        //     case 4:
        //         switch (ch) {
        //             case '+': 
        //             	System.out.println(a + b + c + d); 
        //             	break;
        //             case '-': 
        //             	System.out.println(a - b - c - d); 
        //             	break;
        //             case '*': 
        //             	System.out.println(a * b * c * d); 
        //             	break;
        //             default: 
        //             	System.out.println("Invalid operator");
        //         }
        //         break;
        // }














		// System.out.print("Enter your department(IT/HR/Finance/Operations): ");
		// String dept = sc.nextLine();
		// switch (dept){
		// case "IT":
		// 	System.out.println("Enter your role(Developer/Tester/DevOps Eng): ");
		// 	String role = sc.nextLine();
		// 	switch(role){
		// 	case "Developer":
		// 		System.out.println("Developer in IT");
		// 		break;
		// 	case "Tester":
		// 		System.out.println("Tester in IT");
		// 		break;
		// 	case "DevOps Eng":
		// 		System.out.println("DevOps Eng in It");
		// 		break;
		// 	}
		// break;
		// case "HR":
		// 	System.out.print("Enter your role(Recruiter/HR Executive/Payroll Officer): ");
		// 	String role2 = sc.nextLine();
		// 	switch(role2){
		// 	case "Recruiter":
		// 		System.out.println("Recruiter in HR");
		// 		break;
		// 	case "HR Executive":
		// 		System.out.println("HR Executive in HR");
		// 		break;
		// 	case "Payroll Officer":
		// 		System.out.println("Payroll Officer in HR");
		// 		break;
		// 	}
		// break;
		// case "Finance":
		// 	System.out.print("Enter your role(Accountant/Financial Analyst/ Auditor): ");
		// 	String role3 = sc.nextLine();
		// 	switch(role3){
		// 	case "Accountant":
		// 		System.out.println("accountant in finance");
		// 		break;
		// 	case "Financial Analyst":
		// 		System.out.println("Financial Analyst in Finance");
		// 		break;
		// 	case "Auditor":
		// 		System.out.println("Auditor in Finance");
		// 		break;
		// 	}
		// break;
		// case "Operations":
		// 	System.out.print("Enter your role(Operation Executive/Team Lead/ Manager): "); 
		// 	Sting role4 = sc.nextLine();
		// 	switch (role4) {
		// 		case "Operation Executive":
		// 			System.out.println("Operations Executive in Operations");
		// 			break;
		// 		case "Team Lead":
		// 			System.out.println("Team Lead in Operations");
		// 			break;
		// 		case "Manager":
		// 			System.out.println("Manager in Operations");
		// 			break;
		// 	}
		// break;
		// }

		System.out.print("Choose whose area you want(Circle/rectangle/triangle/square): ");
		String shape = sc.nextLine();
		switch (shape) {
			case "circle":
				System.out.print("Radius? : ");
				int r = sc.nextInt();
				float pi = 3.14f;
				float area = pi * r * r;
				System.out.println(area);
				break;
			case "rectangle":
				System.out.println("Enter length: ");
				int l=sc.nextInt();
				System.out.println("Enter bredth: ");
				int b = sc.nextInt();
				int recarea= l * b;
				System.out.println(recarea);
				break;
			case "triangle":
				System.out.println("Enter height: ");
				int h=sc.nextInt();
				System.out.println("Enter width: ");
				int w = sc.nextInt();
				int areatri=(h*w)/2;
				System.out.println(areatri);
				break;
			case "square":
				System.out.println("Enter sides: ");
				int a=sc.nextInt();
				int areasq = a*a;
				System.out.println(areasq);
				break;
		}


	}
}
