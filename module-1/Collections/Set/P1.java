/*
1. Remove Duplicates
	Given an array of integers, remove duplicate elements using HashSet and print unique values.
*/

import java.util.HashSet;
public class P1{
	public static void main(String[] args) {
		int arr[] = {1,26,5,7,5,9,5,2,6};
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr){
			set.add(i);
		}

		System.out.print("Unique: ");
		for(int i : set){
			System.out.print(i + " ");
		}
	}
}