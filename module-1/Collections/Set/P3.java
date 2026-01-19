/*
3. Common Elements
	Find common elements between two integer arrays using HashSet.
	*/

import java.util.HashSet;
public class P3 {
	public static void main(String[] args) {
		int arr1[] = {1,5,3,65,8,4,56,85};
		int arr2[] = {1,5,3,68,2,4,6,28,9};
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr1){
			set.add(i);
		}
		System.out.println("Common Elements: ");
		for(int i : arr2){
			if(set.contains(i)){
				System.out.print(i + " ");
			}
		}
	}
}