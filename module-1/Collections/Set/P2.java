/*2. Count Unique Elements
	Write a program to count the number of unique characters in a given string using Set.
*/

import java.util.*;
public class P2 {
	public static void main(String[] args) {
		String str = "adfkbfsdbhbnbfhsnhsebk";
		Set<Character> s = new HashSet<>();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			s.add(c);
		}
		System.out.println("Size is: " + s.size());
	}
}