/*
Write a Java program that performs the following operations on an ArrayList of Strings:
- Create an ArrayList named cities.
- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
- Insert the city "Bangalore" at index 2.
- Display all the cities in the list.
- Check whether the city "Mumbai" exists in the list and print a message:
	If found, print: "Mumbai is present in the list."
	Otherwise, print: "Mumbai is not present in the list."
- Sort the list of cities in alphabetical order and display the sorted list.
- Clear the list and print the final size of the ArrayList.
*/

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;
public class P2 {
	public static void main(String[] args) {
		List<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Kolkata");

		city.add(2, "Banglore");
		System.out.println("City: " + city);

		if(city.contains("Mumbai")){
			System.out.println("Mumbai is present in the list");
		}else{
			System.out.println("Mumbai is not present in the list");
		}

		Collections.sort(city);
		System.out.println("Sorted City: " + city);

		city.clear();
		System.out.println(city.size());
	}
}