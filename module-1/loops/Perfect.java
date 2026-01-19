import java.util.*;
class Perfect {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter num: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum is: " + sum + " and number is: " + n);
		if(sum==n){
			System.out.println("Perfect Numeber");
		}else{
			System.out.println("Not a Perfect Number");
		}

		
		for(int i=1;i<=100;i++){
			int sum = 0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.print(i + " ");
			}
		}
	}
}