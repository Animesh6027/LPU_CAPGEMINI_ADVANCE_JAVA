/*7. Difference of Sets
	Find elements present in Set A but not in Set B.*/

import java.util.HashSet;
import java.util.Set;
public class P7 {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.add(1);
		a.add(3);
		a.add(5);

		Set<Integer> b = new HashSet<>();
		b.add(4);
		b.add(6);
		b.add(5);

		Set<Integer> c = new HashSet<>();
		c.add(1);
		c.add(2);
		c.add(5);
		c.add(6);
		c.add(9);
		c.add(11);

		Set<Integer> p = new HashSet<>(c);
		p.retainAll(a);

		System.out.println(p);
	}
}