package step3;
import java.util.Scanner;

public class Problem_10952 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			int A = in.nextInt();
			int B = in.nextInt();
			
			if(A==0 && B==0) {
				flag = false;
			}else {
				System.out.println(A+B);
			}
		}
		in.close();
	}
}
