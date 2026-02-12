import java.util.*;
class EvenOddProduct{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		while(n!=0){
			int digit = n%10;
			if(digit%2==0){
				even_sum+=digit;
			}else{
				odd_sum+=digit;
			}
			n/=10;
		}
		System.out.println("Product is: " + even_sum * odd_sum);

		//WAJP to find smallest digit.
		// WAJP to find largest digit.
		//WAJP to find 2nd smallest digit.
		//WAJP to find 2nd largest digit.
	}
}