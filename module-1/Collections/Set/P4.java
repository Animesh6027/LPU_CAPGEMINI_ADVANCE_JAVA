/*
4. Check Element Presence
	Check whether a given element exists in a Set.
*/
import java.util.HashSet;
import java.util.Set;
public class P4 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Apple");
		s.add("Banana");
		s.add("Orange");
		s.add("Mango");
		System.out.println(s);
		System.out.println(s.contains("Kiwi"));
		System.out.println(s.contains("Mango"));
	}
}