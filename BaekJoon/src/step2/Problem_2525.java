package step2;
import java.util.Scanner;

public class Problem_2525 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		B = B+C;
		
		if(B>=60) {
			A = A+(B/60);
			B = B%60;
			if(A>=24) {
				A = A%24;
			}
			System.out.println(A + " " + B);
		} else {
			System.out.println(A + " " + B);
		}
	}
}
