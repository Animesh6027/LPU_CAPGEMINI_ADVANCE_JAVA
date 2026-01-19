/*
do while loop: syntax: 
initialization
do
{
	//do block
	statement
	updation
}
while(condition);
*/

class DoWhile {
	public static void main(String[] args) {
		System.out.println("-111 to -101");
		int i = -111;
		do {
			System.out.println(i++);
		}
		while(i<=-101);

		System.out.println("123 to 113");
		int b = 123;
		do {
			System.out.println(b--);
		}while(b>=113);

		System.out.println("5 to -5");
		int c = 5;
		do{
			System.out.println(c--);
		}while(c>=-5);

		System.out.println("-10 to 0");
		int d = -10;
		do{
			System.out.println(d++);
		}while(d<=0);

		System.out.println("s to l");
		char ch = 's';
		do{
			System.out.println(ch--);
		}while(ch>='l');

		System.out.println("T to Z");
		char ch2 = 'T';
		do{
			System.out.println(ch2++);
		}while(ch2<='Z');
	}
}
