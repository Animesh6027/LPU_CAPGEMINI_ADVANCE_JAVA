//WAJP to check wheather the given number is strong num or not.
import java.util.*;
class StrongNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int temp=n;
		// int sum=0;
		// while(n!=0){
		// 	int digit = n%10;
		// 	int fact=1;
		// 	for(int i=digit;i>=1;i--){
		// 		fact*=i;
				
		// 	}
		// 	sum+=fact;
		// 	n/=10;
		// }
		// if(temp == sum){
		// 	System.out.println("Strong Number");
		// }else{
		// 	System.out.println("Not a Strong Number");
		// }


		//WAJP to print all strong numbers from range 1 to 1000.

		for(int i=1;i<=1000;i++){
			int temp=i;
			int sum=0;
			while(temp!=0){
				int digit=temp%10;
				int fact=1;
				for(int j=1;j<=digit;j++){
					fact*=j;
				}
				sum+=fact;
				temp/=10;
			
			}
			if(sum==i){
				System.out.println(i);
			}
		}




	}
}