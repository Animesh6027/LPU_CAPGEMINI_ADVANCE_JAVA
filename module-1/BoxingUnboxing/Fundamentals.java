/*
Collection framework:
	It provides a mechanism to perform CRUD operation, searching operation and sorting operations on a group of objects.

Collection: 
	A group of objects store inside another object.

Framework:
	It has many inbuilt classes and Interfaces.

Iterable:
	Collection: It extends Iterable interface.
		List: It has 3 implementing classes and extends Collection interface
			ArrayList
			LinkedList
			Vector -> Stack

		Set: It has 3 implementing classes and extends Collection interface
			HashSet
			LinkedHashSet
			TreeSet

		Queue: It has 3 implementing classes and extends Collection interface
			ArrayDeque
			PriorityQueue
			LinkedList

	// Linked List Support multiple inheitance

List: 
	It is a interface.
	It is a sub interface of collection interface.
	It is present inside java.util package.
	List is a interface so we cannot create object of list but we can use as a reference variable.
	It can store different types of objects.
	It is dynamic in size.
	It maintains insertion order.
	It can store duplicate values.
	It allows null values.
	It maintains index based access and index value start from 0.
	It has random access of elements.

	add(object obj):
		It is used to add object inside the list.
		Return type: boolean

	size():
		It is used to return size or length of the list.
		Return type: int

	get(int index):
		It is used to get object present at specified index.
		Return type: Object

	addAll();
		It is add Collections in list.
		Return type: boolean

	add(int index, object obj):
		It is used to add whole Collection at specified index.
		Return type: void

	remove(int index):
		It is used to remove object present at specified index.
		Return type: Object

	remove(object obj):
		It is used to remove specified object from the list.
		If we have duplicate objects then it removes first occurrence of that object.
		Return type: boolean

	removeAll(collection c):
		It is used to remove whole collection from the list.
		Return type: boolean

	clear():
		It is used to remove all objects from the list.
		Return type: void

	contains(object obj):
		It is used to check whether specified object is present in the list or not.
		Return type: boolean

	containsAll(collection c):
		It is used to check whether whole collection is present in the list or not.
		Return type: boolean

	

Inbuilt non static methods of ArrayList:
	1. To add an object:
		add(object)
		addAll(collection)
		add(int index, object)
		addAll(int index, collection)

	2. To remove an object:
		remove(object)
		remove(int index)
		removeAll(collection)
		clear()
	
	3. To search an object:
		contains(object)
		containsAll(collection)

	4. To access object:
		get(int index)
		iterator()
		listIterator()
		for each loop

	


	In all the classes of collection heirarchy toString() , hashCode() and equals() method are already overridden. 
	In java we have two types of collections:
		1. Generic Collection
			In this collection we can store only same type of objects.
			For that we use <> angular brackets.
			Inside angular brackets we have to mention non primitive data type.
			Ex: List<Integer> al = new ArrayList<Integer>();
		2. Non Generic Collection
*/

// import java.util.List;
// import java.util.ArrayList;

// public class Fundamentals{
// 	public static void main(String[] args) {
// 		List al = new ArrayList();
// 		al.add(10);
// 		al.add(10.5);
// 		al.add('a');
// 		al.add("Hello");
// 		al.add(false);
// 		System.out.println(al);
// 		System.out.println(al.size());
// 		al.add(15);
// 		System.out.println(al);
// 		System.out.println(al.size());
// 		al.add("Hello");
// 		al.add('a');
// 		System.out.println(al);
// 		System.out.println(al.get(1));
// 		al.add(null);
// 		System.out.println(al);


// 	}
// }


import java.util.ArrayList;
import java.util.List;

public class Fundamentals {
	public static void main(String[] args) {
		List<String> pb = new ArrayList<String>();
		pb.add("Sarso da saag");
		pb.add("Chole bhature");
		pb.add("Butter Chicken");
		pb.add("Lassi");
		System.out.println("PB: "+ pb );
		List<String> up= new ArrayList<String>();
		up.add("Litti chokha");
		up.add("Dal chawal");
		up.add("Sattu");
		System.out.println("UP: "+ up);
		List<String> south = new ArrayList<String>();
		south.add("Dosa");
		south.add("Idli");
		south.add("Sambhar");
		south.add("Chutney chutney");
		south.add("Biryani");
		System.out.println("SOUTH: "+ south);
		
		List<String> lpu = new ArrayList<String>();
		lpu.addAll(south);
		lpu.addAll(pb);
		System.out.println("LPU: "+ lpu);
		lpu.addAll(4, up);
		System.out.println("LPU: "+ lpu);
		
		lpu.remove("Idli");
		System.out.println("LPU: "+ lpu);
		
		System.out.println(south.contains("Idli"));
		System.out.println(lpu.contains("Idli"));
		
		System.out.println(pb.remove(0));
		System.out.println("PB: "+ pb);
		
		System.out.println(lpu.containsAll(pb));
		
		System.out.println(lpu.containsAll(south));
		
		System.out.println(lpu.removeAll(south));
		System.out.println("LPU: "+ lpu);
		lpu.clear();
		System.out.println("LPU: "+ lpu);
		System.out.println(lpu.removeAll(south));
	
	}
}


























