// WAJP to check wheather the given num is palindrome or not.
import java.util.*;
class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n=sc.nextInt();
		// int rev=0;
		// int temp=n;
		// while(n!=0){
		// 	int digit=n%10;
		// 	rev = rev*10+digit;
		// 	n/=10;
		// }
		// if(temp==rev){
		// 	System.out.println("It is a Palindrome");
		// }else
		// {
		// 	System.out.println("It isn't a Palindrome");
		// }

		//WAJP to print all palindrom num from range 100 to 200

		for(int i=100;i<=200;i++){
			int rev=0;
			int temp=i;
			while(temp!=0){
				int digit = temp%10;
				rev = rev*10+digit;
				temp/=10;
			}
			if(i==rev){
				System.out.println(i);
			}
		}
	}
}