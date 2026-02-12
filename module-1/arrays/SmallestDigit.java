import java.util.*;
class SmallestDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//WAJP to find smallest digit.
		
		// int n = sc.nextInt();
		// int small = n%10;
		// while(n!=0){
		// 	int digit = n%10;
		// 	if(digit<small){
		// 		small=digit;
		// 	}
		// 	n/=10;
		// }
		// System.out.println("SmallestDigit: " + small);

		//WAJP to find 2nd smallest digit.
		int n = sc.nextInt();
		int small = 9;
		int second_smallest = 9;
		while(n!=0){
			int digit = n%10;
			if(digit<small){
				second_smallest = small;
				small = digit;
			}else if(digit>small && digit<second_smallest){
				second_smallest = digit;
			}
			n/=10;
		}
		System.out.println("Second Smallest digit is: " + second_smallest);

	}
}