//WAJP to handle ClassCastException

public class ClassCast{
	public static void main(String[] args) {
		try {
			Object obj = "Hello";
			Integer i = (Integer) obj;
		}
		catch(ClassCastException ce){
			// ce.printStackTrace();
			System.out.println(ce +"Handled..");
		}
	}
}