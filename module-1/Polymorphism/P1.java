/*
why we use variable shadowing
		To reuse the same variable name in subclass or method when we want a different/local value without affecting the parent or outer variable.
where we use variable shadowing
		In inheritance (subclass hides superclass variable) or inside methods/constructors (local variable hides instance variable).
*/

// class Father{
// 	public static void test(){
// 		System.out.println("Father class test method");
// 	}
// 	public static void demo(int a){
// 		System.out.println("Father class demo method");
// 	}
// }
// class Son extends Father{
// 	public static void test(){
// 		System.out.println("Son class test method");
// 	}
// 	public static void demo(int a){
// 		System.out.println("Son class demo method");
// 	}
// }

// public class P1 {
// 	public static void main(String[] args) {
// 		System.out.println("Main Start");
// 		System.out.println("Object of father store inside father class ref var");
// 		Father ref1 = new Father();
// 		ref1.test();
// 		ref1.demo(0);

// 		System.out.println("Object of son store inside son class ref var");
// 		Son ref2 = new Son();
// 		ref2.test();
// 		ref2.demo(0);

// 		System.out.println("Upcasting");
// 		Father ref3 = new Son();
// 		ref3.test();
// 		ref3.demo(0);

// 		System.out.println("Downcasting");
// 		Son ref4 = (Son) ref3;
// 		ref4.test();
// 		ref4.demo(0);

// 		System.out.println("Main End");
// 	}
// }

class Father{
	public void test(){
		System.out.println("Father class test method");
	}
	public void demo(int a){
		System.out.println("Father class demo method");
	}
}
class Son extends Father{
	public void test(){
		System.out.println("Son class test method");
	}
	public void demo(int a){
		System.out.println("Son class demo method");
	}
}

public class P1 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("Object of father store inside father class ref var");
		Father ref1 = new Father();
		ref1.test();
		ref1.demo(0);
		System.out.println();

		System.out.println("Object of son store inside son class ref var");
		Son ref2 = new Son();
		ref2.test();
		ref2.demo(0);
		System.out.println();

		System.out.println("Upcasting");
		Father ref3 = new Son();
		ref3.test();
		ref3.demo(0);
		System.out.println();

		System.out.println("Downcasting");
		Son ref4 = (Son) ref3;
		ref4.test();
		ref4.demo(0);
		System.out.println();

		System.out.println("Main End");
	}
}