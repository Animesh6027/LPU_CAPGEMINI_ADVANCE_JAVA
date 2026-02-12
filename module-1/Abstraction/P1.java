// WAJP to achieve multiple inheritance.

interface Father {
	void parent1();
}

interface Mother {
	void parent2();
}

class Son implements Father, Mother {
	@Override
	public void parent1(){
		System.out.println("Father");
	}
	@Override 
	public void parent2(){
		System.out.println("Mother");
	}
}

public class P1{
	public static void main(String[] args) {
		// Son s = new Son();
		// s.parent1();
		// s.parent2();

		Father f = new Son();
		f.parent1();
		Mother m = new Son();
		m.parent2();
	}
}