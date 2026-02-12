import java.util.*;
class Savings {
	public static double predict(double income, double expenses){
		return (income - expenses);
		
	}	

	public static double predict(double income, double expenses, boolean festiveMonth){
		if(festiveMonth){
		expenses = expenses + (0.20 * expenses);
		System.out.println("Festive expenses: " + expenses);
	}
	return (income - expenses);
}

	public static void main(String[] args) {
		double income = 45000;
		double expenses = 30000;
		boolean festiveMonth = true;
		double savings = predict(income, expenses, festiveMonth);
		System.out.println("Savings: " + savings);
	}
}