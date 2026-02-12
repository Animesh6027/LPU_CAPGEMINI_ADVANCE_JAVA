import java.util.*;
class LargestDigit{
	public static void main(String[] args) {

		// WAJP to find largest digit.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int large = n%10;
		// while(n!=0){
		// 	int digit = n%10;
		// 	if(digit>large){
		// 		large=digit;
		// 	}
		// 	n/=10;
		// }
		// System.out.println("LargestDigit: "+ large);


		int largest=0;
		int scnd_lar=0;
		while(n!=0){
			int digit = n%10;
			if(digit>largest){
				scnd_lar = largest;
				largest=digit;
			}else if(digit<largest && digit>scnd_lar){
				scnd_lar = digit;
			}
			n/=10;
		}
		System.out.println("2nd largest is: " + scnd_lar);
	}
}