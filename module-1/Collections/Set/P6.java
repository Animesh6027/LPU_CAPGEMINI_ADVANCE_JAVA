/*6. Intersection of Two Sets
	Find the intersection of two sets using retainAll().*/

import java.util.HashSet;
import java.util.Set;
public class P6 {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(4);
		s1.add(3);

		Set<Integer> s2 = new HashSet<>();
		s2.add(4);
		s2.add(2);
		s2.add(6);

		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(intersection);
	}
}