import java.util.*;
class ClockMovement {
	public static int ClockProblem(int input1, int input2) {
		int move=input1 * input2;
		int res = move%12;
		if(res==0){
			return 12;
		}else{
			return res;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int finalPosition = ClockProblem(input1, input2);
		System.out.println("Final Position is: " + finalPosition);
	}
}