import java.util.*;
class XylemPhloem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum_out=0;
		int sum_inn=0;
		while(n!=0){
			int digit=n%10;
			if(n<10 || n==temp){
				sum_out+=digit;
			}else{
				sum_inn+=digit;
			}
			n/=10;
		}
		if(sum_out==sum_inn){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}