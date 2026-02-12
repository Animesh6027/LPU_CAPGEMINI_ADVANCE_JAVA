import java.util.*;
class AreaCalculator{
	public static int calculateArea(int a){
		return (a*a);
	}
	public static double calculateArea(double rad){
		return 3.14*rad*rad;
	}
	public static int calculateArea(int l, int b){
		return l*b;
	}

	public static void main(String[] args) {
		System.out.println(calculateArea(4));
		System.out.println(calculateArea(4));
		System.out.println(calculateArea(12, 4));
		
	}
}