/*
Vector:
	It is a implementing class of List interface.
	It is present inside java.util package.
	It is known as legacy class, because it is present since JDK 1.0 version.
	It follows dynamic array data structures.
	Objects of vectors are stored in continuous block of memory.


Stack: 
	It is a subclass of Vector.
	It is an implementaion of class List.
	It is present inside java.util package.
	it is present since JDK 1.0 version
	hence it is also known as legacy class.
	It follows First In Last Out/ Last In First Out insertion order.
	it is used to perform stack Operation.

To perform stack opeation we have multiple methods in stack class.
	1. push(Object obj):
						It is used to push object inside the stack.
						The return type is object.	
	2. peek():
				It is used to return top object of the stack.
				The return type is object.
				When our stack is empty and we try to use peek method then it will throw EmptyStackException.
	3. pop():
				It is used to return and remove the top element of the stack.
				The return type is object
				When our stack is empty and we try to use pop method then it will throw EmptyStackException.
	4. isEmpty():
				It is used to check wheather the stack is empty or not.
				return type is boolean.

*/
import java.util.*;
// public class Vectors{
// 	public static void main(String[] args) {
// 		List<String> v = new Vector<String>();
// 		v.add("ABC");
// 		v.add("DEF");
// 		v.add("fsefs");
// 		v.add("afds");
// 		System.out.println(v);
// 		System.out.println(v.size());

// 		for(int i=0;i<v.size();i++){
// 			System.out.println(v.get(i));
// 		}

// 		System.out.println("-----");
// 		Iterator<String> itr = v.iterator();
// 		while(itr.hasNext()) {
// 			System.out.println(itr.next());
// 		}




public class Vectors {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		System.out.println(s.empty());
		// System.out.println(s.peek());  // EmptyStackException
		// System.out.println(s.pop()); // EmptyStackException
		System.out.println(s.push(10));
		s.push(14);
		s.push(12);
		s.push(15);
		s.push(20);
		System.out.println(s);
		System.out.println(s.peek()); // will give 20
		System.out.println(s.pop()); // will remove 20
		System.out.println(s);
		System.out.println(s.empty());
	}
}