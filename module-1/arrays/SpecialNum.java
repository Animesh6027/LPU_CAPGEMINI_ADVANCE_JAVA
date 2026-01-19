import java.util.*;
class SpecialNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// WAJP to check wheather the given num is a special number or not.
		// 19 - sum of digit=10
		//		product of digit = 9
		//		total = 19 =  number

		// int n = sc.nextInt();
		// int sum=0;
		// int product=1;
		// int temp=n;
		// while(n!=0){
		// 	int digit=n%10;
		// 	sum += digit;
		// 	product*=digit;
		// 	n/=10;
		// }
		// int total = sum+product;
		// if(total == temp){
		// 	System.out.println("Special Number");
		// }else{
		// 	System.out.println("Not a special Number");
		// }

		// WAJP to print special num from the range 1 to 100;

		// int n = sc.nextInt();
		
		// int temp=0;
	// 	for(int i=1;i<=100;i++){
	// 		int sum=0;
	// 		int product=1;
	// 		int temp=i;
	// 	while(temp!=0){
	// 		int digit=temp%10;
	// 		sum += digit;
	// 		product*=digit;
	// 		temp/=10;
	// 	}
	// 	if(sum + product ==i){
	// 		System.out.println(i);
	// 	}
	// }

	// System.out.print("Enter num: ");
	// int n = sc.nextInt();
	// int sum=0;
	// int temp=n;
	// while(n!=0){
	// 	int digit = n%10;
	// 	sum+=digit;
	// 	n/=10;
	// }
	// if(temp%sum==0){
	// 	System.out.println("true");
	// }else{
	// 	System.out.println("false");
	// }

		System.out.println("Enter num: ");
		int n = sc.nextInt();
		while(n!=0){
			int digit=n%10;
			int fact=1;
			for(int i=digit;i>=1;i--){
				fact*=i;
			}
			System.out.println(digit + "! = " + fact);
			n/=10;
		}
	}
}