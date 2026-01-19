public class StaticProgram {

	static int x = 5;
	static int y;

	static {
		System.out.println("SB-1 Start");
		y = x++ + ++x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-1 End");
	}

	static {
		System.out.println("SB-2 Start");
		x = y-- - --x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-2 End");
	}

	public static void calculate(int x) {
		System.out.println("SM-1 Start");
		int y = x++ + ++StaticProgram.x;
		System.out.println("local x = " + x);
		System.out.println("local y = " + y);
		StaticProgram.y = y + x;
		System.out.println("static y = " + StaticProgram.y);
		System.out.println("SM-1 End");
	}

	public static int process() {
		System.out.println("SM-2 Start");
		int x = StaticProgram.x + y++;
		StaticProgram.x = x - --y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SM-2 End");
		return x;
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		calculate(x++);
		int result = process();
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Main End");
	}
}
