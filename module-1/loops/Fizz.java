import java.util.*;
class Fizz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0 && i%5!=0){
				System.out.println("Fizz");
			}else if(i%3!=0 && i%5==0){
				System.out.println("Buzz");
			}else if(i%3!=0 && i%5!=0){
				System.out.println(i);
			}else {
				System.out.println("Invalid Input");
			}
		}
	}
}