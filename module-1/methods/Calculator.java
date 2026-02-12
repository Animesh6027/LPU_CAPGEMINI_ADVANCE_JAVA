//WAJP to create calculator class consist of 4 methods.
	//1. to add 3 var
	//2. to mul 3 var
	//3. to sub 4 var
	//4. to add 2 var
import java.util.*;
class Calculator{
	public static void addition(int a, int b, int c){
		int add = a+b+c;
		System.out.println(add);
	}
	public static void mul(int a, int b, int c){
		int mul = a*b*c;
		System.out.println(mul);
	}
	public static void sub(int a, int b, int c){
		int sub = a-b-c;
		System.out.println(sub);
	}
	public static void add(int a, int b){
		int add1=a+b;
		System.out.println(add1);
	}

	public static void main(String[] args) {
		System.out.println("Choose to perform(1-add/2-sub/3-mul: )");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1){
			System.out.println("Choose num of var(2 or 3: )");
			int var = sc.nextInt();
			if(var==3){
				System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
		System.out.println("Enter third var: ");
		int c=sc.nextInt();
				addition(a,b,c);
			}else{
				System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
				add(a,b);
			}
		}else if(n==2){
			System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
		System.out.println("Enter third var: ");
		int c=sc.nextInt();
			sub(a,b,c);
		}else if(n==3){
			System.out.println("Enter first var:");
		int a=sc.nextInt();
		System.out.println("Ente second var: ");
		int b=sc.nextInt();
		System.out.println("Enter third var: ");
		int c=sc.nextInt();
			mul(a,b,c);
		}else{
			System.out.println("Invalid");
		}
	}
}