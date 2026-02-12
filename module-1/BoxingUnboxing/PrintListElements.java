//WAJP to print all the elements of list one by one using get method.
import java.util.ArrayList; 
import java.util.List;
public class PrintListElements {
	public static void main(String[] args) {
		List<String> ele = new ArrayList<String>();
		ele.add("Apple");
		ele.add("Mango");
		ele.add("Banana");
		ele.add("Watermelon");

		for(int i=0;i<ele.size();i++){
			System.out.println("Elements of list: " + ele.get(i));
		}
	}
}