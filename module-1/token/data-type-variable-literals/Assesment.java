import java.util.*;
class Assesment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id: ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String empName = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		System.out.println("Choose department(1-IT/2-HR/3-Finance): ");
		int dept = sc.nextInt();

		System.out.println("Enter base Salary: ");
		double baseSal = sc.nextDouble();

		if(age<21){
			System.out.println("Employee is not eligible to work.");
			return;
		}
		
		int allowance = 0;
		String emp_role = "";
		switch(dept){
		case 1:
			System.out.print("Choose your role(Developer/Tester): ");
			String role1=sc.next();
			switch (role1) {
				case "Developer":
					emp_role = ("IT Developer");
					allowance = 30;
					break;
				case "Tester":
					emp_role = ("IT Tester");
					allowance = 25;
					break;
				default: System.out.println("Role does not match");
			}
			break;
		case 2:
			System.out.println("Choose your role(Recruiter/Payroll): ");
			String role2 = sc.next();
			switch (role2) {
				case "Recruiter":
					emp_role = ("HR Recruiter");
					allowance = 20;
					break;
				case "Payroll":
					emp_role = ("HR Payroll");
					allowance = 22;
					break;
				default: System.out.println("Role does not match");
			}
			break;
		case 3:
			System.out.println("Choose your role(Accountant/Auditor): ");
			String role3 = sc.next();
			switch (role3) {
				case "Accountant":
					emp_role = ("Finance Accountant");
					allowance = 28;
					break;
				case "Auditor":
					emp_role = ("Finance Auditor");
					allowance = 26;
					break;
				default: System.out.println("Role does not match"); 
			}
			break;
		default: System.out.println("Department does not match");
		}

		double final_sal = baseSal + (baseSal * allowance/100);
		// System.out.println("Your final Salary is: " + final_sal);

		String access_level;
		if(final_sal>=60000 && dept==1){
			access_level = ("You have Admin Access");
		}else if(final_sal>=60 && (dept==2 || dept==3)){
			access_level = ("You Have Manager Access");
		}else{
			access_level = ("You have Employee Access");
		}

		System.out.println("Your Employee ID: "+ empId);
		System.out.println("Your Name: "+ empName);
		System.out.println("Your Department: "+ dept);
		System.out.println("Your Role: "+ emp_role);
		System.out.println("Your Basic Salary: "+ baseSal);
		System.out.println("Your Final Salary: "+ final_sal);
		System.out.println("Your Access Level: "+ access_level);

	
	}
}