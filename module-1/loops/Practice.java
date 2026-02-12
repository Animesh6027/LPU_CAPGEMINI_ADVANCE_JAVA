import java.util.*;
class Practice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		String type = "";
		if(ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U'){
			type = "Uppercase Vowel";
		}else if (ch>='A' && ch<='Z'){
			type = "Uppercase Consonent";
		}
		else if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'){
			type = "Lowercase Vowel";
		}else{
			type = "Lowercase Consonent";
		}
		System.out.println(type);

		if(type.equals("Uppercase Vowel")){
			int a = 10;
			do{
				System.out.println(a++);
			}while(a<=20);
		}else if(type.equals("Lowercase Vowel")){
			int b = -10;
			while(b<=-20){
				System.out.println(b--);
			}
		}else if(type.equals("Uppercase Consonent")){
			for(int i=25;i<=15;i++){
				System.out.println(i);
			}
		}else if(type.equals("Lowercase Consonent")){
			for(int i=-25;i>=-15;i--){
				System.out.println(i);
			}
		}else{
			System.out.println("Invalid Char");
		}


		
		// for(int i=100;i>=50;i--){
		// 	if(i%7==0){
		// 		System.out.println(i);
		// 	}
		// }

		// int sum=0;
		// for(int i=1;i<=10;i++){
		// 	sum+=i;
		// }
		// System.out.println(sum);

		// int pro=1;
		// for(int i=1;i<=10;i++){
		// 	pro*=i;
		// }
		// System.out.println(pro);
	}
}