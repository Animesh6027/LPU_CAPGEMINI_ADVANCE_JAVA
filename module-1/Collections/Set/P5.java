/*5. Union of Two Sets
	Find the union of two sets using Set methods.*/
import java.util.Set;
import java.util.HashSet;
public class P5 {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(5);
		s1.add(3);

		Set<Integer> s2 = new HashSet<>();
		s2.add(4);
		s2.add(2);
		s2.add(6);

		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(union);
	}
}