/*53. Write a program to print the first n numbers in the Fibonacci sequence.
	0, 1, 1, 2, 3, 5, 8, 13, ...*/

import java.util.*;
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter series num: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=1;i<=n;++i){
			System.out.println(a);
			int temp = a+b;
			a = b;
			b = temp;
		}
	}
}