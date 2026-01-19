import java.util.*;
class Loan {
	public static double loan(double principal){
		return principal + (principal *0.08);
	}

	public static double loan(double principal, int years){
		return principal +Math.pow(1.10, years);
	}

	public static double loan(double principal, int years, String loanType){
		double rate = 0.0;
		if(loanType.equals("Home")){
			rate = 0.07;
			System.out.println(loanType + " loan compound rate = " + rate);
		}else if(loanType.equals("Auto")){
			rate = 0.09;
			System.out.println(loanType + " loan compound rate = " + rate * 100);
		}else if(loanType.equals("Personal")){
			rate = 0.12;
			System.out.println(loanType + " loan compound rate = " + rate * 100);
		}else{
			System.out.println("Invalid type.");
		}

		return principal * Math.pow(1+rate, years);
	}

	public static void main(String[] args) {
		double principal = 200000;
		int years = 5;
		String loanType = "Home";
		double amount = loan(principal, years, loanType);
		System.out.println("Amount: " + (Math.round(amount*100.0)/100.0));
	}
}