// import java.util.*;

// class Parameterized {

//     public static int reverseNumber(int num) {
//         int rev = 0;
//         while (num != 0) {
//             rev = rev * 10 + (num % 10);
//             num /= 10;
//         }
//         return rev;
//     }

//     public static void isPalindrome(int num) {
//         int rev = reverseNumber(num);
//         if (num == rev)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not a Palindrome");
//     }

//     public static void isStrongNumber(int n) {
//         int temp = n, sum = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             int fact = 1;
//             for (int i = 1; i <= digit; i++)
//                 fact *= i;
//             sum += fact;
//             n /= 10;
//         }
//         System.out.println(temp == sum ? "Strong Number" : "Not a Strong Number");
//     }

//     public static void countPrimeDigits(int n) {
//         while (n != 0) {
//             int digit = n % 10;
//             int cnt = 0;
//             for (int i = 1; i <= digit; i++)
//                 if (digit % i == 0) cnt++;
//             if (cnt == 2)
//                 System.out.println(digit + " is a Prime digit");
//             n /= 10;
//         }
//     }

//     public static void numberReport(int num) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Choose 1-Reverse  2-Palindrome  3-Strong  4-PrimeDigits");
//         int choice = sc.nextInt();

//         if (choice == 1)
//             System.out.println(reverseNumber(num));
//         else if (choice == 2)
//             isPalindrome(num);
//         else if (choice == 3)
//             isStrongNumber(num);
//         else if (choice == 4)
//             countPrimeDigits(num);
//         else
//             System.out.println("Invalid Choice");
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter number: ");
//     int num = sc.nextInt();

//     numberReport(num);
// }

public class Parameterized{
	public static int test(int a, int b){
		return a+b;
	}
	public static long test(int a, int b){
		return a+b;
	}
	public static void main(String[] args) {
		int ans = test(10,20);
		System.out.println(ans);
		long ans2 = test(30,40);
		System.out.println(ans2);
	}
}
