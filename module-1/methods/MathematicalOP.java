import java.util.*;
class MathematicalOP{
	public static void findMax(int a, int b, int c){
		if(a+b<c){
			System.out.println(c);
		}else if(a+c<b){
			System.out.println(b);
		}else{
			System.out.println(a);
		}
	}

	public static void isPrime(int num){
		int cnt=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println("It is a Prime Number");
		}else{
			System.out.println("False");
		}
	}

	public static void findMin(int a, int b, int c){
		if(a<b && a<c){
			System.out.println(a);
		}else if(b<a && b<c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}
	}

	public static void fibonacci(int n){
		int a = 0;
		int b = 1;
		for(int i=1;i<=n;++i){
			System.out.println(a);
			int temp = a+b;
			a = b;
			b = temp;
		}
	}

	public static void main(String[] args) {
		System.out.println("Choose 1-findMax/2-Prime/3-findMin/4-fibonacci : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1){
			System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
		System.out.println("Enter third var: ");
		int c=sc.nextInt();
		findMax(a,b,c);
		}else if(choice==2){
			System.out.println("Enter Number: ");
			int num = sc.nextInt();
			isPrime(num);
		}else if(choice==3){
			System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
		System.out.println("Enter third var: ");
		int c=sc.nextInt();
		findMin(a,b,c);
		}else if(choice==4){
			System.out.println("Enter Number: ");
			int n = sc.nextInt();
			fibonacci(n);
		}else{
			System.out.println("Invalid");
		}
	}
}