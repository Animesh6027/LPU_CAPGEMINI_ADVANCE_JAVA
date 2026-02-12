import java.util.*;
class FitnessTracker{
	public static double inputSteps(){
		Scanner sc = new Scanner(System.in);
		int steps = sc.nextInt();
		return steps;
	}

	public static double calculateCalories(int steps){
		return steps * 0.04;
	}

	public static double calculateCalories(int steps, double weight){
		double calories = steps * weight * 0.0005;
		return calories;
	}

	public static void showSummary(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Steps: ");
		int steps = inputSteps();
		System.out.println("Enter weight(else enter 0): ");
		int weight = sc.nextInt();
		// double caloriesBurned = calculateCalories(steps, weight);
		// System.out.println("calories Burned: " + Math.round(caloriesBurned));

		if(weight==0){
			double cal_burned = calculateCalories(steps);
			System.out.println("Calories Burned: " + cal_burned );
		}else {
			double calories_burned = calculateCalories(steps, weight);
			System.out.println("Calories Burned: " + Math.round(calories_burned));
		}
	}

	public static void main(String[] args) {
		showSummary();
	}
}