class Methods{
	//class area or global area
	public static void main(String[] args) {
		// local area or main method area
		System.out.println("Main Method starts");
		// powerButton(); // powerButton method calling statement
		addition(10,20);
		addition(12,38);
		addition(25,55);
		System.out.println("Main Method End");

	}
	// public static void powerButton(){
	// 	System.out.println("Screen On");
	// 	System.out.println("Screen Off");
	// }

	public static void addition(int a, int b){
		int add = a+b;
		System.out.println(add);
	}

	
}