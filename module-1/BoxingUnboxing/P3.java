/*
Write a Java program that performs the following using an ArrayList of integers:
- Add the following numbers to the list: 10, 5, 20, 15, 25.
- Insert the number 12 at index 2.
- Print all elements of the list.
- Check if the number 15 exists in the list and print an appropriate message.
- Sort the list in ascending order.
- Remove the number 5 from the list.
- Print the final list and its size.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P3{
    public static void main(String[] args){
        List<Integer> num =  new ArrayList<Integer>();
        num.add(10);
        num.add(5);
        num.add(20);
        num.add(15);
        num.add(25);
        num.add(2, 12);
        System.out.println("Numbers: " + num);
        if(num.contains(15)){
            System.out.println("Number 15 is present");
        }else{
            System.out.println("Number 15 is not present");
        }
        Collections.sort(num);
        System.out.println("Number: " + num);

        num.remove(0);
        System.out.println("Number: " + num);

        System.out.println("Size: " + num.size());


        
    }
}
