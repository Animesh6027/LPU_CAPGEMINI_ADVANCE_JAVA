//WAJP to handle NullPointerException
import java.util.*;
public class NullPointer{
	public static void main(String[] args) {
		String s  = null;
		
		try {
			s.length();
		}
		catch(NullPointerException n)
		{
			n.printStackTrace();
			System.out.println("Handled...");
		}
	}
}