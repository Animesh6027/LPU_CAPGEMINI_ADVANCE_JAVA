import java.util.*;
class Disarium{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int cnt=0;
		int temp=n;
		while(n!=0){
			cnt++;
			n/=10;
		}
		n=temp;
		while(n!=0){
			int digit=n%10;
			sum+=(Math.pow(digit,cnt));
			cnt--;
			n/=10;
		}
		System.out.println(sum);
		if(temp==sum){
			System.out.println("Disarium");
		}else{
			System.out.println("Not a Disarium");
		}
	}
}