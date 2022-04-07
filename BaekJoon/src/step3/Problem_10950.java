package step3;
import java.util.Scanner;

public class Problem_10950 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i = 0; i<T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
		in.close();
	}
}
