/*
TreeSet: 
	It is an implementation class of NavigableSet interface
	It is present inside java.util package;
	It was introduced in JDK 1.2
	It follows sorted order(ascending order by default)
	It does not follow insertion order
	It does not allow duplicate elements
	It does not allow null elements
	It can store only same types of objects
	It is used when sorted data with uniqueness is required
*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFundamentals {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		ts.add("Hello");
		ts.add("Hi");
		ts.add("GM");
		ts.add("TTYL");
		ts.add("Bye");
		System.out.println("ASC: " + ts);
		TreeSet<String> dts = (TreeSet) ts;
		System.out.println("DESC: " + dts.descendingSet());
	}
}