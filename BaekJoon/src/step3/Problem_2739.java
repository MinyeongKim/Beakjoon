package step3;
import java.util.Scanner;

public class Problem_2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		for(int i=1; i<10;i++) {
			System.out.println(N + " * " + i + " = " + (N*i));
		}
	}

}
