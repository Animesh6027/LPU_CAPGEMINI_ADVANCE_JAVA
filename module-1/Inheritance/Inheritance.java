/*
A problem arises during multiple inheritance is known as Diamond Problem.
Reason: Confusion with respect to class loading process
		Confusion with respect to object loading process
		Confusion with respect to accessing the members


Typecasting: Conversion of one data type to another datatype.
	Primitive:
	    Widening: char ch = 'a';
	    		  int i = ch;

	    Narrowing: int i = 97;
	    		   char ch = (char) i;

    Non - Primitive:
    	Upcasting - Conversion of sub class type into super class type
    				In upcasting we create object of sub class and store inside superclass.
    	Downcasting - Conversion of super class type into sub class type
					  In downcasting we do not create a new object, but we use exolict conversion to convert superclass into subclass.

			Note: If we try to perform downcasting without upcasting it will throw ClassCastException.
*/

// class Father{
// 	int a = 10;
// }
// class Son extends Father{
// 	int b = 20;
// }

// public class Inheritance {
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		System.out.println("Object of father store inside father class ref var");
// 		Father ref1 = new Father();
// 		System.out.println(ref1.a);
// 		// System.out.println(ref1.b);  Complie time error cannot find symbol

// 		System.out.println("Object of son store inside son class ref var");
// 		Son ref2 = new Son();
// 		System.out.println(ref2.a);
// 		System.out.println(ref2.b);

// 		System.out.println("Upcasting");
// 		Father ref3 = new Son();
// 		System.out.println(ref3.a);
// 		// System.out.println(ref3.b);  Complie time error cannot find symbol
// 		System.out.println("Downcasting");
// 		Son ref4 = (Son) ref3;
// 		System.out.println(ref4.a);
// 		System.out.println(ref4.b);
// 		// Son ref4 = ref3;  Cannot convert Father into Son

// 		System.out.println("Main End");
// 	}
// }


class Level1{
    int a = 10;
}
class Level2 extends Level1{
    int b = 20;
}

class Level3 extends Level2{
    int c = 30;
}
class Level4 extends Level3{
    int d = 40;
}

public class Inheritance {
	public static void main(String[] args) {
		System.out.println("Main Start");
		Level1 ref1 = new Level1();
		System.out.println(ref1.a);

		Level2 ref2 = new Level2();
		System.out.println(ref2.a);
		System.out.println(ref2.b);

		Level3 ref3 = new Level3();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		System.out.println(ref3.c);

		Level4 ref4 = new Level4();
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println(ref4.c);
		System.out.println(ref4.d);

		System.out.println("Upcasting level 3 -> 2");
		Level2 up1 = new Level3();
		System.out.println(up1.a);
		System.out.println(up1.b);

		System.out.println("Upcasting level 4 -> 1");
		Level1 up2 = new Level4();
		System.out.println(up2.a);

		System.out.println("Downcasting level 1 -> 4");
		Level4 down1 = (Level4) up2;
		System.out.println(down1.a);
		System.out.println(down1.b);
		System.out.println(down1.c);
		System.out.println(down1.d);

		System.out.println("Downcasting level 2 -> 3 ");
		Level3 down2 = (Level3) up2;
		System.out.println(down2.a);
		System.out.println(down2.b);
		System.out.println(down2.c);

		System.out.println("Main End");
	}
}