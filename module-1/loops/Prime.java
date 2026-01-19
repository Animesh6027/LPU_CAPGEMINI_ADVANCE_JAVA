	//WAJP to check wheather the given num is prime or not
import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter number: ");
		// int n=sc.nextInt();
		// int cnt=0;
		// for(int i=1;i<=n;i++){
		// 	if(n%i==0){
		// 		cnt++;
		// 	}
		// }
		// if(cnt == 2){
		// 	System.out.println("Prime Number");
		// }else{
		// 	System.out.println("Not a Prime Number");
		// }
		//WAJP to print prime num from the range 20 to 1;

		int prime=0;
		for(int i=20;i>=1;i--){
			int cnt=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					cnt++;
				}
			}
			if(cnt==2){
				System.out.println(i);
				prime++;
			}
		}
		System.out.println("Total numbers: " + prime);

		// int n = sc.nextInt();
		// for(int i=1;i<=n;i++){
		// 	int cnt=0;
		// 	for(int j=1;j<=i;j++){
		// 		if(i%j==0){
		// 			cnt++;
		// 		}
		// 	}

		// }

	}
}