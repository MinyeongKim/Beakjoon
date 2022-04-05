package step2;
import java.util.Scanner;

public class Problem_2884 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		in.close();
		
		if(M>=45) {
			M = M-45;
			System.out.println(H + " " + M);
		} else if(H==0) {
			H = 23;
			M = M+15;
			System.out.println(H + " " + M);
		} else {
			H = H-1;
			M = M+15;
			System.out.println(H + " " + M);
		}
	}
}
